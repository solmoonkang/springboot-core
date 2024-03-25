package hello.springexternal;

import hello.springexternal.config.MyDataSourceValueConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(MyDataSourceValueConfig.class)
@SpringBootApplication(scanBasePackages = "hello.springexternal.datasource")
public class SpringExternalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringExternalApplication.class, args);
    }

}
