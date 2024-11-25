package pe.edu.i202220496.cl1_jpa_data_poma_nicolas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Entity
@Getter
@Setter
public class Country {
    @Id
    private String code;

    private String name;

    private String continent;

    private String region;

    private double surfaceArea;

    private Integer independenceYear;

    private Long population;

    private String governmentForm;

    private String headOfState;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<City> cities;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<LanguageCountry> languages;

    public String getName() {
    }

    public Arrays getCities() {
    }

    public Iterable<Object> getLanguages() {
    }
}
