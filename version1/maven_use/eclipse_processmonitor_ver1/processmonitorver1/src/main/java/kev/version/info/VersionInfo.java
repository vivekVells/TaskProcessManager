/** 
 * systeminfo package will be the service to provide all 
 *   the system related information on request
 */
package kev.version.info;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.hyperic.sigar.OperatingSystem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.SigarLoader;
import org.hyperic.sigar.cmd.Shell;
import org.hyperic.sigar.cmd.SigarCommandBase;

/**
 * @author Vivek
 * 
 * Version Class provides all system realted info
 */
public class VersionInfo extends SigarCommandBase {


    public VersionInfo(Shell shell) { super(shell); }

    public VersionInfo() { super(); }

	@Override
	public void output(String[] arg0) throws SigarException { }
	
    /**
     * Value if not present should return unkown string
     * 
     * @param checkArg
     * @return "unknown" if arg not having value
     */
    public String getUnkownIfValueNotPresent(String checkArg) {
    	String result = (checkArg.length() > 0) ? checkArg : "unknown";

    	return result;
    }
    
	/**
	 * Retrieve Host name of the machine
	 * 
	 * @return String host name
	 */
    public String getHostName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            return "unknown";
        }
    }
    
    /**
     * Retrieve Fully Qualified Domain Name of the machine
     * 
     * @return FQDN
     */
    public String getFQDN() {    	
    	try {
			return getSigarObject().getFQDN();
		} catch (SigarException e) {
			return "unkown";
		}
    }
    
    /**
     * Get Username of the machine
     * 
     * @return username
     */
    public String getUsername() {
    	return System.getProperty("user.name");
    }
    
    /**
     * Retrieve desired os version related info 
     * 
     * @return mapped os version info
     */
    public HashMap<String, Object> getOsVersionInfo() {
    	HashMap<String, Object> osVersionMap = new HashMap<String, Object>();
    	OperatingSystem osObj = OperatingSystem.getInstance();
    	
    	osVersionMap.put("os description", getUnkownIfValueNotPresent(osObj.getDescription()));
    	osVersionMap.put("os name", getUnkownIfValueNotPresent(osObj.getName()));
    	osVersionMap.put("os arch", getUnkownIfValueNotPresent(osObj.getArch()));
    	osVersionMap.put("os machine", getUnkownIfValueNotPresent(osObj.getMachine()));
    	osVersionMap.put("os version", getUnkownIfValueNotPresent(osObj.getVersion()));
    	osVersionMap.put("os patch level", getUnkownIfValueNotPresent(osObj.getPatchLevel()));
    	osVersionMap.put("os vendor version", getUnkownIfValueNotPresent(osObj.getVendorVersion()));
    	osVersionMap.put("os vendor code name", getUnkownIfValueNotPresent(osObj.getVendorCodeName()));
    	osVersionMap.put("os data model", getUnkownIfValueNotPresent(osObj.getDataModel()));
    	osVersionMap.put("os cpu endian", getUnkownIfValueNotPresent(osObj.getCpuEndian()));
    	
    	return osVersionMap;
    }
    
    /**
     * Desired version info of OS - retrievable by keyword string
     * 
     * @param osArg
     * @return matched key value
     */
    public Object getOsVersionInfoBy(String osArg) {
    	HashMap<String, Object> osVersionInfoMap = getOsVersionInfo();
    	
    	return osVersionInfoMap.get(osArg);
    }
    
    /**
     * Retrieve desired java version related info
     * 
     * @return mapped java version info
     */
    public HashMap<String, Object> getJavaVersionInfo() {
    	HashMap<String, Object> javaVersionMap = new HashMap<String, Object>();
    	
    	javaVersionMap.put("java vm version", getUnkownIfValueNotPresent(System.getProperty("java.vm.version")));
    	javaVersionMap.put("java vm vendor", getUnkownIfValueNotPresent(System.getProperty("java.vm.vendor")));
    	javaVersionMap.put("java vm home", getUnkownIfValueNotPresent(System.getProperty("java.home")));
    	
    	return javaVersionMap;
    }
    
    /**
     * Desired version info of Java - retrievable by keyword string
     * 
     * @param osArg
     * @return matched key value
     */
    public Object getJavaVersionInfoBy(String javaArg) {
    	HashMap<String, Object> javaVersionInfoMap = getJavaVersionInfo();
    	
    	return javaVersionInfoMap.get(javaArg);
    }

    /**
     * Retrieve all desired sigar version info
     * 
     * @return mapped sigar version info
     */
    public HashMap<String, Object> getSigarVersionInfo() {
    	HashMap<String, Object> sigarVersionMap = new HashMap<String, Object>();
    	
    	sigarVersionMap.put("sigar java version", getUnkownIfValueNotPresent(Sigar.VERSION_STRING));
    	sigarVersionMap.put("sigar native version", getUnkownIfValueNotPresent(Sigar.NATIVE_VERSION_STRING));
    	sigarVersionMap.put("sigar build date", getUnkownIfValueNotPresent(Sigar.BUILD_DATE));
    	sigarVersionMap.put("sigar native build date", getUnkownIfValueNotPresent(Sigar.NATIVE_BUILD_DATE));
    	sigarVersionMap.put("sigar scm version", getUnkownIfValueNotPresent(Sigar.SCM_REVISION));
    	sigarVersionMap.put("sigar native scm version", getUnkownIfValueNotPresent(Sigar.NATIVE_SCM_REVISION));
    	sigarVersionMap.put("sigar archlib", getUnkownIfValueNotPresent(SigarLoader.getNativeLibraryName())); 	
    	
    	return sigarVersionMap;
    }
    
    /**
     * Desired version info of Sigar - retrievable by keyword string
     * 
     * @param osArg
     * @return matched key value
     */    
    public Object getSigarVersionInfoBy(String sigarArg) {
    	HashMap<String, Object> sigarVersionInfoMap = getSigarVersionInfo();
    	
    	return sigarVersionInfoMap.get(sigarArg);
    }
    
    /**
     * Get Version class object
     * 
     * @return creates & returns newly created version object
     */
    public VersionInfo getVersionInfoObject() {
    	return new VersionInfo();
    }
    
    /**
     * Creates & returns new sigar object
     * 
     * @return newly created sigar object
     */
    public Sigar getSigarObject() {
    	return new Sigar();
    }

    public static void main(String[] args) throws Exception { }
}
