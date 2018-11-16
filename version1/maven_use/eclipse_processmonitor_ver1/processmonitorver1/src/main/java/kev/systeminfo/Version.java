/** 
 * systeminfo package will be the service to provide all 
 *   the system related information on request
 */
package kev.systeminfo;

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
public class Version extends SigarCommandBase {


    public Version(Shell shell) { super(shell); }

    public Version() { super(); }

	@Override
	public void output(String[] arg0) throws SigarException { }
	
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
    	
    	osVersionMap.put("os description", osObj.getDescription());
    	osVersionMap.put("os name", osObj.getName());
    	osVersionMap.put("os arch", osObj.getArch());
    	osVersionMap.put("os machine", osObj.getMachine());
    	osVersionMap.put("os version", osObj.getVersion());
    	osVersionMap.put("os patch level", osObj.getPatchLevel());
    	osVersionMap.put("os vendor version", osObj.getVendorVersion());
    	osVersionMap.put("os vendor code name", osObj.getVendorCodeName());
    	osVersionMap.put("os data model", osObj.getDataModel());
    	osVersionMap.put("os cpu endian", osObj.getCpuEndian());
    	
    	return osVersionMap;
    }
    
    /**
     * Retrieve desired java version related info
     * 
     * @return mapped java version info
     */
    public HashMap<String, Object> getJavaVersionInfo() {
    	HashMap<String, Object> javaVersionMap = new HashMap<String, Object>();
    	
    	javaVersionMap.put("java vm version", System.getProperty("java.vm.version"));
    	javaVersionMap.put("java vm vendor", System.getProperty("java.vm.vendor"));
    	javaVersionMap.put("java vm home", System.getProperty("java.vm.home"));
    	
    	return javaVersionMap;
    }
    
    /**
     * Retrieve all desired sigar version info
     * 
     * @return mapped sigar version info
     */
    public HashMap<String, Object> getSigarVersionInfo() {
    	HashMap<String, Object> sigarVersionMap = new HashMap<String, Object>();
    	sigarVersionMap.put("sigar java version", Sigar.VERSION_STRING);
    	sigarVersionMap.put("sigar native version", Sigar.NATIVE_VERSION_STRING);
    	sigarVersionMap.put("sigar build date", Sigar.BUILD_DATE);
    	sigarVersionMap.put("sigar native build date", Sigar.NATIVE_BUILD_DATE);
    	sigarVersionMap.put("sigar scm version", Sigar.SCM_REVISION);
    	sigarVersionMap.put("sigar native scm version", Sigar.NATIVE_SCM_REVISION);
    	sigarVersionMap.put("sigar archlib", SigarLoader.getNativeLibraryName()); 	
    	
    	return sigarVersionMap;
    }
    
    /**
     * Get Version class object
     * 
     * @return creates & returns newly created version object
     */
    public Version getVersionObjection() {
    	return new Version();
    }
    
    /**
     * Creates & returns new sigar object
     * 
     * @return newly created sigar object
     */
    public static Sigar getSigarObject() {
    	return new Sigar();
    }

    public static void main(String[] args) throws Exception { }
}

