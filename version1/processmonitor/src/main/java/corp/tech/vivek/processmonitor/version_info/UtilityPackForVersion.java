/**
 * This class acts as utility power belt for commonly used entities
 */
package corp.tech.vivek.processmonitor.version_info;

import org.hyperic.sigar.Sigar;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Vivek
 *
 * File reference/headsup notes: TaskProcessManager\resource_house\reference\NotesHub\version1-maven_use-eclipse_processmonitor_ver1-processmonitorver1\thingsToRemember.txt
 */
public class UtilityPackForVersion {

    /**
     * Creates & returns new sigar object
     *
     * @return newly created sigar object
     */
    public static Sigar getSigarObject() {
        return new Sigar();
    }

    /**
     * Trim up to desired decimal places
     *
     * @param arg
     * @return trimmed double decimal value
     */
    public static Double getFormattedDecimal(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);

        return Double.valueOf(bd.doubleValue());
    }

    /**
     * Value if not present should return unkown string
     *
     * @param checkArg
     * @return "unknown" if arg not having value
     */
    public static String getUnkownIfValueNotPresent(String checkArg) {
        String result = (checkArg.length() > 0) ? checkArg : "unknown";

        return result;
    }

    @GetMapping("/utility")
    public String sGetSigarObject() {
        return new Sigar().toString();
    }
}
