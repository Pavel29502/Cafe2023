package bean;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users userReview;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "preorder_id")
    private Preorder preorderId;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Preorder> preorderIdd;
    @Column(name = "review")
    private String review;

    public Review(int id, Preorder preorderId, Users userReview, List<Preorder> preorderIdd, String review) {
        this.id = id;
        this.preorderId = preorderId;
        this.userReview = userReview;
        this.preorderIdd = preorderIdd;
        this.review = review;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Preorder getPreorderId() {
        return preorderId;
    }

    public void setPreorderId(Preorder preorderId) {
        this.preorderId = preorderId;
    }

    public Users getUserReview() {
        return userReview;
    }

    public void setUserReview(Users userReview) {
        this.userReview = userReview;
    }

    public List<Preorder> getPreorderIdd() {
        return preorderIdd;
    }

    public void setPreorderIdd(List<Preorder> preorderIdd) {
        this.preorderIdd = preorderIdd;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", preorderId=" + preorderId +
                ", userReview=" + userReview +
                ", preorderIdd=" + preorderIdd +
                ", review='" + review + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review1 = (Review) o;
        return id == review1.id && Objects.equals(preorderId, review1.preorderId) && Objects.equals(userReview, review1.userReview) && Objects.equals(preorderIdd, review1.preorderIdd) && Objects.equals(review, review1.review);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, preorderId, userReview, preorderIdd, review);
    }
}


