package th.ac.ku.kps.eng.cpe.soa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class Test {
	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
	}

}
