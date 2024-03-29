package corp.tech.vivek.processmonitor.test;

import corp.tech.vivek.processmonitor.test.cpu_info.CpuInfoUsageBaseTest;
import corp.tech.vivek.processmonitor.test.utility.UtilityPackTest;
import corp.tech.vivek.processmonitor.test.version_info.VersionInfoBaseModelTest;
import corp.tech.vivek.processmonitor.test.welcome.WelcomeTest;

import org.junit.runners.Suite;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@Suite.SuiteClasses({
        WelcomeTest.class,
        VersionInfoBaseModelTest.class,
        UtilityPackTest.class,
        CpuInfoUsageBaseTest.class,
})

/**
 *
 */
public class MainTestSuite { }
