/**
 * This class acts as utility power belt for commonly used entities
 */
package kev.utility;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.hyperic.sigar.Sigar;

/**
 * @author Vivek
 *
 */
public class UtilityPack {
	
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
	 * @param args
	 */
	public static void main(String[] args) { }
}
