package Login;

import Base.BaseTest;
import Base.LogUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {

    @Test
    public void testCase1() {
        LogUtils.info("Test case ko nhập stk,mk");
        lP.clickTrangDangnhap();
        lP.clickAnotherAcc();
        lP.clickAnotherAcc2();
        lP.Dangnhap("", "");
        boolean check = lP.checkShowAlertUser() && lP.checkShowAlertPassword();
        LogUtils.info("kết quả test: " + check);
        Assert.assertTrue(check);
    }

    @Test
    public void testCase2() {
        LogUtils.info("Test case ko nhập mk");
        lP.Dangnhap("058C151000", "");
        boolean check = lP.checkShowAlertPassword();
        LogUtils.info("kết quả test: " + check);
        Assert.assertTrue(check);
    }

    @Test
    public void testCase3(){
        LogUtils.info("Test case ko nhập stk");
        lP.Dangnhap("", "123456");
        boolean check = lP.checkShowAlertUser();
        LogUtils.info("kết quả test: " + check);
        Assert.assertTrue(check);
    }

    @Test
    public void testCase4(){
        LogUtils.info("Test case nhập stk là 058C");
        lP.Dangnhap("058C", "123456");
        boolean check = lP.checkShowAlertUser();
        LogUtils.info("kết quả test: " + check);
        Assert.assertTrue(check);
    }

    @Test
    public void testCase5() throws InterruptedException {
        LogUtils.info("Test case nhập stk không đủ 10 ký tự (058C123)");
        lP.Dangnhap("058C123", "123456");
        Thread.sleep(5000);
        boolean check = lP.checkShowAlert("Tài khoản không tồn tại");
        lP.clickDaHieu();
        LogUtils.info("kết quả test: " + check);
        Assert.assertTrue(check);
    }

    @Test
    public void testCase6(){
        LogUtils.info("Test case nhập stk không tồn tại");
        lP.Dangnhap("058CABCDEF", "123456");
        boolean check = lP.checkShowAlert("Tài khoản không tồn tại");
        lP.clickDaHieu();
        LogUtils.info("kết quả test: " + check);
        Assert.assertTrue(check);
    }

    @Test
    public void testCase7(){
        LogUtils.info("Test case nhập đúng stk, nhập sai mk");
        lP.Dangnhap("058C151000", "123456");
        boolean check = lP.checkShowAlert("Mật khẩu không đúng");
        lP.clickDaHieu();
        LogUtils.info("kết quả test: " + check);
        Assert.assertTrue(check);
    }

    @Test
    public void testCase8() {
        LogUtils.info("Test case đăng nhập thành công tk thường");
        lP.Dangnhap("058C002266", "Fpts@123");
        boolean check = checkLoginThanhCong();
        LogUtils.info("kết quả test: " + check);
        lP.clickLogout();
        Assert.assertTrue(check);
    }

    @Test
    public void testCase9() throws InterruptedException {
        LogUtils.info("Test case đăng nhập thành công tk sử dụng đăng nhập xác thực 2 lớp");
        Thread.sleep(2000);
        lP.clickTrangDangnhap();
        lP.clickAnotherAcc();
        lP.clickAnotherAcc2();
        lP.Dangnhap("058C151000", "Fithai@123");
        boolean check = lP.checkXacThucOTP();
        if(check)
        {
            Thread.sleep(10000);//đợi lấy mã otp để xác thực
            boolean test = checkLoginThanhCong();
            LogUtils.info("kết quả test: " + test);
            lP.clickLogout();
            Assert.assertTrue(test);
        }
        else
        {
            LogUtils.info("kết quả test: " + false);
            Assert.assertTrue(false);
        }
    }

//    @Test
//    public void testCase10() {
//        LogUtils.info("Test case đăng nhập thành công tk đăng nhập lần đầu");
//        lP.clickTrangDangnhap();
//        lP.clickAnotherAcc();
//        lP.clickAnotherAcc2();
//        lP.Dangnhap("058C000002", "Fpts@123");
//        boolean check = lP.checkDoiMK();
//        LogUtils.info("kết quả test: " + check);
//        Assert.assertTrue(check);
//    }
}
