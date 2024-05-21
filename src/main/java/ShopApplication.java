import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@ComponentScan({"com.santana.model", "com.santana.dto", "com.santana.controller"})
@EntityScan(basePackages = {"com.santana.model", "com.santana.dto"})
public class ShopApplication {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ShopApplication.class, args);
	}

}
