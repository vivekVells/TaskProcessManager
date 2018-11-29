package corp.tech.vivek.processmonitor.version_info.version_endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.HashMap;

/**
 * This controller class handles all the endpoints & respond accordingly
 *  In general, service class will talk with this model class
 *   such that service class have all the required info with it
 *    in the end, controller gets required values from services based on end point request
 *
 * All possible ways to provide response body for the endpoints is done in Controller class
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@RestController
public class VersionInfoController {
    @Autowired
    private VersionInfoService versionInfoService;

    @GetMapping("/api/versions")
    public HashMap<String, Object> getVersions() {
        return versionInfoService.getVersions();
    }

    @GetMapping("/api/version/{id}")
    public Object getVersion(@PathVariable String id) {
        return versionInfoService.getVersion(id);
    }
}
