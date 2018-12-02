package corp.tech.vivek.processmonitor.cpu_info.cpu_endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@RestController
public class CpuInfoController {
    @Autowired
    private CpuInfoService cpuInfoService;

    @GetMapping("/api/cpus/device-info")
    public List<CpuInfoModel> getCpuMachineInfo() {
        return cpuInfoService.getCpuDeviceInfo();
    }

    @GetMapping("/api/cpus/memory-usage")
    public List<CpuInfoModel> getCpuTotalMemoryUsage() {
        return cpuInfoService.getCpuTotalUsage();
    }
}
