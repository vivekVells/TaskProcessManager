package corp.tech.vivek.processmonitor.test;

import corp.tech.vivek.processmonitor.test.cpu_info.CpuInfoUsageTest;
import corp.tech.vivek.processmonitor.test.utility.UtilityPackTest;
import corp.tech.vivek.processmonitor.test.version_info.VersionInfoTest;
import corp.tech.vivek.processmonitor.test.welcome.WelcomeTest;

import org.junit.runners.Suite;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@Suite.SuiteClasses({
        WelcomeTest.class,
        VersionInfoTest.class,
        UtilityPackTest.class,
        CpuInfoUsageTest.class,
})

/**
 *
 */
public class MainTestSuite { }