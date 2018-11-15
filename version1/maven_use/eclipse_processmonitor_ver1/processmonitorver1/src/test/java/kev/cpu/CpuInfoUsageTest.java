/**
 * 
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

import kev.cpu.CpuInfoUsage;

/**
 * @author Vivek
 *
 */
public class CpuInfoUsageTest {
	CpuInfoUsage cpuObj;
	static HashMap<String, Object> cpuMachineInfoMapForTest = new HashMap<String, Object>();
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Object[] cpuMachineInfoArrayForTest = { "Intel", "Core(TM) i5-7500 CPU @ 3.40GHz", 3408, 4, 4, 16 };
		
		cpuMachineInfoMapForTest.put("vendor", cpuMachineInfoArrayForTest[0]);
		cpuMachineInfoMapForTest.put("model", cpuMachineInfoArrayForTest[1]);
		cpuMachineInfoMapForTest.put("operating at", cpuMachineInfoArrayForTest[2]);
		cpuMachineInfoMapForTest.put("total cores", cpuMachineInfoArrayForTest[3]);
		cpuMachineInfoMapForTest.put("total sockets", cpuMachineInfoArrayForTest[4]);
		cpuMachineInfoMapForTest.put("cores per socket", cpuMachineInfoArrayForTest[5]);
	}
	
	/**
	 * To get cpuMachineInoArrayForTest object array values
	 * 
	 * @param arg
	 * @return mapped value avail in cpuMachineInoMapForTest Hashmap
	 */
	public static Object getCpuMachineInfoMapValues(String arg) {
		return cpuMachineInfoMapForTest.get(arg);
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
		this.cpuObj = new CpuInfoUsage();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
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
	 */
	@Ignore
	public void testRetrieveCpuPerc() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getIndividualCpuUsageInfo()}.
	 */
	@Ignore
	public void testGetIndividualCpuUsageInfo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getTotalCpuUsageInfo()}.
	 */
	@Ignore
	public void testGetTotalCpuUsageInfo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#getCpuMachineInfo()}.
	 * @throws SigarException 
	 */
	@Test
	public void testGetCpuMachineInfo() throws SigarException {
		HashMap<String, Object> actualGetCpuMachineInfoBy = this.cpuObj.getCpuMachineInfo();
		HashMap<String, Object> expectedGetCpuMachineInfoBy = cpuMachineInfoMapForTest;
		
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
		HashMap<String, Object> expectedGetCpuMachineInfoBy = cpuMachineInfoMapForTest;
		
		assertEquals(expectedGetCpuMachineInfoBy, actualGetCpuMachineInfoBy);
	}	

	/**
	 * Test method for {@link kev.cpu.CpuInfoUsage#main(java.lang.String[])}.
	 */
	@Ignore
	public void testMain() {
		fail("Not yet implemented"); // TODO
	}

}
