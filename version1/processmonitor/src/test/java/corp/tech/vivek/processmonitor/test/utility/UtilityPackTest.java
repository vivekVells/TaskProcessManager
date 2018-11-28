package corp.tech.vivek.processmonitor.test.utility;

import corp.tech.vivek.processmonitor.utility.UtilityPack;
import org.hyperic.sigar.OperatingSystem;
import org.hyperic.sigar.Sigar;
import org.junit.*;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 *
 * shortNote: 5 tests in 43ms
 */
public class UtilityPackTest {
    Sigar sigarObj;
    OperatingSystem osObj;

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.sigarObj = new Sigar();
        this.osObj = OperatingSystem.getInstance();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        // Release any native resources associated with this sigar instance.
        this.sigarObj.close();
        this.sigarObj = null;
        this.osObj = null;
    }

    /**
     * Test method for {@link UtilityPack#getSigarObject()}.
     */
    @Test
    public void testGetSigarObject() {
        Assert.assertTrue(this.sigarObj.getClass().equals(UtilityPack.getSigarObject().getClass()));
    }

    /**
     * Test method for {@link UtilityPack#getOperatingSystemInstance()}.
     */
    @Test
    public void testGetOperatingSystemInstance() {
        Assert.assertTrue(this.osObj.getClass().equals(UtilityPack.getOperatingSystemInstance().getClass()));
    }

    /**
     * Test method for {@link UtilityPack#getFormattedDecimal(double, int)}.
     */
    @Test (expected = Exception.class)
    public void testGetFormattedDecimalException() {
        Double actual = UtilityPack.getFormattedDecimal(3.14159, -2);
        Double expected = Double.valueOf(3.14);

        Assert.assertEquals(expected, actual);
    }

    /**
     * Test method for {@link UtilityPack#getFormattedDecimal(double, int)}.
     */
    @Test
    public void testGetFormattedDecimal() {
        Double actual = UtilityPack.getFormattedDecimal(3.14159, 2);
        Double expected = Double.valueOf(3.14);

        Assert.assertEquals(expected, actual);
    }

    /**
     * Test method for {@link UtilityPack#getUnkownIfValueNotPresent(String)}.
     */
    @Test
    public void testGetUnkownIfValueNotPresent() {
        Assert.assertNotEquals("unknown", "value present");
    }
}
