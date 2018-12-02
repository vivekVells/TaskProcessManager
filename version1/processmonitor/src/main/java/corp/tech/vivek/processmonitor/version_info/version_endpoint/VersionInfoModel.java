package corp.tech.vivek.processmonitor.version_info.version_endpoint;

import javax.persistence.*;

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
    @GeneratedValue
    private Long id;
    private String username;
    private String javaVersion;
    private String javaVendor;
    private String javaHome;

    private String sigarBuildDate;
    private String sigarNativeBuildDate;
    private String sigarNativeVersion;
    private String sigarScmVersion;
    private String sigarArchlib;
    private String sigarNativeScmVersion;
    private String sigarJavaVersion;

    private String hostName;
    private String fqdn;

    private String osDescription;
    private String osName;
    private String osArch;
    private String osVerndorCode;
    private String osMachine;
    private String osPathLevel;
    private String osDataModel;
    private String osVersion;
    private String osCpuEndian;

    public VersionInfoModel() {
//        super();
//        this.username = System.getProperty("user.name");
//
//        this.javaVersion = System.getProperty("java.vm.version");
//        this.javaVendor = System.getProperty("java.vm.vendor");
//        this.javaHome = System.getProperty("java.home");
    }

    public VersionInfoModel(Long id, String username, String  javaVersion, String javaVendor, String javaHome) {
        super();

        this.id = id;
        this.username = username;
        this.javaVersion = javaVersion;
        this.javaVendor = javaVendor;
        this.javaHome = javaHome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getjavaVersion() {
        return javaVersion;
    }

    public void setjavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    public String getjavaVendor() {
        return javaVendor;
    }

    public void setjavaVendor(String javaVendor) {
        this.javaVendor = javaVendor;
    }

    public String getjavaHome() {
        return javaHome;
    }

    public void setjavaHome(String javaHome) {
        this.javaHome = javaHome;
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

    public String getSigarBuildDate() {
        return sigarBuildDate;
    }

    public void setSigarBuildDate(String sigarBuildDate) {
        this.sigarBuildDate = sigarBuildDate;
    }

    public String getSigarNativeBuildDate() {
        return sigarNativeBuildDate;
    }

    public void setSigarNativeBuildDate(String sigarNativeBuildDate) {
        this.sigarNativeBuildDate = sigarNativeBuildDate;
    }

    public String getSigarNativeVersion() {
        return sigarNativeVersion;
    }

    public void setSigarNativeVersion(String sigarNativeVersion) {
        this.sigarNativeVersion = sigarNativeVersion;
    }

    public String getSigarScmVersion() {
        return sigarScmVersion;
    }

    public void setSigarScmVersion(String sigarScmVersion) {
        this.sigarScmVersion = sigarScmVersion;
    }

    public String getSigarArchlib() {
        return sigarArchlib;
    }

    public void setSigarArchlib(String sigarArchlib) {
        this.sigarArchlib = sigarArchlib;
    }

    public String getSigarNativeScmVersion() {
        return sigarNativeScmVersion;
    }

    public void setSigarNativeScmVersion(String sigarNativeScmVersion) {
        this.sigarNativeScmVersion = sigarNativeScmVersion;
    }

    public String getSigarJavaVersion() {
        return sigarJavaVersion;
    }

    public void setSigarJavaVersion(String sigarJavaVersion) {
        this.sigarJavaVersion = sigarJavaVersion;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getFqdn() {
        return fqdn;
    }

    public void setFqdn(String fqdn) {
        this.fqdn = fqdn;
    }

    public String getOsDescription() {
        return osDescription;
    }

    public void setOsDescription(String osDescription) {
        this.osDescription = osDescription;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsArch() {
        return osArch;
    }

    public void setOsArch(String osArch) {
        this.osArch = osArch;
    }

    public String getOsVerndorCode() {
        return osVerndorCode;
    }

    public void setOsVerndorCode(String osVerndorCode) {
        this.osVerndorCode = osVerndorCode;
    }

    public String getOsMachine() {
        return osMachine;
    }

    public void setOsMachine(String osMachine) {
        this.osMachine = osMachine;
    }

    public String getOsPathLevel() {
        return osPathLevel;
    }

    public void setOsPathLevel(String osPathLevel) {
        this.osPathLevel = osPathLevel;
    }

    public String getOsDataModel() {
        return osDataModel;
    }

    public void setOsDataModel(String osDataModel) {
        this.osDataModel = osDataModel;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getOsCpuEndian() {
        return osCpuEndian;
    }

    public void setOsCpuEndian(String osCpuEndian) {
        this.osCpuEndian = osCpuEndian;
    }

    @Override
    public String toString() {
        return "VersionInfoModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", javaVersion='" + javaVersion + '\'' +
                ", javaVendor='" + javaVendor + '\'' +
                ", javaHome='" + javaHome + '\'' +
                '}';
    }
}
