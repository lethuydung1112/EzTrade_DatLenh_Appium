package Page;
import Base.LogUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.testng.SkipException;

import java.sql.SQLOutput;
import java.time.LocalTime;

public class DatLenhPage extends BasePage{
    private final By datLenhBtn = By.xpath("//android.widget.ImageView[@content-desc=\"Đặt lệnh\"]");
    private final By laymaOtpBtn = By.xpath("//android.view.View[@content-desc=\"Lấy mã OTP\"]");
    private final By otpField = By.xpath("//android.widget.EditText");
    private final By otpDone = By.xpath("//android.view.View[@content-desc=\"Bỏ qua\"]");
    private final By manOtpThanhCong = By.xpath("//android.widget.ImageView[@content-desc=\"Thông báo\n" +
            "Xác thực thành công\n" +
            "OK\"]");
    private final By backBtn = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)");
    private final By giaField = By.xpath("//android.view.View[contains(@content-desc, 'Sức mua')]/android.view.View[12]/android.widget.EditText");
   // private final By giaField =  AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)");
  //  private final By khoiLuongField = By.xpath("//android.view.View/android.view.View[12]/android.widget.EditText");
     private final By khoiLuongField = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)");
    private final By trangThaiTKTienMat = AppiumBy.androidUIAutomator("new UiSelector().description(\"Tiền mặt\")");
    private final By chuyenTrangthaiTkMargin = AppiumBy.androidUIAutomator("new UiSelector().description(\"Margin\")");;
    private final By sendkeyMack = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")");
