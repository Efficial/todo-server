package francis.emmanuel.todoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TodoServerApplication {


	public static void main(String[] args) {
		SpringApplication.run(TodoServerApplication.class, args);
	}

}
