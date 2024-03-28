package hello.springactuator;

import hello.springactuator.order.gauge.StockConfigV2;
import hello.springactuator.order.v4.OrderConfigV4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Import({OrderConfigV4.class, StockConfigV2.class})
@SpringBootApplication(scanBasePackages = "hello.springactuator.controller")
public class SpringActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActuatorApplication.class, args);
	}

	@Bean
	public InMemoryHttpExchangeRepository inMemoryHttpExchangeRepository() {
		return new InMemoryHttpExchangeRepository();
	}
}
