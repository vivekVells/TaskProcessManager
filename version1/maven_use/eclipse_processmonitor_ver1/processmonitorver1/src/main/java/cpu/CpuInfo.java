/**
 * cpu package will be the service for all cpu related info
 */
package cpu;

import org.hyperic.sigar.cmd.Shell;
import org.hyperic.sigar.cmd.SigarCommandBase;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarLoader;
import org.hyperic.sigar.SigarException;


/**
 * @author Vivek
 * 
 * CpuInfo class will pull all cpu related info from system
 *
 */
public class CpuInfo extends SigarCommandBase{
	
    public boolean displayTimes = true;
    
    public CpuInfo(Shell shell) {
        super(shell);
    }

    public CpuInfo() {
        super();
    }

    public String getUsageShort() {
        return "Display cpu information";
    }

    private void output(CpuPerc cpu) {
        println("User Time....." + CpuPerc.format(cpu.getUser()));
        println("Sys Time......" + CpuPerc.format(cpu.getSys()));
        println("Idle Time....." + CpuPerc.format(cpu.getIdle()));
        println("Wait Time....." + CpuPerc.format(cpu.getWait()));
        println("Nice Time....." + CpuPerc.format(cpu.getNice()));
        println("Combined......" + CpuPerc.format(cpu.getCombined()));
        println("Irq Time......" + CpuPerc.format(cpu.getIrq()));
        if (SigarLoader.IS_LINUX) {
            println("SoftIrq Time.." + CpuPerc.format(cpu.getSoftIrq()));
            println("Stolen Time...." + CpuPerc.format(cpu.getStolen()));
        }
        println("");
    }

    public void output(String[] args) throws SigarException {
        org.hyperic.sigar.CpuInfo[] infos =
            this.sigar.getCpuInfoList();

        CpuPerc[] cpus =
            this.sigar.getCpuPercList();

        org.hyperic.sigar.CpuInfo info = infos[0];
        long cacheSize = info.getCacheSize();
        println("Vendor........." + info.getVendor());
        println("Model.........." + info.getModel());
        println("Mhz............" + info.getMhz());
        println("Total CPUs....." + info.getTotalCores());
        if ((info.getTotalCores() != info.getTotalSockets()) ||
            (info.getCoresPerSocket() > info.getTotalCores()))
        {
            println("Physical CPUs.." + info.getTotalSockets());
            println("Cores per CPU.." + info.getCoresPerSocket());
        }

        if (cacheSize != Sigar.FIELD_NOTIMPL) {
            println("Cache size...." + cacheSize);
        }
        println("");

        if (!this.displayTimes) {
            return;
        }

        for (int i=0; i<cpus.length; i++) {
            println("CPU " + i + ".........");
            output(cpus[i]);
        }

        println("Totals........");
        output(this.sigar.getCpuPerc());
    }

    public static void main(String[] args) throws Exception {
        new CpuInfo().processCommand(args);
    }

}

/*
Output:
Vendor.........Intel
Model..........Core(TM) i5-4210U CPU @ 1.70GHz
Mhz............2394
Total CPUs.....4
Physical CPUs..4
Cores per CPU..16

CPU 0.........
User Time.....0.0%
Sys Time......6.0%
Idle Time.....93.9%
Wait Time.....0.0%
Nice Time.....0.0%
Combined......6.0%
Irq Time......0.0%

CPU 1.........
User Time.....3.1%
Sys Time......0.0%
Idle Time.....96.8%
Wait Time.....0.0%
Nice Time.....0.0%
Combined......3.1%
Irq Time......0.0%

CPU 2.........
User Time.....0.0%
Sys Time......6.0%
Idle Time.....93.9%
Wait Time.....0.0%
Nice Time.....0.0%
Combined......6.0%
Irq Time......0.0%

CPU 3.........
User Time.....0.0%
Sys Time......0.0%
Idle Time.....100.0%
Wait Time.....0.0%
Nice Time.....0.0%
Combined......0.0%
Irq Time......0.0%

Totals........
User Time.....4.6%
Sys Time......2.3%
Idle Time.....92.1%
Wait Time.....0.0%
Nice Time.....0.0%
Combined......7.0%
Irq Time......0.7%

*/