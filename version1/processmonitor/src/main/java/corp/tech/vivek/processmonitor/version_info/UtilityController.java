package corp.tech.vivek.processmonitor.version_info;

import org.hyperic.sigar.Sigar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vivek | vivekvellaiyappans@gmail.com
 */
@RestController
public class UtilityController {
    @GetMapping("/utility")
    public String sGetSigarObject() {
        return UtilityPackForVersion.getSigarObject().toString();
    }
}
