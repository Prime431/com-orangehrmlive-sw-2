package testsuite;

import browserfactory.BaseTest;
import com.beust.ah.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest { // Creating base for the project
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    } //Method for launching the browser
@Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        driver.findElement(By.name("username")).sendKeys("Admin");  //Username enter
        driver.findElement(By.name("password")).sendKeys("admin123"); //Password enter
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click(); // clicking login button
        String expectedText = "Dashboard";  //Storing expected Text
        String actualText = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText(); //// storing actual Text
        Assert.assertEquals(expectedText, actualText); // Comparing actual and expected text
    }
    @After
    public void tearDown(){
        closeBrowser(); //closing the browser
    }
}
