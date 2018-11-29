package corp.tech.vivek.processmonitor.version_info.version_endpoint;

import corp.tech.vivek.processmonitor.version_info.VersionInfoBase;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        // have to use VersionInfoModel. Temporary solution done.

        VersionInfoBase versionInfoBase = new VersionInfoBase();

        versions.put("username", versionInfoBase.getUsername());
        versions.put("host-name", versionInfoBase.getHostName());
        versions.put("fqdn", versionInfoBase.getFQDN());
        versions.put("java-version-info", versionInfoBase.getJavaVersionInfo());
        versions.put("os-version-info", versionInfoBase.getOsVersionInfo());
        versions.put("sigar-version-info", versionInfoBase.getSigarVersionInfo());
        versions.put("date-time", new Date());
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
