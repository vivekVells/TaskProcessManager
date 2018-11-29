package corp.tech.vivek.processmonitor.version_info;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@RestController
public class VersionInfoControllerBase {

    /**
     *
     * @return
     */
    @GetMapping("/version")
    public Object verifyWorkingVersionInfoContents() {
        VersionInfoBase verObj = new VersionInfoBase();
        HashMap<String, Object> mappedVersionValues = new HashMap<>();

        mappedVersionValues.put("host name", verObj.getHostName());
        mappedVersionValues.put("java version info", verObj.getJavaVersionInfo());
        mappedVersionValues.put("os version info", verObj.getOsVersionInfo());
        mappedVersionValues.put("sigar version info", verObj.getSigarVersionInfo());
        mappedVersionValues.put("fqdn", verObj.getFQDN());
        mappedVersionValues.put("username", verObj.getUsername());

        return mappedVersionValues;
    }
}

/*
Output:
> verified versioninfo in url:
{
  "sigar version info": {
    "sigar build date": "04/28/2010 04:26 PM",
    "sigar native build date": "04/28/2010 04:26 PM",
    "sigar native version": "1.6.4.128",
    "sigar scm version": "4b67f57",
    "sigar archlib": "sigar-amd64-winnt.dll",
    "sigar native scm version": "4b67f57",
    "sigar java version": "1.6.4.129"
  },
  "fqdn": "192.168.56.1",
  "host name": "kev",
  "java version info": {
    "java vm vendor": "Oracle Corporation",
    "java vm version": "25.144-b01",
    "java vm home": "C:\\Program Files\\Java\\jdk1.8.0_144\\jre"
  },
  "os version info": {
    "os description": "Microsoft \f",
    "os name": "Win32",
    "os arch": "x64",
    "os vendor code name": "unknown",
    "os machine": "unknown",
    "os patch level": "unknown",
    "os data model": "64",
    "os version": "10.0",
    "os cpu endian": "little"
  },
  "username": "Vivek-Pc"
}
<
 */
