package pe.edu.i202220496.cl1_jpa_data_poma_nicolas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.i202220496.cl1_jpa_data_poma_nicolas.entity.City;
import pe.edu.i202220496.cl1_jpa_data_poma_nicolas.entity.LanguageCountry;

public interface LanguageCountryRepository extends JpaRepository<LanguageCountry, Long> {
}
