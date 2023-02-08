package bean;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "Menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "menuId")
    private List<PreorderInfo> preorderInf;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category categoryId;
    @Column(name = "title")
    private String title;
    @Column(name = "price")
    private int price;
    @Column(name = "points")
    private int points;

    public Menu(int id, String title, Category categoryId, int price, int points) {
        this.id = id;
        this.title = title;
        this.categoryId = categoryId;
        this.price = price;
        this.points = points;
    }

    public Menu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<PreorderInfo> getPreorderInf() {
        return preorderInf;
    }

    public void setPreorderInf(List<PreorderInfo> preorderInf) {
        this.preorderInf = preorderInf;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", preorderInf=" + preorderInf +
                ", categoryId=" + categoryId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", points=" + points +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return id == menu.id && price == menu.price && points == menu.points && Objects.equals(preorderInf, menu.preorderInf) && Objects.equals(categoryId, menu.categoryId) && Objects.equals(title, menu.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, preorderInf, categoryId, title, price, points);
    }
}