//    private final By listMaCkField = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View");
//   private final By trangThaiMua = AppiumBy.accessibilityId("Mua");
    private final By xemChiTietBtn = AppiumBy.accessibilityId("Xem chi tiết");
    private final By trangThaiban = AppiumBy.accessibilityId("Bán");
    private final By giaLO = By.xpath("//android.view.View[@content-desc=\"LO\"]");
    private final By giaATO = By.xpath("//android.view.View[@content-desc=\"ATO\"]");
    private final By giaMP = By.xpath("//android.view.View[@content-desc=\"MP\"]");
    private final By giaATC = By.xpath("//android.view.View[@content-desc=\"ATC\"]");
    private final By giaMTL = By.xpath("//android.view.View[@content-desc=\"MTL\"]");
    private final By giaMAK = By.xpath("//android.view.View[@content-desc=\"MAK\"]");
    private final By giaMOK = By.xpath("//android.view.View[@content-desc=\"MOK\"]");
    private final By giaPLO = By.xpath("//android.view.View[@content-desc=\"PLO\"]");
    private final By datGiaXongBtn = By.xpath("//android.view.View[@content-desc=\"Xong\"]");
 //   private final By khoiLuong100= By.xpath("//android.view.View[@content-desc=\"+100\"]");
    private final By datMuaBtn = AppiumBy.androidUIAutomator("new UiSelector().description(\"Đặt mua\")");
    private final By datbanBtn = AppiumBy.accessibilityId("Đặt bán");
    private final By ghiBanBtn = AppiumBy.accessibilityId("Ghi bán");
    private final By xacNhanBtn = AppiumBy.accessibilityId("Xác nhận");
    private final By ghiLenhBtnMarM = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(13)");
    private final By ghilenhBtn =  AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(12)");
    private final By ghilenhBanBtn =  AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(13)");
    private final By ghilenhBanMarM = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(16)");
 //   private final By guiTungLenhBan = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(24)");
    private final By guiTungLenhM = By.xpath("//android.view.View[contains(@content-desc, 'Giá đặt')]//android.widget.ImageView[1]");
     private final By guiTungLenhMarM = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(26)");
    private final By ghiMuaBtn =AppiumBy.accessibilityId("Ghi mua");
    private final By guiAllBtn = By.xpath("//android.view.View[@content-desc=\"Gửi tất cả\"]");
    private final By showGhiLenhBtn = By.xpath("//android.widget.ImageView[contains(@content-desc, 'Lệnh chờ')]");
    private final By thoatDanhSachGhiLenhBtn = AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Danh sách lệnh chờ\")");
    private final By thoatKetQuaGd = By.xpath("//android.widget.ImageView");
    private final By DanhsachGhiLenh =  AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(63)");
    public void clickThoatListKQGiaoDich()
    {
        click(thoatKetQuaGd);
    }
    public void clickLayMaOtp()
    {
        click(laymaOtpBtn);
    }
    public void setTrangThaiBan()
    {
        click(trangThaiban);
    }
    public void clickDatMua()
    {
        setTouchAction(625,945);
    }
    public void clickDatBan()
    {
        click(datbanBtn);
    }
    public void setOtpField(String otp)
    {
        click(otpField);
        setSendkey(otpField, otp);
    }
    public void clickGuiTungLenhMarM()
    {
        click(guiTungLenhMarM);
        if(isElementVisible(DanhsachGhiLenh))
        {
            clickThoatDanhSachDatLenh();
        }
    }
    public void clickTrangDatLenh()
    {
        click(datLenhBtn);
    }
    public void setMaCk(String mack) throws InterruptedException {
        Thread.sleep(2000);
       try{
           setTouchAction(117,178);
        setSendkey(sendkeyMack, mack);
        Thread.sleep(2000);
        setTouchAction(100,280);}
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
    public void setGia(String gia){
     //  click(giaField);
       setTouchAction(225,1009);
        typeUsingMobileType(driver, gia);
      // setSendkey(giaField, gia);
//        System.out.println(gia);
    }
    public void setKhoiLuong(String khoiluong){
      click(khoiLuongField);
     //   setTouchAction(650,850);
//       click(khoiLuong100);
        typeUsingMobileType(driver, khoiluong);
    }
    public void setGiaLO()
    {
        click(giaLO);
    }
    public void setGiaATO()
    {
        click(giaATO);
        click(datGiaXongBtn);
    }
    public void setGiaATC()
    {
        click(giaATC);
        click(datGiaXongBtn);
    }
    public void setGiaMP()
    {
        click(giaMP);
        click(datGiaXongBtn);
    }
    public void setGiaMTL()
    {
        click(giaMTL);
        click(datGiaXongBtn);
    }
    public void setGiaMAK()
    {
        click(giaMAK);
        click(datGiaXongBtn);
    }
    public void setGiaMOK()
    {
        click(giaMOK);
        click(datGiaXongBtn);
    }
    public void setGiaPLO()
    {
        click(giaPLO);
        click(datGiaXongBtn);
    }
    public void clickDoneOtp()
    {
        click(otpDone);
    }
    public void clickXacNhan() throws InterruptedException {
        click(xacNhanBtn);
        Thread.sleep(2000);
    }
    private String kL = "0 / {khoiluong}";
    private String maCk = "{mack}";
    private String Gia = "{gia}";
    public Boolean checkDatLenh(String mack, String khoiluong, String gia) throws InterruptedException {
        click(xemChiTietBtn);
        Thread.sleep(1000);
        setTouchAction(405,519);
        By checkMack = AppiumBy.accessibilityId(maCk.replace("{mack}", mack));
        By checkKl = AppiumBy.accessibilityId(kL.replace("{khoiluong}", khoiluong));
        By checkGia = AppiumBy.accessibilityId(Gia.replace("{gia}", gia));
        System.out.println(isElementVisible(checkMack));
        System.out.println(isElementVisible(checkKl));
        System.out.println(isElementVisible(checkGia));
        return isElementVisible(checkMack) && isElementVisible(checkKl) && isElementVisible(checkGia);
    }
    public void thoatSoLenh()
    {
        setTouchAction(689,372);
        click(backBtn);
    }
    public void clickOKOtp() throws InterruptedException {
        Thread.sleep(20000);
        waitToElementVisible(manOtpThanhCong);
        setTouchAction(428,1009);
    }
    public void clickGuiAll()
    {
          //  click(showGhiLenhBtn);
            click(guiAllBtn);
    }
    public void showDanhSachGhiLenh()
    {
        click(showGhiLenhBtn);
    }
    public void clickBatGhiLenh()
    {
            if(!isElementVisible(ghiMuaBtn))
            {
                System.out.println("Ghi lệnh chưa được bật và sẽ được bật sau lệnh này");
                click(ghilenhBtn);
                System.out.println("Ghi Lệnh đã được bật");
                if(isElementVisible(DanhsachGhiLenh))
                {
                    System.out.println("đã tắt danh sách lệnh ghi");
                    clickThoatDanhSachDatLenh();
                }
                else
                {
                    System.out.println("Danh sách ghi lệnh không được bật lên");
                }
            }
            else
            {
                System.out.println("Ghi lệnh đã được bật sẵn");
            }
    }
    public void clickBatGhiLenhMarM()
    {
        if(!isElementVisible(ghiMuaBtn))
        {
            System.out.println("Ghi lệnh chưa được bật và sẽ được bật sau lệnh này");
            click(ghiLenhBtnMarM);
            System.out.println("Ghi Lệnh đã được bật");
            if(isElementVisible(DanhsachGhiLenh))
            {
                System.out.println("đã tắt danh sách lệnh ghi");
                clickThoatDanhSachDatLenh();
            }
            else
            {
                System.out.println("Danh sách ghi lệnh không được bật lên");
            }
        }
        else
        {
            System.out.println("Ghi lệnh đã được bật sẵn");
        }
    }
    public void clickBatGhiLenhBan()
    {
        if(!isElementVisible(ghiBanBtn))
        {
            System.out.println("Ghi lệnh chưa được bật và sẽ được bật sau lệnh này");
            click(ghilenhBanBtn);
            System.out.println("Ghi Lệnh đã được bật");
            if(isElementVisible(DanhsachGhiLenh))
            {
                System.out.println("đã tắt danh sách lệnh ghi");
                clickThoatDanhSachDatLenh();
            }
            else
            {
                System.out.println("Danh sách ghi lệnh không được bật lên");
            }
        }
        else
        {
            System.out.println("Ghi lệnh đã được bật sẵn");
        }
    }
    public void clickBatGhiLenhBanMarM()
    {
        if(!isElementVisible(ghiBanBtn))
        {
            System.out.println("Ghi lệnh chưa được bật và sẽ được bật sau lệnh này");
            click(ghilenhBanMarM);
            System.out.println("Ghi Lệnh đã được bật");
            if(isElementVisible(DanhsachGhiLenh))
            {
                System.out.println("đã tắt danh sách lệnh ghi");
                clickThoatDanhSachDatLenh();
            }
            else
            {
                System.out.println("Danh sách ghi lệnh không được bật lên");
            }
        }
        else
        {
            System.out.println("Ghi lệnh đã được bật sẵn");
        }
    }
    public void clickTatGhiLenh()
    {
        if(isElementVisible(ghiMuaBtn))
        {
            System.out.println("Ghi lệnh đanh bật và sẽ tắt sau lệnh này ");
            click(ghilenhBtn);
        }
    }
    public void clickTatGhiLenhBan()
    {
        if(isElementVisible(ghiBanBtn))
        {
            System.out.println("Ghi lệnh đanh bật và sẽ tắt sau lệnh này ");
            click(ghilenhBanBtn);
        }
    }
    public void clickTatGhiLenhBanMarM()
    {
        if(isElementVisible(ghilenhBanMarM))
        {
            System.out.println("Ghi lệnh đanh bật và sẽ tắt sau lệnh này ");
            click(ghilenhBanBtn);
        }
    }
    public void clickTatGhiLenhMarM()
    {
        if(isElementVisible(ghiMuaBtn))
        {
            System.out.println("Ghi lệnh đanh bật và sẽ tắt sau lệnh này ");
            click(ghiLenhBtnMarM);
        }
    }
    public void clickGhiMua()
    {
        click(ghiMuaBtn);
    }
    public void clickGhiBan()
    {
        click(ghiBanBtn);
    }
    public void clickThoatDanhSachDatLenh()
    {
        click(thoatDanhSachGhiLenhBtn);
    }
    public void clickGuiTungLenh()
    {
        setTouchAction(618, 1017);
        if(isElementVisible(DanhsachGhiLenh))
        {
            clickThoatDanhSachDatLenh();
        }
    }
    public void clickGuiTungLenhBan()
    {
        setTouchAction(618, 1053);
        if(isElementVisible(DanhsachGhiLenh))
        {
            clickThoatDanhSachDatLenh();
        }
    }
    public void setChuyenTrangthaiTkMargin()
    {
        click(trangThaiTKTienMat);
        click(chuyenTrangthaiTkMargin);
    }
    public void RunOnlyInTimeRange(String sesstionName, LocalTime start, LocalTime end)
    {
        LocalTime now = LocalTime.now();
        if(now.isBefore(start) ||  now.isAfter(end))
        {
            LogUtils.info("Bỏ qua test do thời gian này không đăng được lệnh phiên định kì");
            throw new SkipException("Bỏ qua test: " + sesstionName + " không nằm trong " + start + " - " + end);
        }
    }
    public void RunOnlyOutSideATOAndATC()
    {
        LocalTime now = LocalTime.now();
        boolean inATO = now.isAfter(LocalTime.of(8,59,59)) && now.isBefore(LocalTime.of(9,15,1));
        boolean inATC = now.isAfter(LocalTime.of(2, 29,59)) && now.isBefore(LocalTime.of(2,45,1));
        if(inATO || inATC)
        {
            throw new SkipException("Bỏ qua test do đang trong phiên ATO hoặc ATC");
        }
    }



}
