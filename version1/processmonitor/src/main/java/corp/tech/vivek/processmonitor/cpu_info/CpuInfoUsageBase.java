/**
 * cpu package will be the service for all cpu related info
 */
package corp.tech.vivek.processmonitor.cpu_info;

import corp.tech.vivek.processmonitor.utility.UtilityPack;
import org.hyperic.sigar.cmd.Shell;
import org.hyperic.sigar.cmd.SigarCommandBase;
import java.util.HashMap;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.SigarLoader;
import org.hyperic.sigar.SigarException;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 *
 * CpuInfo class will pull all cpu related info from system
 *
 * File reference/headsup notes: TaskProcessManager\resource_house\reference\NotesHub\version1-maven_use-eclipse_processmonitor_ver1-processmonitorver1\thingsToRemember.txt
 */
public class CpuInfoUsageBase extends SigarCommandBase{

    public CpuInfoUsageBase(Shell shell) {
        super(shell);
    }

    public CpuInfoUsageBase() {
        super();
    }

    @Override
    public void output(String[] arg0) throws SigarException {}

    /**
     * Get CpuInfoUsageBase class object
     *
     * @return creates & returns newly created cpu info usage object
     */
    public CpuInfoUsageBase getCpuInfoUsageObject() {
        return new CpuInfoUsageBase();
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

        retrieveCpuPercMap.put("user time", (Integer)(int)Math.round(cpu.getUser() * 100));
        retrieveCpuPercMap.put("sys time", (Integer)(int)Math.round(cpu.getSys() * 100));
        retrieveCpuPercMap.put("idle time", (Integer)(int)Math.round(cpu.getIdle() * 100));
        retrieveCpuPercMap.put("wait time", (Integer)(int)Math.round(cpu.getWait() * 100));
        retrieveCpuPercMap.put("nice time", (Integer)(int)Math.round(cpu.getNice() * 100));
        retrieveCpuPercMap.put("combined", (Integer)(int)Math.round(cpu.getCombined() * 100));
        retrieveCpuPercMap.put("irq time", (Integer)(int)Math.round(cpu.getIrq() * 100));

        if (SigarLoader.IS_LINUX) {
            retrieveCpuPercMap.put("soft irq time", (Integer)(int)Math.round(cpu.getSoftIrq() * 100));
            retrieveCpuPercMap.put("stolen time", (Integer)(int)Math.round(cpu.getStolen() * 100));
        }

        return retrieveCpuPercMap;
    }

    /**
     * To get list object of all available CPUs percentage usage
     *
     * @return list object of all available CPUs percentage usage
     * @throws SigarException
     */
    public CpuPerc[] getCpuPercUsageListObject() throws SigarException {
        CpuPerc[] cpus = this.sigar.getCpuPercList();

        return cpus;
    }

    /**
     * To get total cpu percentage usage obj
     *
     * @return object of total cpu percentage usage
     * @throws SigarException
     */
    public CpuPerc getCpuPercTotalUsageObject() throws SigarException {
        return this.sigar.getCpuPerc();
    }

    /**
     * Individual CPU core usage
     *
     * @return mapped key-value of individual CPU core usage
     * @throws SigarException
     * @throws InterruptedException
     */
    public HashMap<Integer, HashMap<String, Object>> getIndividualCpuUsageInfo() throws SigarException, InterruptedException {
        CpuPerc[] cpus = getCpuPercUsageListObject();
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
        return retrieveCpuPerc(getCpuPercTotalUsageObject());
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

        getCpuMachineInfoMap.put("vendor", UtilityPack.getUnkownIfValueNotPresent(info.getVendor()));
        getCpuMachineInfoMap.put("model", UtilityPack.getUnkownIfValueNotPresent(info.getModel()));
        getCpuMachineInfoMap.put("operating at", info.getMhz());
        getCpuMachineInfoMap.put("total cores", info.getTotalCores());
        getCpuMachineInfoMap.put("total sockets", info.getTotalSockets());
        getCpuMachineInfoMap.put("cores per socket", info.getCoresPerSocket());

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
    public static void main(String[] args) throws Exception { }
}
