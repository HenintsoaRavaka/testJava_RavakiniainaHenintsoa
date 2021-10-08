package test.ingenosya.gestionVoitureRavaka.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Brand")
@Data
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;

    @ManyToOne
    @JoinColumn(name="categoryId", nullable=false)
    private Category category;

    @JsonIgnore
    @OneToMany(mappedBy="brand", fetch = FetchType.LAZY)
    private Set<Model> models = new HashSet<Model>();
}
