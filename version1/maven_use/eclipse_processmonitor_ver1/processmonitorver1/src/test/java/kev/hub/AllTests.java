package kev.hub;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import kev.cpu.CpuInfoUsage;

@RunWith(Suite.class)
@SuiteClasses({
	CpuInfoUsage.class,
})

public class AllTests {

}
