package corp.tech.vivek.processmonitor.version_ajax_tryout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@Controller
public class AjaxController {

    // starting page for process monitor application
    @GetMapping("/monitor")
    public String ajaxDemo(Model model) {
        return "monitorProcess";
    }
}
