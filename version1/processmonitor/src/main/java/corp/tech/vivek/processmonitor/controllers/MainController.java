package corp.tech.vivek.processmonitor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@Controller
public class MainController {
    @GetMapping("/")
    public String defaultHomePage() {
        return "homepage";
    }

    @GetMapping("/testresponse")
    public String homePage() {
        return "teststaticwebresponse";
    }
}
