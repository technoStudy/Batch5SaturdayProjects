package project11;

import org.junit.Test;

public class Part1 {
    /*
            1) Navigate to  http://demoqa.com/text-box
            2) Maximize the window
            3) Enter full name as "Automation"
            4) Enter Email as "Testing@gmail.com"
            5) Enter Current Address as "Testing Current Address"
            6) Enter Permanent Address as "Testing Permanent Address"
            7) Click on submit button
            8) Print Name in the text box
            9) Print Email in the text box
            10) Print Current Address in the text box
            11) Print Permanent Address in the text box
     */

    /*
    IMPORTANT NOTE:
    If your Chrome browser refuses to open the website due to security reason and
    shows the following error:

    Your connection is not private
    Attackers might be trying to steal your information from demoqa.com (for example, passwords, messages, or credit cards). Learn more
    NET::ERR_CERT_DATE_INVALID

    Then use the following code for your driver declaration (Do not forget to do the necessary class imports):
        ChromeOptions capability = new ChromeOptions();
        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        WebDriver driver = new ChromeDriver(capability);
     */

    @Test
    public void test1() {

    }
}
