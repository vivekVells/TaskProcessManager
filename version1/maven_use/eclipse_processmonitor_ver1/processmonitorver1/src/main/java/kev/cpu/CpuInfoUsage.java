/**
 * cpu package will be the service for all cpu related info
 */
package kev.cpu;

import org.hyperic.sigar.cmd.Shell;
import org.hyperic.sigar.cmd.SigarCommandBase;
import java.util.HashMap;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.SigarLoader;
import org.hyperic.sigar.SigarException;
import kev.utility.UtilityPack;

/**
 * @author Vivek
 * 
 * CpuInfo class will pull all cpu related info from system
 *
 */
public class CpuInfoUsage extends SigarCommandBase{
    
    public CpuInfoUsage(Shell shell) {
        super(shell);
    }

    public CpuInfoUsage() {
        super();
    }
    
    /**
     * Get CpuInfoUsage class object
     * 
     * @return creates & returns newly created cpu info usage object
     */
    public CpuInfoUsage getCpuInfoUsageObject() {
    	return new CpuInfoUsage();
    }    
       
    /**
     * Retrieve all possible usage info of requested CPU core 
     * 
     * @param cpu
     * @return mapped key-value of usage type
     * @throws InterruptedException
     */
    public HashMap<String, Object> retrieveCpuPerc(CpuPerc cpu) throws InterruptedException {
    	HashMap<String, Object> retrieveCpuPercMap = new HashMap<String, Object>();

        retrieveCpuPercMap.put("user time", UtilityPack.getFormattedDecimal((cpu.getUser()*100), 1)); 
        retrieveCpuPercMap.put("sys time", UtilityPack.getFormattedDecimal((cpu.getSys()*100), 1));
        retrieveCpuPercMap.put("idle time", UtilityPack.getFormattedDecimal((cpu.getIdle()*100), 1));
        retrieveCpuPercMap.put("wait time", UtilityPack.getFormattedDecimal((cpu.getWait()*100), 1));
        retrieveCpuPercMap.put("nice time", UtilityPack.getFormattedDecimal((cpu.getNice()*100), 1));
        retrieveCpuPercMap.put("combined", UtilityPack.getFormattedDecimal((cpu.getCombined()*100), 1));
        retrieveCpuPercMap.put("irq time", UtilityPack.getFormattedDecimal((cpu.getIrq()*100), 1));
        
        if (SigarLoader.IS_LINUX) {
            retrieveCpuPercMap.put("soft irq time", CpuPerc.format(cpu.getSoftIrq()));
            retrieveCpuPercMap.put("stolen time", CpuPerc.format(cpu.getStolen()));
        }
         
        return retrieveCpuPercMap;
    }
    
    /**
     * Individual CPU core usage
     * 
     * @return mapped key-value of individual CPU core usage
     * @throws SigarException
     * @throws InterruptedException
     */
    public HashMap<Integer, HashMap<String, Object>> getIndividualCpuUsageInfo() throws SigarException, InterruptedException {
        CpuPerc[] cpus = this.sigar.getCpuPercList();
        HashMap<Integer, HashMap<String, Object>> individualCpuUsageInfoMap 
          = new HashMap<Integer, HashMap<String, Object>>();
        
        for (int i=0; i<cpus.length; i++) {
            individualCpuUsageInfoMap.put(i, retrieveCpuPerc(cpus[i]));
            Thread.sleep(500);
        }    	
        
        return individualCpuUsageInfoMap;
    }
    
    /**
     * Total avail CPU usage in the machine
     * 
     * @return mapped key-value of total CPU usage in the machine
     * @throws SigarException
     * @throws InterruptedException
     */
    public HashMap<String, Object> getTotalCpuUsageInfo() throws SigarException, InterruptedException {
        return retrieveCpuPerc(this.sigar.getCpuPerc());    	
    }
    
    /**
     * CPU related information available in given machine
     * 
     * @return possible cpu related info
     * @throws SigarException
     */
    public HashMap<String, Object> getCpuMachineInfo() throws SigarException {
    	HashMap<String, Object> getCpuMachineInfoMap = new HashMap<String, Object>();    	
        org.hyperic.sigar.CpuInfo info = this.sigar.getCpuInfoList()[0];

        getCpuMachineInfoMap.put("vendor", info.getVendor());
        getCpuMachineInfoMap.put("model", info.getModel());
        getCpuMachineInfoMap.put("operating at", info.getMhz());
        getCpuMachineInfoMap.put("total cores", info.getTotalCores());
        
        if ((info.getTotalCores() != info.getTotalSockets()) 
        		|| (info.getCoresPerSocket() > info.getTotalCores())) {
        	getCpuMachineInfoMap.put("total sockets", info.getTotalSockets());
        	getCpuMachineInfoMap.put("cores per socket", info.getCoresPerSocket());
        }
        
        return getCpuMachineInfoMap;
    }
    
    /**
     * Desired info of CPU - searchable by keyword
     * 
     * @param cpuArg
     * @return matched keywords cpu info
     * @throws SigarException
     */
    public Object getCpuMachineInfoBy(String cpuArg) throws SigarException {
    	HashMap<String, Object> cpuMachineInfoMap = getCpuMachineInfo();
    	
    	return cpuMachineInfoMap.get(cpuArg);
    }
    
    /**
     * Main entry point of the program
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
//        CpuInfoUsage cpuObj = new CpuInfoUsage();        
//        System.out.println("CPU info on machine: " + cpuObj.getCpuMachineInfo().values());
//        System.out.println("Total CPU usage: " + cpuObj.getTotalCpuUsageInfo().values());
//        System.out.println("individual cpu usage info: " + cpuObj.getIndividualCpuUsageInfo().values());        
    }

	@Override
	public void output(String[] arg0) throws SigarException {}
}

/**
 Notes:
   HashMap 
     helps to store & retrieve different data types
     retrieveValueBy("<key>") helps to retrieve any value of the desired key which is very easier
     easy to retrive desired entry and store in the db
     since unsynchronized, delay intentionally used to avoid the race conditions 
   BigDecimal
     used for handling precise values; seems double or float have some issues when used for handling precise values

Program Output:
CPU info on machine: [Intel, 4, 16, Core(TM) i5-4210U CPU @ 1.70GHz, 2394, 4]
Total CPU usage: [99.2, 0.0, 0.8, 0.8, 0.0, 0.0, 0.0]
individual cpu usage info: [{idle time=68.8, wait time=0.0, user time=18.8, combined=31.2, irq time=0.0, nice time=0.0, sys time=12.4}, {idle time=68.7, wait time=0.0, user time=28.1, combined=31.3, irq time=0.0, nice time=0.0, sys time=3.2}, {idle time=56.5, wait time=0.0, user time=34.3, combined=43.5, irq time=0.0, nice time=0.0, sys time=9.2}, {idle time=81.4, wait time=0.0, user time=12.4, combined=18.6, irq time=0.0, nice time=0.0, sys time=6.2}]
 */
