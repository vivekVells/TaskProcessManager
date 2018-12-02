package corp.tech.vivek.processmonitor.cpu_info;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@RestController
public class CpuInfoUsageController {
    @GetMapping("/cpu")
    public Object sGetCpuMachineInfo() throws Exception {
        CpuInfoUsageBase cpuObj = new CpuInfoUsageBase();
        HashMap<String, Object> mappedCpuInfoUsage = new HashMap<>();

        mappedCpuInfoUsage.put("Cpu Machine Info", cpuObj.getCpuMachineInfo());
        mappedCpuInfoUsage.put("Total Cpu Usage Info", cpuObj.getTotalCpuUsageInfo());
        mappedCpuInfoUsage.put("Individual Cpu Usage Info", cpuObj.getIndividualCpuUsageInfo());

        return mappedCpuInfoUsage;
    }
}

/*
Output: JSON format output | when navigated to http://localhost:8080/cpu
{
  "Total Cpu Usage Info": {
    "idle time": 55,
    "wait time": 0,
    "user time": 37,
    "combined": 45,
    "irq time": 0,
    "nice time": 0,
    "sys time": 7
  },
  "Cpu Machine Info": {
    "operating at": 3408,
    "vendor": "Intel",
    "total cores": 4,
    "cores per socket": 16,
    "model": "Core(TM) i5-7500 CPU @ 3.40GHz",
    "total sockets": 4
  },
  "Individual Cpu Usage Info": {
    "0": {
      "idle time": 82,
      "wait time": 0,
      "user time": 12,
      "combined": 18,
      "irq time": 0,
      "nice time": 0,
      "sys time": 6
    },
    "1": {
      "idle time": 100,
      "wait time": 0,
      "user time": 0,
      "combined": 0,
      "irq time": 0,
      "nice time": 0,
      "sys time": 0
    },
    "2": {
      "idle time": 94,
      "wait time": 0,
      "user time": 3,
      "combined": 6,
      "irq time": 0,
      "nice time": 0,
      "sys time": 3
    },
    "3": {
      "idle time": 91,
      "wait time": 0,
      "user time": 9,
      "combined": 9,
      "irq time": 0,
      "nice time": 0,
      "sys time": 0
    }
  }
}
 */
