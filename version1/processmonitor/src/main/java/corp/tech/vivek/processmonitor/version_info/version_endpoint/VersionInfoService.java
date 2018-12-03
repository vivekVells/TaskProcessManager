package corp.tech.vivek.processmonitor.version_info.version_endpoint;

import corp.tech.vivek.processmonitor.version_info.VersionInfoBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    private final static String VERSION_ENDPOINT_GET_ALL_VERSIONS = "http://localhost:8080/api/versions";

    @Autowired
    private VersionInfoRepository versionInfoRepository;

    public VersionInfoService() {
    }

    private VersionInfoModel pullRequiredVersionInfoData() {
        VersionInfoModel versionInfoModel = new VersionInfoModel();
        VersionInfoBase versionInfoBase = new VersionInfoBase();

        versionInfoModel.setUsername(versionInfoBase.getUsername());

        versionInfoModel.setHostName(versionInfoBase.getHostName());
        versionInfoModel.setFqdn(versionInfoBase.getFQDN());

        versionInfoModel.setJavaVersion(versionInfoBase.getJavaVersion());
        versionInfoModel.setJavaVendor(versionInfoBase.getJavaVendor());
        versionInfoModel.setJavaHome(versionInfoBase.getJavaHome());

        versionInfoModel.setSigarBuildDate(versionInfoBase.getSigarBuildDate());
        versionInfoModel.setSigarNativeBuildDate(versionInfoBase.getSigarNativeBuildDate());
        versionInfoModel.setSigarNativeVersion(versionInfoBase.getSigarNativeVersion());
        versionInfoModel.setSigarNativeScmVersion(versionInfoBase.getSigarNativeScmVersion());
        versionInfoModel.setSigarScmVersion(versionInfoBase.getSigarScmVersion());
        versionInfoModel.setSigarArchlib(versionInfoBase.getSigarArchlib());
        versionInfoModel.setSigarJavaVersion(versionInfoBase.getSigarJavaVersion());

        versionInfoModel.setOsDescription(versionInfoBase.getOsDescription());
        versionInfoModel.setOsName(versionInfoBase.getOsName());
        versionInfoModel.setOsArch(versionInfoBase.getOsArch());
        versionInfoModel.setOsVendorCode(versionInfoBase.getOsVendorCodeName());
        versionInfoModel.setOsMachine(versionInfoBase.getOsMachine());
        versionInfoModel.setOsPathLevel(versionInfoBase.getOsPatchLevel());
        versionInfoModel.setOsDataModel(versionInfoBase.getOsDataModel());
        versionInfoModel.setOsVersion(versionInfoBase.getOsVersion());
        versionInfoModel.setOsCpuEndian(versionInfoBase.getOsCpuEndian());

        return versionInfoModel;
    }

    @PostConstruct
    public void loadData() {
        versionInfoRepository.save(pullRequiredVersionInfoData());
    }

    public List<VersionInfoModel> getVersions() {
        List<VersionInfoModel> versionsList = new ArrayList<>();

        versionInfoRepository.findAll().forEach(versions -> versionsList.add(versions));

        return versionsList;
    }

    public void addVersions(VersionInfoModel versions) {
        versionInfoRepository.save(versions);
    }

    public void checkConsumedResponse()
    {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(VERSION_ENDPOINT_GET_ALL_VERSIONS, String.class);

        System.out.println("API-Response: " + result);
    }

//    public HashMap<String, Object> getVersions() {
//        return versions;
//    }
//
//    public Object getVersion(String id) {
//        if(versions.containsKey(id)) {
//            return versions.get(id);
//        } else {
//            return null;
//        }
//    }
}
