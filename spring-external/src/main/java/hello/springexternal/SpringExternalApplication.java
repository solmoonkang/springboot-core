package hello.springexternal;

import hello.springexternal.config.MyDataSourceConfigV3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(MyDataSourceConfigV3.class)
@SpringBootApplication(scanBasePackages = "hello.springexternal.datasource")
public class SpringExternalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringExternalApplication.class, args);
    }

}
