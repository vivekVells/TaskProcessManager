/**
 * 
 */
package metrics;

import org.hyperic.sigar;



/**
 * @author Vivek
 *
 */
private void collectMetrics() {
	logger.debug("Collecting metrics...");
	try
	{
		//get process CPU usage
		ProcCpu procCpu = sigar.getProcCpu(pid);

		//get process memory usage
		ProcMem procMem = sigar.getProcMem(pid);

		// get network interface stats
		NetInterfaceStat netStat = sigar.getNetInterfaceStat(interfaceName);

		ProcessMetrics measurement = new ProcessMetrics(procCpu.getPercent(),
				procMem.getSize(), procMem.getResident(), procMem.getPageFaults(),
				interfaceName, netStat.getRxBytes(), netStat.getTxBytes());

		metrics.add(measurement);

	} catch(SigarException ex)
	{
		logger.error(ex.getMessage(), ex);
	}
}
