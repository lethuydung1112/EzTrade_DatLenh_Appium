package Page;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class BasePage {
    public static AndroidDriver driver;
    public static WebDriverWait wait ;
    public static WebDriver webDriver;
    public void setWait(AndroidDriver driver)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void SetDriver(AndroidDriver driver)
    {
        BasePage.driver = driver;
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }
    public void setWebDriver(WebDriver webDriver)
    {
        BasePage.webDriver = webDriver;
    }
    protected WebElement find(By locator)
    {
        return driver.findElement(locator);
    }
    protected List<WebElement> findEles(By locator)
    {
        return driver.findElements(locator);
    }
//    public void waitToElementVisible(WebElement element)
//    {
//    if(wait == null)
//        {
//            System.out.println("WebDriverWait chưa được khởi tạo! Gọi setWait(driver) trước.");
//        }
//            wait.until(ExpectedConditions.visibilityOf(element));
//    }
    protected void setSendkey(By locator, String text)
    {
            waitToElementClickable(locator);
            WebElement element = find(locator);
            element.clear();
            element.sendKeys(text);
    }
    protected void click(By locator)
    {
        waitToElementVisible(locator);
        find(locator).click();
    }
    protected void dieuHuongToiURl(String url){
        driver.navigate().to(url);
    }
    public void pressEnterKey(AndroidDriver driver) {
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

//    public void tap(int x, int y) {
//        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        Sequence tap = new Sequence(finger, 1);
//        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
//        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//        driver.perform(Collections.singletonList(tap));
//    }
    public  void setTouchAction(int x, int y){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(x, y)).perform();
    }

    public void typeUsingMobileType(AndroidDriver driver , String text) {
        Map<String, Object> args = new HashMap<>();
        args.put("text", text);
        args.put("strategy", "focus");
        ((JavascriptExecutor) driver).executeScript("mobile: type", args);
    }

    public void waitToElementClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(find(locator)));
    }

    public void waitToElementVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public boolean isElementVisible(By locator) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
    public static AndroidDriver getDriver() {
        return driver;
    }

}
