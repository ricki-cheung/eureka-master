package eurekademo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gunnar Hillert
 *
 */
@SpringBootApplication
@EnableEurekaServer
@EnableConfigServer
@RestController
public class EurekaApplication {
	
	@Value("${spring.application.name}")
	String content;
	
	@RequestMapping("/home")
	public String home() {
		return "content is "+content;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaApplication.class, args);
	}

}
