package lk.ijse.dep.rest.main;

import lk.ijse.dep.rest.repository.CustomerRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@Import(JpaConfig.class)
@EnableJpaRepositories("lk.ijse.dep.rest.repository")
public class WebRootConfig {
}
