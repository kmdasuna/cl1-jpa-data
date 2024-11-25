package pe.edu.i202220496.cl1_jpa_data_poma_nicolas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class LanguageCountry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String language;

    private boolean isOfficial;

    private double percentage;

    @ManyToOne
    @JoinColumn(name = "country_code")
    private Country country;
}