package corp.tech.vivek.processmonitor.cpu_ajax.controller;

import corp.tech.vivek.processmonitor.cpu_info.cpu_endpoint.CpuInfoModel;
import corp.tech.vivek.processmonitor.cpu_info.cpu_endpoint.CpuInfoService;
import corp.tech.vivek.processmonitor.version_ajax_tryout.model.RestResponseAjax;
import corp.tech.vivek.processmonitor.version_info.version_endpoint.VersionInfoModel;
import corp.tech.vivek.processmonitor.version_info.version_endpoint.VersionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@RestController
public class CpuInfoControllerAjax {
    @Autowired
    private CpuInfoService cpuInfoService;

    @GetMapping("/api/ajax/cpus")
    public RestResponseAjax allEmployees() {

        // instantiating the response object
        RestResponseAjax response = new RestResponseAjax();

        // retrieve a total cpu usage value
        CpuInfoModel cpuInfoModel = cpuInfoService.getCpuTotalUsageByID(2l);

        // make sure we've got versions
        if (cpuInfoModel != null) {
            response.setResponseStatus(RestResponseAjax.OK);

            // put the list in the response object
            response.setResponse(cpuInfoModel);
        } else {
            response.setResponseStatus(RestResponseAjax.NOT_FOUND);
            response.setResponse(new ArrayList<CpuInfoModel>());
        }

        return response;
    }
}
