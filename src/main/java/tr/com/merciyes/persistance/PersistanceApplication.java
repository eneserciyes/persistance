package tr.com.merciyes.persistance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PersistanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersistanceApplication.class, args);
    }

}
