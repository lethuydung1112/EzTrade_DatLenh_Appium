package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginPage extends BasePage{
    private final By trangLoginBtn = By.xpath("//android.view.View[@content-desc=\"Đăng nhập\"]");
    private final By anotherAccBtn = By.xpath("//android.widget.Button[@content-desc=\"Sử dụng tài khoản khác\"]");
    private final By anotherAccBtn2 = By.xpath("//android.widget.ImageView[@content-desc=\"Sử dụng tài khoản khác\"]");
    private final By usernameField = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    private final By passwordField = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    private final By luuMatKhauBtn = By.xpath("//android.widget.CheckBox");
    private final By quenMatKhauBtn = By.xpath("//android.view.View[@content-desc=\"Quên mật khẩu?\"]");
    private final By dangNhapBtn = By.xpath("//android.widget.Button[@content-desc=\"Đăng nhập\"]");
    private final By chuyenNgonNguBtn = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.ImageView[2]");
    private final By chuyenTiengViet = By.xpath("//android.view.View[@content-desc=\"Tiếng Việt\"]");
    private final By chuyenTiengAnh = By.xpath("//android.widget.ImageView[@content-desc=\"English\"]");
    private final By ckeckTK = By.xpath("//android.view.View[@content-desc]");
    private final By btnDaHieu = By.xpath("//android.view.View[@content-desc=\"Đã hiểu\"]");
    private String xpathAlert = "//android.view.View[@content-desc=\"{textAlert}\"]\n";
    private final By alertUser = By.xpath("//android.view.View[@content-desc=\"Vui lòng nhập số tài khoản hoặc bí danh\"]");
    private final By alertPass = By.xpath("//android.view.View[@content-desc=\"Vui lòng nhập mật khẩu\"]");
    private final By XacThucOTP = By.xpath("//android.view.View[@content-desc=\"Xác thực OTP\"]");
    private final By OTPInput = By.xpath("//android.widget.EditText");
    private final By CheckLogin = By.xpath("//*[contains(@content-desc, 'Chào buổi')]");
    private final By btnLogout = By.xpath("//android.view.View[@content-desc=\"Đăng xuất\"]");
    private  By listEle = By.className("android.widget.EditText");
    private final By alertDoiMK = By.xpath("//android.view.View[@content-desc=\"Đổi mật khẩu\"]");
    public void clickTrangDangnhap()
    {
        click(trangLoginBtn);
    }
    public void clickAnotherAcc()
    {
        click(anotherAccBtn);
    }
    public void clickAnotherAcc2()
    {
        click(anotherAccBtn2);
    }
    public void setUsernameField(String text)
    {
        setSendkey(usernameField, text);
    }
    public void setPasswordField(String text)
    {
        click(passwordField);
        setSendkey(passwordField,text);
    }
    public void clickDangNhap()
    {
        click(dangNhapBtn);
    }
    public void Dangnhap(String user, String pass)
    {
        click(usernameField);
        setSendkey(usernameField, user);
        click(passwordField);
        setSendkey(passwordField, pass);
        click(dangNhapBtn);
    }

    public void actionCheckStk(String stk)
    {
        try
        {
            List<WebElement> listAcc = findEles(ckeckTK);
            boolean found = false;
            for(WebElement ele : listAcc)
            {
                String contentDesc = ele.getAttribute("content-desc");
                System.out.println("Stk đã tìm thấy: " + contentDesc);
                if(contentDesc != null && contentDesc.contentEquals(stk))
                {
                    System.out.println("Stk đã tìm thấy: " + contentDesc);
                    ele.click();
                    found = true;
                    break;
                }
                else if(contentDesc != null && !contentDesc.contentEquals(stk))
                {
                    System.out.println("Stk hiện tại chưa từng đăng nhập vào thiết bị này ");
                    click(anotherAccBtn);
                }
                else
                {
                    System.out.println("Stk hiện chưa từng đăng nhập vào thiết bị này hoặc đã xảy ra lỗi");
                }
            }
        }
        catch(Exception e)
        {
            e.getCause();
            e.getMessage();
        }
    }

    public boolean checkShowAlert(String textAlert){
        By ckeckAlert = By.xpath(xpathAlert.replace("{textAlert}", textAlert));
        return isElementVisible(ckeckAlert);
    }

    public boolean checkShowAlertUser(){
        return isElementVisible(alertUser);
    }

    public boolean checkShowAlertPassword(){
        return isElementVisible(alertPass);
    }

    public void clickDaHieu()
    {
        click(btnDaHieu);
    }

    public boolean checkXacThucOTP()
    {
        return isElementVisible(XacThucOTP);
    }

    public void XacThucOTP(String otp){
        click(OTPInput);
        setSendkey(OTPInput, otp);
    }

    public boolean checkLoginThanhCong(){
        return isElementVisible(CheckLogin);
    }

    public  void clickLogout(){
        click(CheckLogin);
        click(btnLogout);
    }

    public boolean checkDoiMK(){
        return isElementVisible(alertDoiMK);
    }
}
