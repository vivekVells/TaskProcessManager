package corp.tech.vivek.processmonitor.cpu_info.cpu_endpoint;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
public interface CpuInfoRepository extends JpaRepository<CpuInfoModel, Long> { }
