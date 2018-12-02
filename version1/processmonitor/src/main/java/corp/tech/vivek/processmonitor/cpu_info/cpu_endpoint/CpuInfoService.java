package corp.tech.vivek.processmonitor.cpu_info.cpu_endpoint;

import corp.tech.vivek.processmonitor.cpu_info.CpuInfoUsageBase;
import org.hyperic.sigar.SigarException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@Service
public class CpuInfoService {
    @Autowired
    CpuInfoRepository cpuInfoRepository;

    public CpuInfoModel pullRequiredCpuDeviceInfoData(CpuInfoModel cpuInfoModel) {
        CpuInfoUsageBase cpuInfoUsageBase = new CpuInfoUsageBase();

        // Device info
        try {
            cpuInfoModel.setCpuVendor(cpuInfoUsageBase.getCpuMachineVendorName());
            cpuInfoModel.setCpuModel(cpuInfoUsageBase.getCpuMachineModelName());
            cpuInfoModel.setCpuOperatingAt(cpuInfoUsageBase.getCpuMachineOperatingAt());
            cpuInfoModel.setCpuTotalCores(cpuInfoUsageBase.getCpuMachineTotalCores());
            cpuInfoModel.setCpuTotalSockets(cpuInfoUsageBase.getCpuMachineTotalSockets());
            cpuInfoModel.setCpuCoresPerSocket(cpuInfoUsageBase.getCpuMachineCoresPerSocket());
        } catch (SigarException e) {
            e.printStackTrace();
        }

        // Total cpu memory usage info
        try{
            Map<String, Object> mappedTotalCpuInfo = cpuInfoUsageBase.getTotalCpuUsageInfo();

            cpuInfoModel.setTotalIdleTime((Integer)mappedTotalCpuInfo.get("idle time"));
            cpuInfoModel.setTotalWaitTime((Integer)mappedTotalCpuInfo.get("wait time"));
            cpuInfoModel.setTotalUserTime((Integer)mappedTotalCpuInfo.get("user time"));
            cpuInfoModel.setTotalCombinedTime((Integer)mappedTotalCpuInfo.get("combined"));
            cpuInfoModel.setTotalIrqTime((Integer)mappedTotalCpuInfo.get("irq time"));
            cpuInfoModel.setTotalNiceTime((Integer)mappedTotalCpuInfo.get("nice time"));
            cpuInfoModel.setTotalSysTIme((Integer)mappedTotalCpuInfo.get("sys time"));
        } catch (SigarException | InterruptedException e) {
            e.printStackTrace();
        }

        return cpuInfoModel;
    }

    @PostConstruct
    public void loadCpuInfoData() {
        CpuInfoModel cpuInfoModel = new CpuInfoModel();

        cpuInfoRepository.save(pullRequiredCpuDeviceInfoData(cpuInfoModel));
    }

    public List<CpuInfoModel> getCpuDeviceInfo() {
        List<CpuInfoModel> cpuInfoModelList = new ArrayList<>();

        cpuInfoRepository.findAll().forEach(cpuInfo -> cpuInfoModelList.add(cpuInfo));
        return cpuInfoModelList;
    }

    public List<CpuInfoModel> getCpuTotalUsage() {
        List<CpuInfoModel> cpuInfoModelList = new ArrayList<>();

        return cpuInfoModelList;
    }
}
