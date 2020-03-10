package ci.parkmoi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import ci.parkmoi.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class ParkmoiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkmoiApplication.class, args);
	}

}
