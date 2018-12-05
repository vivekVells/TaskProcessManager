package corp.tech.vivek.processmonitor.version_ajax_tryout.controller;

import corp.tech.vivek.processmonitor.version_ajax_tryout.model.RestResponseAjax;
import corp.tech.vivek.processmonitor.version_info.version_endpoint.VersionInfoModel;
import corp.tech.vivek.processmonitor.version_info.version_endpoint.VersionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@RestController
public class VersionInfoControllerAjax {

    @Autowired
    private VersionInfoService versionInfoService;

    @GetMapping("/api/ajax/versions")
    public RestResponseAjax allEmployees() {

        // instantiating the response object
        RestResponseAjax response = new RestResponseAjax();

        // retrieve list of versions
        List<VersionInfoModel> allVersions = versionInfoService.getVersions();
        VersionInfoModel currentVersionInfoOfTheSystem = allVersions.get(0);

        // make sure we've got versions
        if (currentVersionInfoOfTheSystem != null) {
            response.setResponseStatus(RestResponseAjax.OK);

            // put the list in the response object
            response.setResponse(currentVersionInfoOfTheSystem);
        } else {
            response.setResponseStatus(RestResponseAjax.NOT_FOUND);
            response.setResponse(new ArrayList<VersionInfoModel>());
        }

        return response;
    }

    @GetMapping("/api/ajax/versions/consume-response")
    public void getConsumedVersions() {
        System.out.println("ajax consume-response done");
        VersionInfoService versionInfoService = new VersionInfoService();
        versionInfoService.checkConsumedResponse();
    }

    @PostMapping("/api/ajax/versions")
    public void addVersion(@RequestBody VersionInfoModel versions) {
        System.out.println("ajax post action done... " + versions.getUsername());
        versionInfoService.addVersions(versions);
    }

//    @GetMapping("/api/version/{id}")
//    public Object getVersion(@PathVariable String id) {
//        return versionInfoService.getVersion(id);
//    }
}
