package corp.tech.vivek.processmonitor.cpu_info.cpu_endpoint;

import corp.tech.vivek.processmonitor.cpu_info.CpuInfoUsageBase;
import org.hyperic.sigar.SigarException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CpuInfoService {
    @Autowired
    CpuInfoRepository cpuInfoRepository;

    public List<CpuInfoModel> getCpuDeviceInfo() {
        List<CpuInfoModel> cpuInfoModelList = new ArrayList<>();

        return cpuInfoModelList;
    }

    public List<CpuInfoModel> getCpuTotalUsage() {
        List<CpuInfoModel> cpuInfoModelList = new ArrayList<>();

        return cpuInfoModelList;
    }
}
