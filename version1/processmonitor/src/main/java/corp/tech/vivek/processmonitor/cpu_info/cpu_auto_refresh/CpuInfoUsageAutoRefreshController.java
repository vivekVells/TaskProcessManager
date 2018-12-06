package corp.tech.vivek.processmonitor.cpu_info.cpu_auto_refresh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@Controller
public class CpuInfoUsageAutoRefreshController {
    @GetMapping("/api/ajax/cpus/totalusage")
    public String getTotalCpuUsageInRealTime() {
        return "total_cpu_usage";
    }
}
