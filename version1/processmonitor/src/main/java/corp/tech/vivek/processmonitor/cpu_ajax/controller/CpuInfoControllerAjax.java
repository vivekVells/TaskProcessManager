package corp.tech.vivek.processmonitor.cpu_ajax.controller;

import corp.tech.vivek.processmonitor.cpu_ajax.model.CpuInfoRestResponseAjax;
import corp.tech.vivek.processmonitor.cpu_info.cpu_endpoint.CpuInfoModel;
import corp.tech.vivek.processmonitor.cpu_info.cpu_endpoint.CpuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@RestController
public class CpuInfoControllerAjax {
    @Autowired
    private CpuInfoService cpuInfoService;

    @GetMapping("/api/ajax/cpus")
    public CpuInfoRestResponseAjax allCpus() {

        // instantiating the response object
        CpuInfoRestResponseAjax response = new CpuInfoRestResponseAjax();
        CpuInfoModel cpuInfoModel;

        // retrieve a total cpu usage value
        try {
            cpuInfoModel = cpuInfoService.getCpuTotalUsageByID(2l);
        } catch (NoSuchElementException noSuchEle) {
            cpuInfoModel = null;
        }

        // make sure we've got versions
        if (cpuInfoModel != null) {
            response.setResponseStatus(CpuInfoRestResponseAjax.OK);

            // put the list in the response object
            response.setResponse(cpuInfoModel);
        } else {
            response.setResponseStatus(CpuInfoRestResponseAjax.NOT_FOUND);
            response.setResponse(new ArrayList<CpuInfoModel>());
        }

        return response;
    }

    @GetMapping("/api/ajax/cpus/{id}")
    public CpuInfoRestResponseAjax allCpus(@PathVariable Long id) {

        // instantiating the response object
        CpuInfoRestResponseAjax response = new CpuInfoRestResponseAjax();
        CpuInfoModel cpuInfoModel;

        // retrieve a total cpu usage value
        try {
            cpuInfoModel = cpuInfoService.getCpuTotalUsageByID(id);
        } catch (NoSuchElementException noSuchEle) {
            cpuInfoModel = null;
        }

        // make sure we've got versions
        if (cpuInfoModel != null) {
            response.setResponseStatus(CpuInfoRestResponseAjax.OK);

            // put the list in the response object
            response.setResponse(cpuInfoModel);
        } else {
            response.setResponseStatus(CpuInfoRestResponseAjax.NOT_FOUND);
            response.setResponse(new ArrayList<CpuInfoModel>());
        }

        return response;
    }
}
