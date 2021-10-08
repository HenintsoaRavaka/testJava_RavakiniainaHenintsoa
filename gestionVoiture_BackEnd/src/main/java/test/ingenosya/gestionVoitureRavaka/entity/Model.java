package test.ingenosya.gestionVoitureRavaka.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Model")
@Data
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;

    @ManyToOne
    @JoinColumn(name="brandId", nullable=false)
    private Brand brand;

    @JsonIgnore
    @OneToMany(mappedBy="model", fetch = FetchType.LAZY)
    private Set<Car> cars = new HashSet<Car>();
}
