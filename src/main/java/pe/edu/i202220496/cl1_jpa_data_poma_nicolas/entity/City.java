package pe.edu.i202220496.cl1_jpa_data_poma_nicolas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "country_code")
    private String countryCode;

    private String district;

    private Long population;

    @ManyToOne
    @JoinColumn(name = "country_code", insertable = false, updatable = false)
    private Country country;

    public boolean getName() {
    }
}
