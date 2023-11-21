package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/"; // URL

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    } //opening baseUrl

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click(); // clicking on forget password
        String expectedText = "Reset Password"; //expected text
        String actualText = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")).getText(); //getting actual message
        Assert.assertEquals(actualText, expectedText); //comparing message
    }

    @After
    public void tearDown() {
        closeBrowser(); // closing browser
    }
}
