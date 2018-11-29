package corp.tech.vivek.processmonitor.version_info.version_endpoint;

import org.springframework.stereotype.Service;
import java.util.HashMap;

/**
 * This service class provides every information which then will be used by controller
 *  In general, service class will talk with this model class
 *   such that service class have all the required info with it
 *    in the end, controller gets required values from services based on end point request
 *
 * All possible ways to provide the data to the controller is done in Service class
 *
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@Service
public class VersionInfoService {
    private HashMap<String, Object> versions = new HashMap<>();

    public VersionInfoService() {
        VersionInfoModel verInfoObj = new VersionInfoModel();

        versions.put("username", verInfoObj.getUsername());
        versions.put("java-version", verInfoObj.getJavaVersion());
        versions.put("java-vendor", verInfoObj.getJavaVendor());
        versions.put("java-home", verInfoObj.getJavaHome());
    }

    public HashMap<String, Object> getVersions() {
        return versions;
    }

    public Object getVersion(String id) {
        if(versions.containsKey(id)) {
            return versions.get(id);
        } else {
            return null;
        }
    }
}
