package corp.tech.vivek.processmonitor.test.cpu_info;

import corp.tech.vivek.processmonitor.cpu_info.CpuInfoUsage;
import corp.tech.vivek.processmonitor.utility.UtilityPack;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.junit.*;

import java.util.HashMap;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 *
 * shortNote: 12 tests in 13s 98ms
 */
public class CpuInfoUsageTest {
    CpuInfoUsage cpuObj;
    Sigar sigarObj;
    CpuPerc[] cpuPercUsageListObj;
    CpuPerc cpuPercTotalUsageObj;

    static HashMap<String, Object> cpuMachineInfoMapTestArg;
    static HashMap<String, Object> retrieveCpuPercMapTestArg;
    static HashMap<String, Object> expectedCpuInfoUsageMapTestArg;
    static String expectedClassCpuName;
    static String actualClassCpuName;

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        cpuMachineInfoMapTestArg = new HashMap<String, Object>();
        retrieveCpuPercMapTestArg = new HashMap<String, Object>();
        expectedClassCpuName = new CpuInfoUsage().getClass().getName();
        actualClassCpuName = new CpuInfoUsage().getCpuInfoUsageObject().getClass().getName();

        org.hyperic.sigar.CpuInfo info = UtilityPack.getSigarObject().getCpuInfoList()[0];

        cpuMachineInfoMapTestArg.put("vendor", UtilityPack.getUnkownIfValueNotPresent(info.getVendor()));
        cpuMachineInfoMapTestArg.put("model", UtilityPack.getUnkownIfValueNotPresent(info.getModel()));
        cpuMachineInfoMapTestArg.put("operating at", info.getMhz());
        cpuMachineInfoMapTestArg.put("total cores", info.getTotalCores());
        cpuMachineInfoMapTestArg.put("total sockets", info.getTotalSockets());
        cpuMachineInfoMapTestArg.put("cores per socket", info.getCoresPerSocket());

        String[] retrieveCpuPercKeyTestArg = {
                "user time", "sys time", "idle time", "wait time", "nice time", "combined", "irq time"
        };

        Integer[] retrieveCpuPercValueTestArg = {
                18, 12, 68, 0, 0, 31, 0
        };

