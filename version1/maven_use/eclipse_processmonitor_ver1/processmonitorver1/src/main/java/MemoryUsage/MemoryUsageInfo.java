/**
 * 
 */
package MemoryUsage;

import org.hyperic.sigar.Mem;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.Swap;
import org.hyperic.sigar.cmd.Shell;
import org.hyperic.sigar.cmd.SigarCommandBase;

/**
 * @author Vivek
 * 
 * The class helps to display free and used memory in the system
 */
public class MemoryUsageInfo extends SigarCommandBase{

    public MemoryUsageInfo(Shell shell) {
        super(shell);
    }

    public MemoryUsageInfo() {
        super();
    }

    public String getUsageShort() {
        return "Display information about free and used memory";
    }

    private static Long format(long value) {
        return new Long(value / 1024);
    }

    public void output(String[] args) throws SigarException {
        Mem mem   = this.sigar.getMem();
        Swap swap = this.sigar.getSwap();

        Object[] header = new Object[] { "total", "used", "free" };

        Object[] memRow = new Object[] {
            format(mem.getTotal()),
            format(mem.getUsed()),
            format(mem.getFree())
        };

        Object[] actualRow = new Object[] {
            format(mem.getActualUsed()),
            format(mem.getActualFree())
        };

        Object[] swapRow = new Object[] {
            format(swap.getTotal()),
            format(swap.getUsed()),
            format(swap.getFree())
        };

        printf("%18s %10s %10s", header);

        printf("Mem:    %10ld %10ld %10ld", memRow);

        //e.g. linux
        if ((mem.getUsed() != mem.getActualUsed()) ||
            (mem.getFree() != mem.getActualFree()))
        {
            printf("-/+ buffers/cache: " + "%10ld %10d", actualRow);
        }

        printf("Swap:   %10ld %10ld %10ld", swapRow);

        printf("RAM:    %10ls", new Object[] { mem.getRam() + "MB" });
    }

    public static void main(String[] args) throws Exception {
        new MemoryUsageInfo().processCommand(args);
    }

}

/*
Output:
total       used       free
Mem:       8269064    6016348    2252716
-/+ buffers/cache:    5885540    2383524
Swap:     22730180   17270992    5459188
RAM:        8080MB
*/