package corp.tech.vivek.processmonitor.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@RestController
public class Welcome {

    @GetMapping("/welcome")
    public String welcomeMsg() {
        return "Welcome to Spring Boot World! You going to rock on!!!";
    }
}
