package corp.tech.vivek.processmonitor.version_info.version_endpoint;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class designs the database for this application
 *  In general, service class will talk with this model class
 *   such that service class have all the required info with it
 *    in the end, controller gets required values from services based on end point request
 *
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@XmlRootElement
public class VersionInfoModel {
    // defining database columns
    private String username;

    private String javaVersion;
    private String javaVendor;
    private String javaHome;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    public String getJavaVendor() {
        return javaVendor;
    }

    public void setJavaVendor(String javaVendor) {
        this.javaVendor = javaVendor;
    }

    public String getJavaHome() {
        return javaHome;
    }

    public void setJavaHome(String javaHome) {
        this.javaHome = javaHome;
    }
}
