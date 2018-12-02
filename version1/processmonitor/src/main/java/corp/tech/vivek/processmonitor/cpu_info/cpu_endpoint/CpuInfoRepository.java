package corp.tech.vivek.processmonitor.cpu_info.cpu_endpoint;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CpuInfoRepository extends JpaRepository<CpuInfoModel, Long> { }
