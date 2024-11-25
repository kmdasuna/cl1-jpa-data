package pe.edu.i202220496.cl1_jpa_data_poma_nicolas.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConexionesConfig {

    @Value("${DB_URL}")
    private String dbWorldUrl;

    @Value("${DB_USER}")
    private String dbWorldUser;

    @Value("${DB_PASS}")
    private String dbWorldPass;

    @Value("${DB_DRIVER}")
    private String dbWorldDriver;

    @Bean
    public HikariDataSource hikariDataSource() {
        // Crear objeto de configuración de HikariCP
        HikariConfig config = new HikariConfig();


        config.setJdbcUrl(dbWorldUrl);
        config.setUsername(dbWorldUser);
        config.setPassword(dbWorldPass);
        config.setDriverClassName(dbWorldDriver);


        config.setMaximumPoolSize(30);
        config.setMinimumIdle(4);
        config.setIdleTimeout(240000);
        config.setConnectionTimeout(45000);


        // Imprimir mensaje de configuración
        System.out.println("###### HikariCP configurado ######");

        // Devolver el DataSource configurado
        return new HikariDataSource(config);
    }
}
