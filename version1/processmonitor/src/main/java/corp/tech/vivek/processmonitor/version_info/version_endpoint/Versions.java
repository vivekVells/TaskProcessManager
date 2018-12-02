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
public class Versions {
    // defining database columns
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String javaversion;
    private String javavendor;
    private String javahome;

    public Versions() {
//        super();
//        this.username = System.getProperty("user.name");
//
//        this.javaversion = System.getProperty("java.vm.version");
//        this.javavendor = System.getProperty("java.vm.vendor");
//        this.javahome = System.getProperty("java.home");
    }

    public Versions(Long id, String username, String  javaversion, String javavendor, String javahome) {
        super();

        this.id = id;
        this.username = username;
        this.javaversion = javaversion;
        this.javavendor = javavendor;
        this.javahome = javahome;
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

    public String getjavaversion() {
        return javaversion;
    }

    public void setjavaversion(String javaversion) {
        this.javaversion = javaversion;
    }

    public String getjavavendor() {
        return javavendor;
    }

    public void setjavavendor(String javavendor) {
        this.javavendor = javavendor;
    }

    public String getjavahome() {
        return javahome;
    }

    public void setjavahome(String javahome) {
        this.javahome = javahome;
    }

    @Override
    public String toString() {
        return "Versions{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", javaversion='" + javaversion + '\'' +
                ", javavendor='" + javavendor + '\'' +
                ", javahome='" + javahome + '\'' +
                '}';
    }
}
