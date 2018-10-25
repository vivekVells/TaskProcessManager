/**
 * 
 */
package process;

import java.util.concurrent.TimeUnit;

/**
 * @author Vivek
 *
 */
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.ptql.ProcessFinder;

public class FindProcess {
    public static void main(String[] args) throws SigarException, InterruptedException {
        Sigar sigar = new Sigar();
        ProcessFinder find = new ProcessFinder(sigar);
        long pid = find.findSingleProcess("Exe.Name.ct=eclipse.exe");
        while(true) {
            System.out.println(sigar.getProcMem(pid));
            TimeUnit.SECONDS.sleep(1);
        }
    }
}