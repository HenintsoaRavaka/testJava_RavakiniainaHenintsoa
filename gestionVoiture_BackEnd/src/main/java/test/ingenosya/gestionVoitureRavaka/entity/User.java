package test.ingenosya.gestionVoitureRavaka.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "User")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "firstName")
    private String firstName;

    private String address;

    private String contact;

    private String email;

    private String password;

    @JsonIgnore
    @OneToMany(mappedBy="user")
    private Set<Car> cars = new HashSet<Car>();

    @ManyToOne
    @JoinColumn(name="roleId", nullable=false)
    private Role role;
}
