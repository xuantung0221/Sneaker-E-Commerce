package E_commerce.Sneaker.model.Role;

import E_commerce.Sneaker.model.User.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Entity
@Getter
@Setter
@Table(name="roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    Long id;

    String name;

    @OneToMany(mappedBy = "roles")
    Collection<User> users;

}