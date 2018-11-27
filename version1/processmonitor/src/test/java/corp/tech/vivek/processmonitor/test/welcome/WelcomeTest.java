package corp.tech.vivek.processmonitor.test.welcome;

import corp.tech.vivek.processmonitor.ProcessmonitorApplicationTests;
import corp.tech.vivek.processmonitor.welcome.Welcome;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 *
 * shortNote: 1 test in -91ms
 */
public class WelcomeTest {
    private Welcome welcomeObj;

    @Before
    public void setup() {
        welcomeObj = new Welcome();
    }

    @Test
    public void testWelcomeMsg() {
        Assert.assertEquals(
                "Welcome to Spring Boot World! You going to rock on!!!",
                welcomeObj.welcomeMsg()
        );
    }
}
