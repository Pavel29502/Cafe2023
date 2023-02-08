package bean;
//
import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "Preorder")
public class Preorder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @OneToOne(mappedBy = "preorderId")
    private Review preorderReview;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "preorderId")
    private List<PreorderInfo> preorderInfoo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users userr;
    @Column(name = "preorder_time") // заменю тип немного позже
    private int preorderTime;
    @Column(name = "preorder_sum")
    private int prorderSum;
    @Column(name = "preorder_type")
    private int preorderType;

    public Preorder(int id, Review preorderReview, List<PreorderInfo> preorderInfoo, Users userr, int preorderTime, int prorderSum, int preorderType) {
        this.id = id;
        this.preorderReview = preorderReview;
        this.preorderInfoo = preorderInfoo;
        this.userr = userr;
        this.preorderTime = preorderTime;
        this.prorderSum = prorderSum;
        this.preorderType = preorderType;
    }

    public Preorder() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Review getPreorderReview() {
        return preorderReview;
    }

    public void setPreorderReview(Review preorderReview) {
        this.preorderReview = preorderReview;
    }

    public List<PreorderInfo> getPreorderInfoo() {
        return preorderInfoo;
    }

    public void setPreorderInfoo(List<PreorderInfo> preorderInfoo) {
        this.preorderInfoo = preorderInfoo;
    }

    public Users getUserr() {
        return userr;
    }

    public void setUserr(Users userr) {
        this.userr = userr;
    }

    public int getPreorderTime() {
        return preorderTime;
    }

    public void setPreorderTime(int preorderTime) {
        this.preorderTime = preorderTime;
    }

    public int getProrderSum() {
        return prorderSum;
    }

    public void setProrderSum(int prorderSum) {
        this.prorderSum = prorderSum;
    }

    public int getPreorderType() {
        return preorderType;
    }

    public void setPreorderType(int preorderType) {
        this.preorderType = preorderType;
    }

    @Override
    public String toString() {
        return "Preorder{" +
                "id=" + id +
                ", preorderReview=" + preorderReview +
                ", preorderInfoo=" + preorderInfoo +
                ", userr=" + userr +
                ", preorderTime=" + preorderTime +
                ", prorderSum=" + prorderSum +
                ", preorderType=" + preorderType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Preorder preorder = (Preorder) o;
        return id == preorder.id && preorderTime == preorder.preorderTime && prorderSum == preorder.prorderSum && preorderType == preorder.preorderType && Objects.equals(preorderReview, preorder.preorderReview) && Objects.equals(preorderInfoo, preorder.preorderInfoo) && Objects.equals(userr, preorder.userr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, preorderReview, preorderInfoo, userr, preorderTime, prorderSum, preorderType);
    }
}