        for(int index = 0; index < retrieveCpuPercKeyTestArg.length; index++) {
            retrieveCpuPercMapTestArg.put(retrieveCpuPercKeyTestArg[index], retrieveCpuPercValueTestArg[index]);
        }
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        cpuMachineInfoMapTestArg = new HashMap<String, Object>();
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.cpuObj = new CpuInfoUsage();
        this.sigarObj = new Sigar();
        this.cpuPercUsageListObj = this.sigarObj.getCpuPercList();
        this.cpuPercTotalUsageObj = this.sigarObj.getCpuPerc();

    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        this.cpuObj = null;
        this.sigarObj = null;
        this.cpuPercUsageListObj = null;
        this.cpuPercTotalUsageObj = null;
    }

    /**
     * Test method for {@link CpuInfoUsage#getCpuInfoUsageObject()}.
     */
    @Test
    public void testGetCpuInfoUsageObject() {
        Assert.assertTrue(expectedClassCpuName.equals(actualClassCpuName));
    }

    /**
     * Test method for {@link CpuInfoUsage#retrieveCpuPerc(org.hyperic.sigar.CpuPerc)}.
     * @throws SigarException
     * @throws InterruptedException
     */
    @Test
    public void testRetrieveCpuPerc() throws InterruptedException, SigarException {
        HashMap<String, Object> actualRectrieveCpuPercMapTestArg = this.cpuObj.retrieveCpuPerc(this.sigarObj.getCpuPerc());
        HashMap<String, Object> expectedRectrieveCpuPercMapTestArg = retrieveCpuPercMapTestArg;

        Assert.assertTrue(expectedRectrieveCpuPercMapTestArg.keySet().equals(actualRectrieveCpuPercMapTestArg.keySet()));
    }

    /**
     * Test method for {@link CpuInfoUsage#getCpuPercUsageListObject()}.
     * @throws SigarException
     */
    @Test
    public void testGetCpuPercUsageList() throws SigarException {
        CpuPerc[] expectedCpuPercUsageListObj = this.cpuPercUsageListObj;
        CpuPerc[] actualCpuPercUsageListObj = this.cpuObj.getCpuPercUsageListObject();

        Assert.assertTrue(expectedCpuPercUsageListObj.getClass().equals(actualCpuPercUsageListObj.getClass()));
    }

    /**
     * Test method for {@link CpuInfoUsage#getCpuPercTotalUsageObject()}.
     * @throws SigarException
     */
    @Test
    public void testGetCpuPercTotalUsage() throws SigarException {
        CpuPerc expectedCpuPercTotalUsageObj = this.cpuPercTotalUsageObj;
        CpuPerc actualCpuPercTotalUsageObj = this.cpuObj.getCpuPercTotalUsageObject();

        Assert.assertTrue(expectedCpuPercTotalUsageObj.getClass().equals(actualCpuPercTotalUsageObj.getClass()));
    }

    /**
     * Test method for {@link CpuInfoUsage#getIndividualCpuUsageInfo()}.
     * @throws SigarException
     * @throws InterruptedException
     */
    @Test
    public void testGetIndividualCpuUsageInfo() throws InterruptedException, SigarException {
        HashMap<String, Object> actualRectrieveCpuPerc = this.cpuObj.retrieveCpuPerc(this.sigarObj.getCpuPerc());
        // HashMap<String, Object> expectedRectrieveCpuPerc;

        Assert.assertEquals(7, actualRectrieveCpuPerc.size());
    }

    /**
     * Test method for {@link CpuInfoUsage#getTotalCpuUsageInfo()}.
     * @throws SigarException
     * @throws InterruptedException
     */
    @Test
    public void testGetTotalCpuUsageInfo() throws InterruptedException, SigarException {
        HashMap<String, Object> actualRectrieveCpuPerc = this.cpuObj.retrieveCpuPerc(this.sigarObj.getCpuPerc());
        // HashMap<String, Object> expectedRectrieveCpuPerc;

        Assert.assertEquals(7, actualRectrieveCpuPerc.size());
    }

    /**
     * Test method for {@link CpuInfoUsage#getCpuMachineInfo()}.
     * @throws SigarException
     */
    @Test
    public void testGetCpuMachineInfo() throws SigarException {
        HashMap<String, Object> actualGetCpuMachineInfoBy = this.cpuObj.getCpuMachineInfo();
        HashMap<String, Object> expectedGetCpuMachineInfoBy = cpuMachineInfoMapTestArg;

        Assert.assertEquals(expectedGetCpuMachineInfoBy, actualGetCpuMachineInfoBy);
    }

    /**
     * Test method for {@link CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
     * @throws SigarException
     */
    @Test
    public void testGetCpuMachineInfoByVendor() throws SigarException {
        String actual = (String) this.cpuObj.getCpuMachineInfoBy("vendor");
        String expected = (String) cpuMachineInfoMapTestArg.get("vendor");

        Assert.assertEquals(expected, actual);
    }

    /**
     * Test method for {@link CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
     * @throws SigarException
     */
    @Test
    public void testGetCpuMachineInfoByModel() throws SigarException {
        String actual = (String) this.cpuObj.getCpuMachineInfoBy("model");
        String expected = (String) cpuMachineInfoMapTestArg.get("model");

        Assert.assertEquals(expected, actual);
    }

    /**
     * Test method for {@link CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
     * @throws SigarException
     */
    @Test
    public void testGetCpuMachineInfoByOperatingAt() throws SigarException {
        Integer actual = (Integer) this.cpuObj.getCpuMachineInfoBy("operating at");
        Integer expected = (Integer) cpuMachineInfoMapTestArg.get("operating at");

        Assert.assertEquals(expected, actual);
    }

    /**
     * Test method for {@link CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
     * @throws SigarException
     */
    @Test
    public void testGetCpuMachineInfoByTotalCores() throws SigarException {
        Integer actual = (Integer) this.cpuObj.getCpuMachineInfoBy("total cores");
        Integer expected = (Integer) cpuMachineInfoMapTestArg.get("total cores");

        Assert.assertEquals(expected, actual);
    }

    /**
     * Test method for {@link CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
     * @throws SigarException
     */
    @Test
    public void testGetCpuMachineInfoByTotalSockets() throws SigarException {
        Integer actual = (Integer) this.cpuObj.getCpuMachineInfoBy("total sockets");
        Integer expected = (Integer) cpuMachineInfoMapTestArg.get("total sockets");

        Assert.assertEquals(expected, actual);
    }

    /**
     * Test method for {@link CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
     * @throws SigarException
     */
    @Test
    public void testGetCpuMachineInfoByCoresPerSocket() throws SigarException {
        Integer actual = (Integer) this.cpuObj.getCpuMachineInfoBy("cores per socket");
        Integer expected = (Integer) cpuMachineInfoMapTestArg.get("cores per socket");

        Assert.assertEquals(expected, actual);
    }

    /**
     * Test method for {@link CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
     * @throws SigarException
     */
    @Test
    public void testGetCpuMachineInfoBy() throws SigarException {
        HashMap<String, Object> actualGetCpuMachineInfoBy = this.cpuObj.getCpuMachineInfo();
        HashMap<String, Object> expectedGetCpuMachineInfoBy = cpuMachineInfoMapTestArg;

        Assert.assertEquals(expectedGetCpuMachineInfoBy, actualGetCpuMachineInfoBy);
    }
}
