package bean;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userr")
    private List<Preorder> preorderr;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userReview")
    private List<Review> newReview;
    @Column(name = "user_name")
    private String name;
    @Column(name = "login")
    private String login;
    @Column(name = "pass")
    private String pass;
    @Column(name = "email")
    private String email;
    @Column(name = "user_role")
    private String role;
    @Column(name = "points")
    private int points;
    @Column(name = "ban")
    private boolean ban;

    public Users(int id, List<Preorder> preorderr, List<Review> newReview, String name, String login, String pass, String email, String role, int points, boolean ban) {
        this.id = id;
        this.preorderr = preorderr;
        this.newReview = newReview;
        this.name = name;
        this.login = login;
        this.pass = pass;
        this.email = email;
        this.role = role;
        this.points = points;
        this.ban = ban;
    }

    public Users() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Preorder> getPreorderr() {
        return preorderr;
    }

    public void setPreorderr(List<Preorder> preorderr) {
        this.preorderr = preorderr;
    }

    public List<Review> getNewReview() {
        return newReview;
    }

    public void setNewReview(List<Review> newReview) {
        this.newReview = newReview;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isBan() {
        return ban;
    }

    public void setBan(boolean ban) {
        this.ban = ban;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", preorderr=" + preorderr +
                ", newReview=" + newReview +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", points=" + points +
                ", ban=" + ban +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id == users.id && points == users.points && ban == users.ban && Objects.equals(preorderr, users.preorderr) && Objects.equals(newReview, users.newReview) && Objects.equals(name, users.name) && Objects.equals(login, users.login) && Objects.equals(pass, users.pass) && Objects.equals(email, users.email) && Objects.equals(role, users.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, preorderr, newReview, name, login, pass, email, role, points, ban);
    }
}



