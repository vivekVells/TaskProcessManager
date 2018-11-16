package kev.hub;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import kev.cpu.CpuInfoUsageTest;

@RunWith(Suite.class)
@SuiteClasses({
	CpuInfoUsageTest.class,
})

public class AllTests {

}
