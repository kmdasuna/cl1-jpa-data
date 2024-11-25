package pe.edu.i202220496.cl1_jpa_data_poma_nicolas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202220496.cl1_jpa_data_poma_nicolas.entity.City;
import pe.edu.i202220496.cl1_jpa_data_poma_nicolas.entity.Country;
import pe.edu.i202220496.cl1_jpa_data_poma_nicolas.repository.CityRepository;
import pe.edu.i202220496.cl1_jpa_data_poma_nicolas.repository.CountryRepository;
import pe.edu.i202220496.cl1_jpa_data_poma_nicolas.repository.LanguageCountryRepository;

import java.util.List;

@SpringBootApplication
public class Cl1JpaDataPomaNicolasApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private LanguageCountryRepository languageCountryRepository;

	@Override
	public void run(String... args) throws Exception {
		// Buscar el país "ARG"
		Country argentina = countryRepository.findById("ARG").orElse(null);

		// Usar ifPresentOrElse() para imprimir los lenguajes
		if (argentina != null) {
			System.out.println("Lenguajes hablados en Argentina:");
			argentina.getLanguages().forEach(language -> System.out.println(language.getName()));
		} else {
			System.out.println("Argentina no encontrada. Imprimiendo lenguajes de Perú...");
			Country peru = countryRepository.findById("PER").orElse(null);
			if (peru != null) {
				peru.getLanguages().forEach(language -> System.out.println(language.getName()));
			}
		}

		// Eliminar países "COL" y "ARG" con eliminación en cascada
		countryRepository.deleteAllById(List.of("COL", "ARG"));
		System.out.println("Países COL y ARG eliminados con éxito.");
	}
}
