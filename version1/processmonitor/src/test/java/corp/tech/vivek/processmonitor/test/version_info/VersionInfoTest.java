package corp.tech.vivek.processmonitor.test.version_info;

import corp.tech.vivek.processmonitor.version_info.VersionInfo;
import org.hyperic.sigar.Sigar;
import org.junit.*;

import java.util.HashMap;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 *
 * shortNote: 30 tests in 4s 777ms
 */
public class VersionInfoTest {
    VersionInfo verInfoObj;
    Sigar sigarObj;

    static String expectedHostNameTestArg = null;
    static String expectedUserNameTestArg = null;
    static String expectedArchLibTestArg = null;
    static String expectedFQDNTestArg = null;

    static HashMap<String, Object> expectedOsVersionInfoMap = null;
    static HashMap<String, Object> expectedJavaVersionInfoMap = null;
    static HashMap<String, Object> expectedSigarVersionInfoMap = null;

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // setting up the expected values for testing

        expectedHostNameTestArg = "kev";
        expectedUserNameTestArg = "Vivek-Pc";
        expectedArchLibTestArg = "sigar-amd64-winnt.dll";
        expectedFQDNTestArg = "192.168.56.1";

        expectedOsVersionInfoMap = new HashMap<String, Object>();
        expectedJavaVersionInfoMap = new HashMap<String, Object>();
        expectedSigarVersionInfoMap = new HashMap<String, Object>();

        String[] osVersionInfoKeyTestArg = {
                "os description", "os name", "os arch",
                "os vendor code name", "os machine", "os patch level",
                "os data model", "os version", "os cpu endian"
        };

        Object[] osVersionInfoValueTestArg = {
                "Microsoft \f", "Win32", "x64",
                "unknown", "unknown", "unknown",
                "64", "10.0", "little"
        };

        for(int index = 0; index < osVersionInfoKeyTestArg.length; index++) {
            expectedOsVersionInfoMap.put(osVersionInfoKeyTestArg[index], osVersionInfoValueTestArg[index]);
        }

        String[] javaVersionInfoKeyTestArg = {
                "java vm version",
                "java vm vendor",
                "java vm home"
        };

        Object[] javaVersionInfoValueTestArg = {
                (System.getProperty("java.vm.version") != null) ? System.getProperty("java.vm.version") : "unknown",
                (System.getProperty("java.vm.vendor") != null) ? System.getProperty("java.vm.vendor") : "unknown",
                (System.getProperty("java.home") != null) ? System.getProperty("java.home") : "unknown"
        };

        for(int index = 0; index < javaVersionInfoKeyTestArg.length; index++) {
            expectedJavaVersionInfoMap.put(javaVersionInfoKeyTestArg[index], javaVersionInfoValueTestArg[index]);
        }

        String[] sigarVersionInfoKeyTestArg = {
                "sigar java version", "sigar native version",
                "sigar build date", "sigar native build date",
                "sigar scm version", "sigar native scm version",
                "sigar archlib"
        };

        Object[] sigarVersionInfoValueTestArg = {
                "1.6.4.129", "1.6.4.128",
                "04/28/2010 04:26 PM", "04/28/2010 04:26 PM",
                "4b67f57", "4b67f57",
                "sigar-amd64-winnt.dll"
        };

        for(int index = 0; index < sigarVersionInfoKeyTestArg.length; index++) {
            expectedSigarVersionInfoMap.put(sigarVersionInfoKeyTestArg[index], sigarVersionInfoValueTestArg[index]);
        }
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        expectedHostNameTestArg = null;
        expectedUserNameTestArg = null;
        expectedArchLibTestArg = null;
        expectedFQDNTestArg = null;

