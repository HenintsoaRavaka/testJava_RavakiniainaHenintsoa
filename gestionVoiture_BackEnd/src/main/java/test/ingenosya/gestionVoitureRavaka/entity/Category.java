package test.ingenosya.gestionVoitureRavaka.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;

    private String description;

    @JsonIgnore
    @OneToMany(mappedBy="category", fetch = FetchType.LAZY)
    private Set<Brand> brands = new HashSet<Brand>();
}
