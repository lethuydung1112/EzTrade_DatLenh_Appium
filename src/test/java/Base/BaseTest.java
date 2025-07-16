package Base;

import Page.BasePage;
import Page.DatLenhPage;
import Page.LoginPage;
import Page.OtpPage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest extends LoginPage{
    protected static final String appium_Server_Url = "http://127.0.0.1:4723/wd/hub";
    protected URL appiumServer;
    protected LoginPage lP;
    protected BasePage bP;
    protected OtpPage otpP;
    protected DatLenhPage dL;

    @BeforeClass
    public void setUp() throws InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appium:automationName", "UiAutomator2");
        cap.setCapability("appium:udid", "127.0.0.1:62001");
        cap.setCapability("appium:noReset", true);
        cap.setCapability("appium:appPackage", "com.fpts.ezmobilev3.dev");
        cap.setCapability("appium:appWaitForLaunch", true);
        cap.setCapability("appium:ignoreHiddenApiPolicyError", true);
        cap.setCapability("appium:autoGrantPermissions", true);
        cap.setCapability("appium:uiautomator2ServerInstallTimeout", 80000);
        cap.setCapability("appium:platformVersion", "9");
        cap.setCapability("appium:appActivity", "com.fpts.ezmobilev3.dev.MainActivity");
        cap.setCapability("appium:ensureWebviewsHavePages", true);
        //Tùy chọn ignoreUnimportantViews trong Appium (dành cho Android) có tác dụng tăng tốc quá trình tìm element bằng cách bỏ qua các view không quan trọng
       // cap.setCapability("ignoreUnimportantViews", true);
        cap.setCapability("appium:nativeWebScreenshot", true);
        cap.setCapability("appium:newCommandTimeout", 3600);
        cap.setCapability("appium:connectHardwareKeyboard", true);

        try {
            appiumServer = new URL(appium_Server_Url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver = new AndroidDriver(appiumServer, cap);
        lP = new LoginPage();
        bP = new BasePage();
        bP.SetDriver(driver);
        bP.setWait(driver);
        dL = new DatLenhPage();
    }
    
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
