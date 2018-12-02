//package corp.tech.vivek.processmonitor.version_info.version_endpoint;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
///**
// * This controller class handles all the endpoints & respond accordingly
// *  In general, service class will talk with this model class
// *   such that service class have all the required info with it
// *    in the end, controller gets required values from services based on end point request
// *
// * All possible ways to provide response body for the endpoints is done in Controller class
// * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
// */
//@RestController
//public class VersionInfoController {
//    @Autowired
//    private VersionInfoService versionInfoService;
//
//    @GetMapping("/api/versions")
//    public List<Versions> getVersions() {
//        System.out.println("get action done: ");
//        return versionInfoService.getVersions();
//    }
//
//    @PostMapping("/api/versions")
//    public void addVersion(@RequestBody Versions versions) {
//        System.out.println("post action done... " + versions.getUsername());
//        versionInfoService.addVersions(versions);
//    }
//
////    @GetMapping("/api/version/{id}")
////    public Object getVersion(@PathVariable String id) {
////        return versionInfoService.getVersion(id);
////    }
//}
//
///*
//Output:
//On Navigationt to http://localhost:8080/api/versions
//>>>
//{
//  "java-version-info": {
//    "java vm vendor": "Oracle Corporation",
//    "java vm version": "25.144-b01",
//    "java vm home": "C:\\Program Files\\Java\\jdk1.8.0_144\\jre"
//  },
//  "fqdn": "192.168.56.1",
//  "date-time": "2018-11-29T06:30:46.174+0000",
//  "os-version-info": {
//    "os description": "Microsoft \f",
//    "os name": "Win32",
//    "os arch": "x64",
//    "os vendor code name": "unknown",
//    "os machine": "unknown",
//    "os patch level": "unknown",
//    "os data model": "64",
//    "os version": "10.0",
//    "os cpu endian": "little"
//  },
//  "host-name": "kev",
//  "sigar-version-info": {
//    "sigar build date": "04/28/2010 04:26 PM",
//    "sigar native build date": "04/28/2010 04:26 PM",
//    "sigar native version": "1.6.4.128",
//    "sigar scm version": "4b67f57",
//    "sigar archlib": "sigar-amd64-winnt.dll",
//    "sigar native scm version": "4b67f57",
//    "sigar java version": "1.6.4.129"
//  },
//  "username": "Vivek-Pc"
//}
//>>>
// */
