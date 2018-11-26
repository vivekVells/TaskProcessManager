package kev.hub;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import kev.cpu.CpuInfoUsageTest;
import kev.version.info.VersionInfoTest;
import kev.utility.UtilityPackTest;

@RunWith(Suite.class)
@SuiteClasses({
	CpuInfoUsageTest.class,
	VersionInfoTest.class,
	UtilityPackTest.class,
})

public class AllTests {

}
