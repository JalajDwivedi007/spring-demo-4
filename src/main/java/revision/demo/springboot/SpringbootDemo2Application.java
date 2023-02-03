package revision.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringbootDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo2Application.class, args);
	}

}
