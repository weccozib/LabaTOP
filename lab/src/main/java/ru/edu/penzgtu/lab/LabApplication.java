package ru.edu.penzgtu.lab;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(
		info = @Info(
				title = "PenzGTU Java Lab API",
				description = "API for labs", version = "1.0.0",
				contact = @Contact(
						name = "Lapin George",
						email = "georgy.lapin2005@gmail.com"
				)
		)

)

@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabApplication.class, args);
	}

}
