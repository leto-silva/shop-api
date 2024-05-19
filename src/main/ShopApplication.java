import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;


@SpringBootApplication
@ComponentScan
@Component
public class ShopApplication {

	public static void main(String[] args) {
		// Iniciar springboot
		
	    System.out.println("teste");
	    SpringApplication.run(ShopApplication.class, args);
	        

	}

}
