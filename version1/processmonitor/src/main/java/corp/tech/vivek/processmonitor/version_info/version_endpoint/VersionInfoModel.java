package corp.tech.vivek.processmonitor.version_info.version_endpoint;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class designs the database for this application
 *  In general, service class will talk with this model class
 *   such that service class have all the required info with it
 *    in the end, controller gets required values from services based on end point request
 *
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
// With this Entity, the Spring boot identifies this class as entity class
//  and jpa will take care of creating table & row accordingly
// Basically, JPA can convert this Entity instance would be the row in the database table
//  Similarly, it converts row in database table into this Entity instance
@Entity
public class VersionInfoModel {
    // defining database columns
    @Id
    private String username;

    private String javaVersion;
    private String javaVendor;
    private String javaHome;

    public VersionInfoModel() {
        this.username = System.getProperty("user.name");

        this.javaVersion = System.getProperty("java.vm.version");
        this.javaVendor = System.getProperty("java.vm.vendor");
        this.javaHome = System.getProperty("java.home");
    }

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
