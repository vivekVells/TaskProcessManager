/**
 * This class is exclusive for all possible test cases for CpuInfoUsage class
 */
package kev.cpu;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.hyperic.sigar.SigarException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.Sigar;
import kev.cpu.CpuInfoUsage;

/**
 * @author Vivek
 *
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
		
		// marist library machine
		// Object[] cpuMachineInfoArrayForTest = { "Intel", "Core(TM) i5-7500 CPU @ 3.40GHz", 3408, 4, 4, 16 };
		
		// vivek machine
		String[] cpuMachineInfoKeyTestArg = {
			"vendor", "model", "operating at", "total cores", "total sockets", "cores per socket"	
		};
		
		Object[] cpuMachineInfoValueTestArg = { 
				"Intel", "Core(TM) i5-4210U CPU @ 1.70GHz", 2394, 4, 4, 16 
		};		
		
		for(int index = 0; index < cpuMachineInfoKeyTestArg.length; index++) {
			cpuMachineInfoMapTestArg.put(cpuMachineInfoKeyTestArg[index], cpuMachineInfoValueTestArg[index]);
		}	
		
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
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuInfoUsageObject()}.
	 */
	@Test
	public void testGetCpuInfoUsageObject() {		
		assertTrue(expectedClassCpuName.equals(actualClassCpuName));
	}
	
	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#retrieveCpuPerc(org.hyperic.sigar.CpuPerc)}.
	 * @throws SigarException 
	 * @throws InterruptedException 
	 */
	@Test
	public void testRetrieveCpuPerc() throws InterruptedException, SigarException { 		
		HashMap<String, Object> actualRectrieveCpuPercMapTestArg = this.cpuObj.retrieveCpuPerc(this.sigarObj.getCpuPerc());
		HashMap<String, Object> expectedRectrieveCpuPercMapTestArg = retrieveCpuPercMapTestArg;
		
		assertTrue(expectedRectrieveCpuPercMapTestArg.keySet().equals(actualRectrieveCpuPercMapTestArg.keySet()));	
	}
	
	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuPercUsageListObject()}.
	 * @throws SigarException  
	 */
	@Test
	public void testGetCpuPercUsageList() throws SigarException {
		CpuPerc[] expectedCpuPercUsageListObj = this.cpuPercUsageListObj;
		CpuPerc[] actualCpuPercUsageListObj = this.cpuObj.getCpuPercUsageListObject();
		
		assertTrue(expectedCpuPercUsageListObj.getClass().equals(actualCpuPercUsageListObj.getClass()));
	}
	
	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuPercTotalUsageObject()}.
	 * @throws SigarException  
	 */
	@Test
	public void testGetCpuPercTotalUsage() throws SigarException {
		CpuPerc expectedCpuPercTotalUsageObj = this.cpuPercTotalUsageObj;
		CpuPerc actualCpuPercTotalUsageObj = this.cpuObj.getCpuPercTotalUsageObject();
		
		assertTrue(expectedCpuPercTotalUsageObj.getClass().equals(actualCpuPercTotalUsageObj.getClass()));
	}	

	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getIndividualCpuUsageInfo()}.
	 * @throws SigarException 
	 * @throws InterruptedException 
	 */
	@Ignore
	public void testGetIndividualCpuUsageInfo() throws InterruptedException, SigarException {
		HashMap<String, Object> actualRectrieveCpuPerc = this.cpuObj.retrieveCpuPerc(this.sigarObj.getCpuPerc());
		// HashMap<String, Object> expectedRectrieveCpuPerc;
		
		assertEquals(7, actualRectrieveCpuPerc.size());	
	}

	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getTotalCpuUsageInfo()}.
	 * @throws SigarException 
	 * @throws InterruptedException 
	 */
	@Ignore
	public void testGetTotalCpuUsageInfo() throws InterruptedException, SigarException {
		HashMap<String, Object> actualRectrieveCpuPerc = this.cpuObj.retrieveCpuPerc(this.sigarObj.getCpuPerc());
		// HashMap<String, Object> expectedRectrieveCpuPerc;
		
		assertEquals(7, actualRectrieveCpuPerc.size());	
	}

	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuMachineInfo()}.
	 * @throws SigarException 
	 */
	@Test
	public void testGetCpuMachineInfo() throws SigarException {
		HashMap<String, Object> actualGetCpuMachineInfoBy = this.cpuObj.getCpuMachineInfo();
		HashMap<String, Object> expectedGetCpuMachineInfoBy = cpuMachineInfoMapTestArg;
		
		assertEquals(expectedGetCpuMachineInfoBy, actualGetCpuMachineInfoBy);
	}

	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
	 * @throws SigarException 
	 */
	@Test
	public void testGetCpuMachineInfoByVendor() throws SigarException {
		String actual = (String) this.cpuObj.getCpuMachineInfoBy("vendor");
		String expected = (String) cpuMachineInfoMapTestArg.get("vendor");
		
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
	 * @throws SigarException 
	 */
	@Test
	public void testGetCpuMachineInfoByModel() throws SigarException {
		String actual = (String) this.cpuObj.getCpuMachineInfoBy("model");
		String expected = (String) cpuMachineInfoMapTestArg.get("model");
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
	 * @throws SigarException 
	 */
	@Test
	public void testGetCpuMachineInfoByOperatingAt() throws SigarException {
		Integer actual = (Integer) this.cpuObj.getCpuMachineInfoBy("operating at");
		Integer expected = (Integer) cpuMachineInfoMapTestArg.get("operating at");
		
		assertEquals(expected, actual);
	}	
	
	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
	 * @throws SigarException 
	 */
	@Test
	public void testGetCpuMachineInfoByTotalCores() throws SigarException {
		Integer actual = (Integer) this.cpuObj.getCpuMachineInfoBy("total cores");
		Integer expected = (Integer) cpuMachineInfoMapTestArg.get("total cores");
		
		assertEquals(expected, actual);
	}	

	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
	 * @throws SigarException 
	 */
	@Test
	public void testGetCpuMachineInfoByTotalSockets() throws SigarException {
		Integer actual = (Integer) this.cpuObj.getCpuMachineInfoBy("total sockets");
		Integer expected = (Integer) cpuMachineInfoMapTestArg.get("total sockets");
		
		assertEquals(expected, actual);
	}	
	
	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
	 * @throws SigarException 
	 */
	@Test
	public void testGetCpuMachineInfoByCoresPerSocket() throws SigarException {
		Integer actual = (Integer) this.cpuObj.getCpuMachineInfoBy("cores per socket");
		Integer expected = (Integer) cpuMachineInfoMapTestArg.get("cores per socket");
		
		assertEquals(expected, actual);
	}	
	
	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
	 * @throws SigarException 
	 */
	@Test
	public void testGetCpuMachineInfoBy() throws SigarException {
		HashMap<String, Object> actualGetCpuMachineInfoBy = this.cpuObj.getCpuMachineInfo();
		HashMap<String, Object> expectedGetCpuMachineInfoBy = cpuMachineInfoMapTestArg;
		
		assertEquals(expectedGetCpuMachineInfoBy, actualGetCpuMachineInfoBy);
	}	
}
