//package corp.tech.vivek.processmonitor.version_info.version_endpoint;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * This service class provides every information which then will be used by controller
// *  In general, service class will talk with this model class
// *   such that service class have all the required info with it
// *    in the end, controller gets required values from services based on end point request
// *
// * All possible ways to provide the data to the controller is done in Service class
// *
// * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
// */
//@Service
//public class VersionInfoService {
//
//    @Autowired
//    private VersionInfoRepository versionInfoRepository;
//
//    public VersionInfoService() {
//    }
//
//    public List<Versions> getVersions() {
//        List<Versions> versionsList = new ArrayList<>();
//        Versions versionsObj = new Versions();
//        versionsObj.setUsername("vivek Vells");
//
//        versionsList.add(versionsObj);
//
//        //versionInfoRepository.findAll().forEach(versions -> versionsList.add(versions));
//        return versionsList;
//    }
//
//    public void addVersions(Versions versions) {
//        versionInfoRepository.save(versions);
//    }
//
////    public HashMap<String, Object> getVersions() {
////        return versions;
////    }
////
////    public Object getVersion(String id) {
////        if(versions.containsKey(id)) {
////            return versions.get(id);
////        } else {
////            return null;
////        }
////    }
//}