        expectedOsVersionInfoMap = null;
        expectedJavaVersionInfoMap = null;
        expectedSigarVersionInfoMap = null;
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.verInfoObj = new VersionInfo();
        this.sigarObj = new Sigar();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        this.verInfoObj = null;
        this.sigarObj.close();
    }

    /**
     * Test method for {@link VersionInfo#getHostName()}
     */
    @Test
    public void testGetHostName() {
        Assert.assertEquals(expectedHostNameTestArg, verInfoObj.getHostName());
    }

    /**
     * Test method for {@link VersionInfo#getFQDN()}.
     */
    @Test
    public void testGetFQDN() {
        Assert.assertEquals(expectedFQDNTestArg, verInfoObj.getFQDN());
    }

    /**
     * Test method for {@link VersionInfo#getUsername()}.
     */
    @Test
    public void testGetUsername() {
        Assert.assertEquals(expectedUserNameTestArg, verInfoObj.getUsername());
    }

    /**
     * Test method for {@link VersionInfo#getOsVersionInfo()}.
     */
    @Test
    public void testGetOsVersionInfo() {
        Assert.assertEquals(expectedOsVersionInfoMap, this.verInfoObj.getOsVersionInfo());
    }

    /**
     * Test method for {@link VersionInfo#getOsVersionInfoBy(String)}.
     */
    @Test
    public void testGetOsVersionInfoByDescription() {
        Assert.assertEquals(expectedOsVersionInfoMap.get("os description"), this.verInfoObj.getOsVersionInfoBy("os description"));
    }

    /**
     * Test method for {@link VersionInfo#getOsVersionInfoBy(String)}.
     */
    @Test
    public void testGetOsVersionInfoByName() {
        Assert.assertEquals(expectedOsVersionInfoMap.get("os name"), this.verInfoObj.getOsVersionInfoBy("os name"));
    }

    /**
     * Test method for {@link VersionInfo#getOsVersionInfoBy(String)}.
     */
    @Test
    public void testGetOsVersionInfoByArch() {
        Assert.assertEquals(expectedOsVersionInfoMap.get("os arch"), this.verInfoObj.getOsVersionInfoBy("os arch"));
    }

    /**
     * Test method for {@link VersionInfo#getOsVersionInfoBy(String)}.
     */
    @Test
    public void testGetOsVersionInfoByMachine() {
        Assert.assertEquals(expectedOsVersionInfoMap.get("os machine"), this.verInfoObj.getOsVersionInfoBy("os machine"));
    }

    /**
     * Test method for {@link VersionInfo#getOsVersionInfoBy(String)}.
     */
    @Test
    public void testGetOsVersionInfoByVersion() {
        Assert.assertEquals(expectedOsVersionInfoMap.get("os version"), this.verInfoObj.getOsVersionInfoBy("os version"));
    }

    /**
     * Test method for {@link VersionInfo#getOsVersionInfoBy(String)}.
     */
    @Test
    public void testGetOsVersionInfoByPatchLevel() {
        Assert.assertEquals(expectedOsVersionInfoMap.get("os patch level"), this.verInfoObj.getOsVersionInfoBy("os patch level"));
    }

    /**
     * Test method for {@link VersionInfo#getOsVersionInfoBy(String)}.
     */
    @Test
    public void testGetOsVersionInfoByVendorVersion() {
        Assert.assertEquals(expectedOsVersionInfoMap.get("os vendor version"), this.verInfoObj.getOsVersionInfoBy("os vendor version"));
    }

    /**
     * Test method for {@link VersionInfo#getOsVersionInfoBy(String)}.
     */
    @Test
    public void testGetOsVersionInfoByVendorCodeName() {
        Assert.assertEquals(expectedOsVersionInfoMap.get("os vendor code name"), this.verInfoObj.getOsVersionInfoBy("os vendor code name"));
    }

    /**
     * Test method for {@link VersionInfo#getOsVersionInfoBy(String)}.
     */
    @Test
    public void testGetOsVersionInfoByDataModel() {
        Assert.assertEquals(expectedOsVersionInfoMap.get("os data model"), this.verInfoObj.getOsVersionInfoBy("os data model"));
    }

    /**
     * Test method for {@link VersionInfo#getOsVersionInfoBy(String)}.
     */
    @Test
    public void testGetOsVersionInfoByCpuEndian() {
        Assert.assertEquals(expectedOsVersionInfoMap.get("os cpu endian"), this.verInfoObj.getOsVersionInfoBy("os cpu endian"));
    }

    /**
     * Test method for {@link VersionInfo#getOsVersionInfoBy(String)}.
     */
    @Test
    public void testGetOsVersionInfoBy() {
        Assert.assertEquals(expectedOsVersionInfoMap.get("os version"), this.verInfoObj.getOsVersionInfoBy("os version"));
    }

    /**
     * Test method for {@link VersionInfo#getJavaVersionInfo()}.
     */
    @Test
    public void testGetJavaVersionInfo() {
        Assert.assertEquals(expectedJavaVersionInfoMap, verInfoObj.getJavaVersionInfo());
    }

    /**
     * Test method for {@link VersionInfo#getJavaVersionInfoBy(String)}.
     */
    @Test
    public void testGetJavaVersionInfoByVersion() {
        Assert.assertEquals(expectedJavaVersionInfoMap.get("java vm version"), verInfoObj.getJavaVersionInfoBy("java vm version"));
    }

    /**
     * Test method for {@link VersionInfo#getJavaVersionInfoBy(String)}.
     */
    @Test
    public void testGetJavaVersionInfoByVendor() {
        Assert.assertEquals(expectedJavaVersionInfoMap.get("java vm vendor"), verInfoObj.getJavaVersionInfoBy("java vm vendor"));
    }

    /**
     * Test method for {@link VersionInfo#getJavaVersionInfoBy(String)}.
     */
    @Test
    public void testGetJavaVersionInfoByHome() {
        Assert.assertEquals(expectedJavaVersionInfoMap.get("java vm home"), verInfoObj.getJavaVersionInfoBy("java vm home"));
    }

    /**
     * Test method for {@link VersionInfo#getJavaVersionInfoBy(String)}.
     */
    @Test
    public void testGetJavaVersionInfoBy() {
        Assert.assertEquals(expectedJavaVersionInfoMap, verInfoObj.getJavaVersionInfo());
    }

    /**
     * Test method for {@link VersionInfo#getSigarVersionInfo()}.
     */
    @Test
    public void testGetSigarVersionInfo() {
        Assert.assertEquals(expectedSigarVersionInfoMap, verInfoObj.getSigarVersionInfo());
    }

    /**
     * Test method for {@link VersionInfo#getSigarVersionInfoBy(String)}.
     */
    @Test
    public void testGetSigarVersionInfoByJavaVersion() {
        Assert.assertEquals(expectedSigarVersionInfoMap.get("sigar java version"), verInfoObj.getSigarVersionInfoBy("sigar java version"));
    }

    /**
     * Test method for {@link VersionInfo#getSigarVersionInfoBy(String)}.
     */
    @Test
    public void testGetSigarVersionInfoByNativeVersion() {
        Assert.assertEquals(expectedSigarVersionInfoMap.get("sigar native version"), verInfoObj.getSigarVersionInfoBy("sigar native version"));
    }

    /**
     * Test method for {@link VersionInfo#getSigarVersionInfoBy(String)}.
     */
    @Test
    public void testGetSigarVersionInfoByBuildDate() {
        Assert.assertEquals(expectedSigarVersionInfoMap.get("sigar build date"), verInfoObj.getSigarVersionInfoBy("sigar build date"));
    }

    /**
     * Test method for {@link VersionInfo#getSigarVersionInfoBy(String)}.
     */
    @Test
    public void testGetSigarVersionInfoByNativeBuildDate() {
        Assert.assertEquals(expectedSigarVersionInfoMap.get("sigar native build date"), verInfoObj.getSigarVersionInfoBy("sigar native build date"));
    }

    /**
     * Test method for {@link VersionInfo#getSigarVersionInfoBy(String)}.
     */
    @Test
    public void testGetSigarVersionInfoByScmVersion() {
        Assert.assertEquals(expectedSigarVersionInfoMap.get("sigar scm version"), verInfoObj.getSigarVersionInfoBy("sigar scm version"));
    }

    /**
     * Test method for {@link VersionInfo#getSigarVersionInfoBy(String)}.
     */
    @Test
    public void testGetSigarVersionInfoByNativeScmVersion() {
        Assert.assertEquals(expectedSigarVersionInfoMap.get("sigar native scm version"), verInfoObj.getSigarVersionInfoBy("sigar native scm version"));
    }

    /**
     * Test method for {@link VersionInfo#getSigarVersionInfoBy(String)}.
     */
    @Test
    public void testGetSigarVersionInfoByArchlib() {
        Assert.assertEquals(expectedSigarVersionInfoMap.get("sigar archlib"), verInfoObj.getSigarVersionInfoBy("sigar archlib"));
    }

    /**
     * Test method for {@link VersionInfo#getSigarVersionInfo()}.
     */
    @Test
    public void testGetSigarVersionInfoBy() {
        Assert.assertEquals(expectedSigarVersionInfoMap, verInfoObj.getSigarVersionInfo());
    }

    /**
     * Test method for {@link VersionInfo#getVersionInfoObject()}.
     */
    @Test
    public void testGetVersionInfoObject() {
        Assert.assertTrue(this.verInfoObj.getClass().equals(this.verInfoObj.getVersionInfoObject().getClass()));
    }
}
