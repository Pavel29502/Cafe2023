package bean;
//
import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Preorder_info")
public class PreorderInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id")
    private List<Menu> menuId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "preorder_id")
    private List<Preorder> preorderId;

    @Column(name = "review")
    private String review;

    public PreorderInfo(int id, List<Menu> menuId, List<Preorder> preorderId, String review) {
        this.id = id;
        this.menuId = menuId;
        this.preorderId = preorderId;
        this.review = review;
    }

    public PreorderInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Menu> getMenuId() {
        return menuId;
    }

    public void setMenuId(List<Menu> menuId) {
        this.menuId = menuId;
    }

    public List<Preorder> getPreorderId() {
        return preorderId;
    }

    public void setPreorderId(List<Preorder> preorderId) {
        this.preorderId = preorderId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "PreorderInfo{" +
                "id=" + id +
                ", menuId=" + menuId +
                ", preorderId=" + preorderId +
                ", review='" + review + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PreorderInfo that = (PreorderInfo) o;
        return id == that.id && Objects.equals(menuId, that.menuId) && Objects.equals(preorderId, that.preorderId) && Objects.equals(review, that.review);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, menuId, preorderId, review);
    }
}


