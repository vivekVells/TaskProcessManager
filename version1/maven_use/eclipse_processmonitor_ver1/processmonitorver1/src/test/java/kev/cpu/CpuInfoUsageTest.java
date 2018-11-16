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

import org.hyperic.sigar.Sigar;
import kev.cpu.CpuInfoUsage;

/**
 * @author Vivek
 *
 */
public class CpuInfoUsageTest {
	CpuInfoUsage cpuObj;
	Sigar sigar;

	static HashMap<String, Object> cpuMachineInfoMapTestArg = null;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cpuMachineInfoMapTestArg = new HashMap<String, Object>();
		
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
		this.sigar = new Sigar();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.cpuObj = null;
		this.sigar = null;
	}

	/**
	 * To get cpuMachineInoArrayForTest object array values
	 * 
	 * @param arg
	 * @return mapped value avail in cpuMachineInoMapForTest Hashmap
	 */
	public static Object getCpuMachineInfoMapValues(String arg) {
		return cpuMachineInfoMapTestArg.get(arg);
	}	

	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getFormattedDecimal(java.lang.Double)}.
	 */ 
	@Test
	public void testGetFormattedDecimal() {
		Double actual = this.cpuObj.getFormattedDecimal(3.14159, 2);
		Double expected = Double.valueOf(3.14); 
		
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#retrieveCpuPerc(org.hyperic.sigar.CpuPerc)}.
	 * @throws SigarException 
	 * @throws InterruptedException 
	 */
	@Ignore
	public void testRetrieveCpuPerc() throws InterruptedException, SigarException { 		
		HashMap<String, Object> actualRectrieveCpuPerc = this.cpuObj.retrieveCpuPerc(this.sigar.getCpuPerc());
		// HashMap<String, Object> expectedRectrieveCpuPerc;
		
		assertEquals(actualRectrieveCpuPerc.size(), 7);	
	}

	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getIndividualCpuUsageInfo()}.
	 * @throws SigarException 
	 * @throws InterruptedException 
	 */
	@Ignore
	public void testGetIndividualCpuUsageInfo() throws InterruptedException, SigarException {
		HashMap<String, Object> actualRectrieveCpuPerc = this.cpuObj.retrieveCpuPerc(this.sigar.getCpuPerc());
		// HashMap<String, Object> expectedRectrieveCpuPerc;
		
		assertEquals(actualRectrieveCpuPerc.size(), 7);	
	}

	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getTotalCpuUsageInfo()}.
	 * @throws SigarException 
	 * @throws InterruptedException 
	 */
	@Ignore
	public void testGetTotalCpuUsageInfo() throws InterruptedException, SigarException {
		HashMap<String, Object> actualRectrieveCpuPerc = this.cpuObj.retrieveCpuPerc(this.sigar.getCpuPerc());
		// HashMap<String, Object> expectedRectrieveCpuPerc;
		
		assertEquals(actualRectrieveCpuPerc.size(), 7);	
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
		String expected = (String) getCpuMachineInfoMapValues("vendor");
		
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
	 * @throws SigarException 
	 */
	@Test
	public void testGetCpuMachineInfoByModel() throws SigarException {
		String actual = (String) this.cpuObj.getCpuMachineInfoBy("model");
		String expected = (String) getCpuMachineInfoMapValues("model");
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
	 * @throws SigarException 
	 */
	@Test
	public void testGetCpuMachineInfoByOperatingAt() throws SigarException {
		Integer actual = (Integer) this.cpuObj.getCpuMachineInfoBy("operating at");
		Integer expected = (Integer) getCpuMachineInfoMapValues("operating at");
		
		assertEquals(expected, actual);
	}	
	
	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
	 * @throws SigarException 
	 */
	@Test
	public void testGetCpuMachineInfoByTotalCores() throws SigarException {
		Integer actual = (Integer) this.cpuObj.getCpuMachineInfoBy("total cores");
		Integer expected = (Integer) getCpuMachineInfoMapValues("total cores");
		
		assertEquals(expected, actual);
	}	

	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
	 * @throws SigarException 
	 */
	@Test
	public void testGetCpuMachineInfoByTotalSockets() throws SigarException {
		Integer actual = (Integer) this.cpuObj.getCpuMachineInfoBy("total sockets");
		Integer expected = (Integer) getCpuMachineInfoMapValues("total sockets");
		
		assertEquals(expected, actual);
	}	
	
	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuMachineInfoBy(java.lang.String)}.
	 * @throws SigarException 
	 */
	@Test
	public void testGetCpuMachineInfoByCoresPerSocket() throws SigarException {
		Integer actual = (Integer) this.cpuObj.getCpuMachineInfoBy("cores per socket");
		Integer expected = (Integer) getCpuMachineInfoMapValues("cores per socket");
		
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
