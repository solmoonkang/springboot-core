package hello.springactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActuatorApplication.class, args);
	}

	@Bean
	public InMemoryHttpExchangeRepository inMemoryHttpExchangeRepository() {
		return new InMemoryHttpExchangeRepository();
	}
}
