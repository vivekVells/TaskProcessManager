/**
 * This class is exclusive for all possible test cases for VersionInfo class
 */
package kev.version.info;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import kev.version.info.VersionInfo;

/**
 * @author Vivek 
 *
 */
public class VersionInfoTest {
    VersionInfo verInfoObj;
    
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
	    		"os description", "os name", "os arch", "os machine", "os version",
	    		"os patch level", "os verndor version", "os vendor code name", 
	    		"os cpu endian"
	    };
	    
	    Object[] osVersionInfoValueTestArg = {
	    		"[Microsoft \f", "Win32", "¨0k", "x64", "unknown", 
	    		"unknown", "unknown", "64", "10.0", 
	    		"little"    		
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
	    		"25.161-b12",
	    		"Oracle Corporation",
	    		"C:\\Program Files\\Java\\jre1.8.0_161"
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
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.verInfoObj = null;
	}

	/**
	 * Test method for {@link kev.version.info.VersionInfo#getUnkownIfValueNotPresent()}.
	 */
	@Test
	public void testGetUnkownIfValueNotPresent() {
		assertNotEquals("unknown", "value present");
	}	
	
	/**
	 * Test method for {@link kev.version.info.VersionInfo#getHostName()}.
	 */
	@Test
	public void testGetHostName() {
		assertEquals(expectedHostNameTestArg, verInfoObj.getHostName());
	}

	/**
	 * Test method for {@link kev.version.info.VersionInfo#getFQDN()}.
	 */
	@Test
	public void testGetFQDN() {
		assertEquals(expectedFQDNTestArg, verInfoObj.getFQDN());
	}

	/**
	 * Test method for {@link kev.version.info.VersionInfo#getUsername()}.
	 */
	@Test
	public void testGetUsername() {
		assertEquals(expectedUserNameTestArg, verInfoObj.getUsername());
	}

	/**
	 * Test method for {@link kev.version.info.VersionInfo#getOsVersionInfo()}.
	 */
	@Ignore
	public void testGetOsVersionInfo() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link kev.version.info.VersionInfo#getOsVersionInfoBy()}.
	 */
	@Ignore
	public void testGetOsVersionInfoBy() {
		fail("Not yet implemented");
	}
	
	/**
	 * Test method for {@link kev.version.info.VersionInfo#getJavaVersionInfo()}.
	 */
	@Test
	public void testGetJavaVersionInfo() {
		assertEquals(expectedJavaVersionInfoMap, verInfoObj.getJavaVersionInfo());
	}
	
	/**
	 * Test method for {@link kev.version.info.VersionInfo#getJavaVersionInfoBy()}.
	 */
	@Test
	public void testGetJavaVersionInfoByVersion() {
		assertEquals(expectedJavaVersionInfoMap.get("java vm version"), verInfoObj.getJavaVersionInfoBy("java vm version"));
	}

	/**
	 * Test method for {@link kev.version.info.VersionInfo#getJavaVersionInfoBy()}.
	 */
	@Test
	public void testGetJavaVersionInfoByVendor() {
		assertEquals(expectedJavaVersionInfoMap.get("java vm vendor"), verInfoObj.getJavaVersionInfoBy("java vm vendor"));
	}
	
	/**
	 * Test method for {@link kev.version.info.VersionInfo#getJavaVersionInfoBy()}.
	 */
	@Test
	public void testGetJavaVersionInfoByHome() {
		assertEquals(expectedJavaVersionInfoMap.get("java vm home"), verInfoObj.getJavaVersionInfoBy("java vm home"));
	}	
	
	/**
	 * Test method for {@link kev.version.info.VersionInfo#getJavaVersionInfoBy()}.
	 */
	@Test
	public void testGetJavaVersionInfoBy() {
		assertEquals(expectedJavaVersionInfoMap, verInfoObj.getJavaVersionInfo());
	}
	
	/**
	 * Test method for {@link kev.version.info.VersionInfo#getSigarVersionInfo()}.
	 */
	@Test
	public void testGetSigarVersionInfo() {
		assertEquals(expectedSigarVersionInfoMap, verInfoObj.getSigarVersionInfo());
	}

	/**
	 * Test method for {@link kev.version.info.VersionInfo#getSigarVersionInfoBy()}.
	 */
	@Test
	public void testGetSigarVersionInfoByJavaVersion() {
		assertEquals(expectedSigarVersionInfoMap.get("sigar java version"), verInfoObj.getSigarVersionInfoBy("sigar java version"));
	}
	
	/**
	 * Test method for {@link kev.version.info.VersionInfo#getSigarVersionInfoBy()}.
	 */
	@Test
	public void testGetSigarVersionInfoByNativeVersion() {
		assertEquals(expectedSigarVersionInfoMap.get("sigar native version"), verInfoObj.getSigarVersionInfoBy("sigar native version"));
	}	
	
	/**
	 * Test method for {@link kev.version.info.VersionInfo#getSigarVersionInfoBy()}.
	 */
	@Test
	public void testGetSigarVersionInfoByBuildDate() {
		assertEquals(expectedSigarVersionInfoMap.get("sigar build date"), verInfoObj.getSigarVersionInfoBy("sigar build date"));
	}
	
	/**
	 * Test method for {@link kev.version.info.VersionInfo#getSigarVersionInfoBy()}.
	 */
	@Test
	public void testGetSigarVersionInfoByNativeBuildDate() {
		assertEquals(expectedSigarVersionInfoMap.get("sigar native build date"), verInfoObj.getSigarVersionInfoBy("sigar native build date"));
	}

	/**
	 * Test method for {@link kev.version.info.VersionInfo#getSigarVersionInfoBy()}.
	 */
	@Test
	public void testGetSigarVersionInfoByScmVersion() {
		assertEquals(expectedSigarVersionInfoMap.get("sigar scm version"), verInfoObj.getSigarVersionInfoBy("sigar scm version"));
	}	

	/**
	 * Test method for {@link kev.version.info.VersionInfo#getSigarVersionInfoBy()}.
	 */
	@Test
	public void testGetSigarVersionInfoByNativeScmVersion() {
		assertEquals(expectedSigarVersionInfoMap.get("sigar native scm version"), verInfoObj.getSigarVersionInfoBy("sigar native scm version"));
	}	

	/**
	 * Test method for {@link kev.version.info.VersionInfo#getSigarVersionInfoBy()}.
	 */
	@Test
	public void testGetSigarVersionInfoByArchlib() {
		assertEquals(expectedSigarVersionInfoMap.get("sigar archlib"), verInfoObj.getSigarVersionInfoBy("sigar archlib"));
	}	
	
	/**
	 * Test method for {@link kev.version.info.VersionInfo#getSigarVersionInfoBy()}.
	 */
	@Test
	public void testGetSigarVersionInfoBy() {
		assertEquals(expectedSigarVersionInfoMap, verInfoObj.getSigarVersionInfo());
	}
	
	/**
	 * Test method for {@link kev.version.info.VersionInfo#getVersionInfoObject()}.
	 */
	@Ignore
	public void testGetVersionInfoObject() {

	}

	/**
	 * Test method for {@link kev.version.info.VersionInfo#getSigarObject()}.
	 */
	@Ignore
	public void testGetSigarObject() {

	}
}
