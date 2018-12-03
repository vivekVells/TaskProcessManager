package corp.tech.vivek.processmonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@SpringBootApplication
@EnableScheduling
@EnableSwagger2
public class ProcessmonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessmonitorApplication.class, args);
	}
}
