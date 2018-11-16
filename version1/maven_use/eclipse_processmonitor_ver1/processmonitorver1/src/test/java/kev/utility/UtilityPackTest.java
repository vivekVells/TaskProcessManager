/**
 * This class is exclusive for all possible test cases for UtilityPack class
 */
package kev.utility;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.hyperic.sigar.Sigar;

/**
 * @author Vivek
 *
 */
public class UtilityPackTest {
	Sigar sigarObj;

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
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
        // Release any native resources associated with this sigar instance.
		this.sigarObj.close();
		this.sigarObj = null;
	}

	/**
	 * Test method for {@link kev.utility.UtilityPack#getSigarObject()}.
	 */
	@Test
	public void testGetSigarObject() {
		assertTrue(this.sigarObj.getClass().equals(UtilityPack.getSigarObject().getClass()));
	}
	
	/**
	 * Test method for {@link kev.utility.UtilityPack#getFormattedDecimal(double, int)}.
	 */	
	@Test (expected = Exception.class)
	public void testGetFormattedDecimalException() {
		Double actual = UtilityPack.getFormattedDecimal(3.14159, -2);
		Double expected = Double.valueOf(3.14); 
		
		assertEquals(expected, actual);
	}	

	/**
	 * Test method for {@link kev.utility.UtilityPack#getFormattedDecimal(double, int)}.
	 */
	@Test
	public void testGetFormattedDecimal() {
		Double actual = UtilityPack.getFormattedDecimal(3.14159, 2);
		Double expected = Double.valueOf(3.14); 
		
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link kev.utility.UtilityPack#getUnkownIfValueNotPresent()}.
	 */
	@Test
	public void testGetUnkownIfValueNotPresent() {
		assertNotEquals("unknown", "value present");
	}	
}
