package TKMarPro;

import Base.BaseTest;
import Base.LogUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalTime;

public class LenhMuaMarPro extends BaseTest {
    @BeforeClass
    public void Login() throws InterruptedException {
        lP.clickTrangDangnhap();
        lP.clickAnotherAcc();
        lP.clickAnotherAcc2();
        //   lP.actionCheckStk("058C000715");
        lP.Dangnhap("058C661668", "Fpts@123");
        Thread.sleep(3000);
        dL.clickTrangDatLenh();
        dL.clickLayMaOtp();
        dL.clickOKOtp();
    }

    @Test(dataProvider = "HSX_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 1)
    public void TC1_HSX_Buy_LO(String mack, String khoiluong, String gia) throws InterruptedException
    {
        Thread.sleep(200);
        dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
        boolean check = dL.checkDatLenh(mack, khoiluong, gia);
        dL.thoatSoLenh();
        Assert.assertTrue(check);
    }
    @Test(dataProvider = "HSX_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 2)
    public void TC2_HSX_Buy_ATO(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.RunOnlyInTimeRange("ATO", LocalTime.of(8,59,59), LocalTime.of(9,15,1));
        //    dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
        boolean check = dL.checkDatLenh(mack, khoiluong, gia);
        dL.thoatSoLenh();
        Assert.assertTrue(check);
    }
    @Test(dataProvider = "HSX_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 3)
    public void TC3_HSX_Buy_MP(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.RunOnlyOutSideATOAndATC();
       // dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
        boolean check = dL.checkDatLenh(mack, khoiluong, gia);
        dL.thoatSoLenh();
        Assert.assertTrue(check);
    }
    @Test(dataProvider = "HSX_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 4)
    public void TC4_HSX_Buy_ATC(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.RunOnlyInTimeRange("ATC", LocalTime.of(14,29,59), LocalTime.of(14,45,1));
        //  dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
        boolean check = dL.checkDatLenh(mack, khoiluong, gia);
        dL.thoatSoLenh();
        Assert.assertTrue(check);
    }
//    @Test(dataProvider = "HSX_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 5)
//    public void TC5_HSX_Buy_LO_Ghi_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.clickBatGhiLenh();
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//        dL.clickGhiMua();
//        dL.clickThoatDanhSachDatLenh();
//    }
//    @Test(dataProvider = "HSX_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 6)
//    public void TC6_HSX_Buy_ATO_Ghi_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.RunOnlyInTimeRange("ATO", LocalTime.of(8,59,59), LocalTime.of(9,15,1));
//        //dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//        dL.clickGhiMua();
//
//    }
//    @Test(dataProvider = "HSX_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 7)
//    public void TC7_HSX_Buy_MP_Ghi_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.RunOnlyOutSideATOAndATC();
//        //  dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//        dL.clickGhiMua();
//
//    }
//    @Test(dataProvider = "HSX_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 8)
//    public void TC8_HSX_Buy_ATC_Ghi_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.RunOnlyInTimeRange("ATC", LocalTime.of(14,29,59), LocalTime.of(14,45,1));
//        dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//        dL.clickGhiMua();
//        dL.showDanhSachGhiLenh();
//        //dL.clickXacNhan();
//        dL.clickGuiAll();
//        dL.clickThoatListKQGiaoDich();
//    }
//    @Test(dataProvider = "HSX_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 9)
//    public void TC9_HSX_Buy_LO_Ghi_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//        dL.clickGhiMua();
//        dL.showDanhSachGhiLenh();
//        dL.clickGuiTungLenh();
//    }
//    @Test(dataProvider = "HSX_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 10)
//    public void TC10_HSX_Buy_ATO_Ghi_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.RunOnlyInTimeRange("ATO", LocalTime.of(8,59,59), LocalTime.of(9,15,1));
//        dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//        dL.clickGhiMua();
//        dL.showDanhSachGhiLenh();
//        dL.clickGuiTungLenh();
//    }
//    @Test(dataProvider = "HSX_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 11)
//    public void TC11_HSX_Buy_MP_Ghi_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.RunOnlyOutSideATOAndATC();
//        dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//        dL.clickGhiMua();
//        dL.showDanhSachGhiLenh();
//        dL.clickGuiTungLenh();
//    }
//    @Test(dataProvider = "HSX_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 12)
//    public void TC12_HSX_Buy_ATC_Ghi_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.RunOnlyInTimeRange("ATC", LocalTime.of(14,29,59), LocalTime.of(14,45,1));
//        dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//        dL.clickGhiMua();
//       // Thread.sleep(1000);
//        dL.showDanhSachGhiLenh();
//        dL.clickGuiTungLenh();
//        dL.clickTatGhiLenh();
//    }
    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 13)
    public void TC13_HNX_LISTED_Buy_LO(String mack, String khoiluong, String gia) throws InterruptedException
    {
        Thread.sleep(2000);
        dL.setMaCk(mack);
        //click gia
        dL.setGia(gia);
        //click khoi luong
        dL.setKhoiLuong(khoiluong);
        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
        boolean check = dL.checkDatLenh(mack, khoiluong, gia);
        dL.thoatSoLenh();
        Assert.assertTrue(check);
    }
    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 14)
    public void TC14_HNX_LISTED_Buy_PLO(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.RunOnlyOutSideATOAndATC();
        //  dL.setMaCk(mack);
        //click gia
        Thread.sleep(2000);
        dL.setGia(gia);
        //click khoi luong
        dL.setKhoiLuong(khoiluong);
        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
        boolean check = dL.checkDatLenh(mack, khoiluong, gia);
        dL.thoatSoLenh();
        Assert.assertTrue(check);
    }
    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 15)
    public void TC15_HNX_LISTED_Buy_MTL(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.RunOnlyOutSideATOAndATC();
        // dL.setMaCk(mack);
      //  Thread.sleep(2000);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
        boolean check = dL.checkDatLenh(mack, khoiluong, gia);
        dL.thoatSoLenh();
        Assert.assertTrue(check);
    }
    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 16)
    public void TC16_HNX_LISTED_Buy_MAK(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.RunOnlyOutSideATOAndATC();
        // dL.setMaCk(mack);
      //  Thread.sleep(2000);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
        boolean check = dL.checkDatLenh(mack, khoiluong, gia);
        dL.thoatSoLenh();
        Assert.assertTrue(check);
    }
    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 17)
    public void TC17_HNX_LISTED_Buy_MOK(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.RunOnlyOutSideATOAndATC();
        // dL.setMaCk(mack);
      //  Thread.sleep(2000);
        //click gia
        dL.setGia(gia);
        //click khoi luong
        dL.setKhoiLuong(khoiluong);
        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
        boolean check = dL.checkDatLenh(mack, khoiluong, gia);
        dL.thoatSoLenh();
        Assert.assertTrue(check);
    }
    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 18)
    public void TC18_HNX_LISTED_Buy_ATC(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.RunOnlyInTimeRange("ATC", LocalTime.of(14,29,59), LocalTime.of(14,45,1));
        // dL.setMaCk(mack);
      //  Thread.sleep(2000);
        //click gia
        dL.setGia(gia);
        //click khoi luong
        dL.setKhoiLuong(khoiluong);
        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
        boolean check = dL.checkDatLenh(mack, khoiluong, gia);
        dL.thoatSoLenh();
        Assert.assertTrue(check);
    }
//    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 19)
//    public void TC19_HNX_LISTED_Buy_LO_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//        dL.clickGhiMua();
//      //  Thread.sleep(1000);
//        //   dL.clickThoatDanhSachDatLenh();
//    }
//    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 20)
//    public void TC20_HNX_LISTED_Buy_PLO_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.RunOnlyOutSideATOAndATC();
//        //dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//       // Thread.sleep(1000);
//        dL.clickGhiMua();
//       // Thread.sleep(1000);
//    }
//    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 21)
//    public void TC21_HNX_LISTED_Buy_MTL_GuiALl(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.RunOnlyOutSideATOAndATC();
//        //  dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//      //  Thread.sleep(1000);
//        dL.clickGhiMua();
//      //  Thread.sleep(1000);
//
//    }
//    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 22)
//    public void TC22_HNX_LISTED_Buy_MAK_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.RunOnlyOutSideATOAndATC();
//        //  dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//        dL.clickGhiMua();
//       // Thread.sleep(1000);
//
//    }
//    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 23)
//    public void TC23_HNX_LISTED_Buy_MOK_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.RunOnlyOutSideATOAndATC();
//        //  dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//    //    Thread.sleep(1000);
//        dL.clickGhiMua();
//      //  Thread.sleep(1000);
//
//    }
//    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 24)
//    public void TC24_HNX_LISTED_Buy_ATC_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.RunOnlyInTimeRange("ATC", LocalTime.of(14,29,59), LocalTime.of(14,45,1));
//        dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//      //  Thread.sleep(1000);
//        dL.clickGhiMua();
//        dL.showDanhSachGhiLenh();
//      //  Thread.sleep(1000);
//        dL.clickGuiAll();
//        dL.clickThoatListKQGiaoDich();
//    }
//    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 25)
//    public void TC25_HNX_LISTED_Buy_LO_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//    //    dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//       // Thread.sleep(1000);
//        dL.clickGhiMua();
//      //  Thread.sleep(1000);
//        dL.showDanhSachGhiLenh();
//        dL.clickGuiTungLenh();
//    }
//    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 26)
//    public void TC26_HNX_LISTED_Buy_PLO_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.RunOnlyOutSideATOAndATC();
//       //dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//       // Thread.sleep(1000);
//        dL.clickGhiMua();
//       // Thread.sleep(1000);
//        dL.showDanhSachGhiLenh();
//        dL.clickGuiTungLenh();
//    }
//    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 27)
//    public void TC27_HNX_LISTED_Buy_MTL_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.RunOnlyOutSideATOAndATC();
//   //     dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//      //  Thread.sleep(1000);
//        dL.clickGhiMua();
//      //  Thread.sleep(1000);
//        dL.showDanhSachGhiLenh();
//        dL.clickGuiTungLenh();
//    }
//    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 28)
//    public void TC28_HNX_LISTED_Buy_MAK_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.RunOnlyOutSideATOAndATC();
//    //    dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//     //   Thread.sleep(1000);
//        dL.clickGhiMua();
//     //   Thread.sleep(1000);
//        dL.showDanhSachGhiLenh();
//        dL.clickGuiTungLenh();
//    }
//    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 29)
//    public void TC29_HNX_LISTED_Buy_MOK_GuiTunglenh(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.RunOnlyOutSideATOAndATC();
//       dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//      //  Thread.sleep(1000);
//        dL.clickGhiMua();
//       // Thread.sleep(1000);
//        dL.showDanhSachGhiLenh();
//        dL.clickGuiTungLenh();
//    }
//    @Test(dataProvider = "HNX_LISTED_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 30)
//    public void TC30_HNX_LISTED_Buy_ATC_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//        dL.RunOnlyInTimeRange("ATC", LocalTime.of(14,29,59), LocalTime.of(14,45,1));
//        //   dL.clickBatGhiLenh();
//        //dL.setMaCk(mack);
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//      //  Thread.sleep(1000);
//        dL.clickGhiMua();
//      //  Thread.sleep(1000);
//        dL.showDanhSachGhiLenh();
//        dL.clickGuiTungLenh();
//        dL.clickTatGhiLenh();
//    }
    @Test(dataProvider = "HNX_UPCOM_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 31)
    public void TC31_HNX_UPCOM_Buy_LO(String mack, String khoiluong, String gia) throws InterruptedException
    {
        Thread.sleep(2000);
        dL.setMaCk(mack);
        //click gia
        dL.setGia(gia);
        //click khoi luong
        dL.setKhoiLuong(khoiluong);
        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
        boolean check = dL.checkDatLenh(mack, khoiluong, gia);
        dL.thoatSoLenh();
        Assert.assertTrue(check);
    }
//    @Test(dataProvider = "HNX_UPCOM_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 32)
//    public void TC32_HNX_UPCOM_Buy_LO_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//       dL.clickBatGhiLenh();
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//        dL.clickGhiMua();
//        dL.showDanhSachGhiLenh();
//        dL.clickGuiAll();
//    }
//    @Test(dataProvider = "HNX_UPCOM_Buy_MarPro",dataProviderClass = Data_Mua_MarPro.class,priority = 33)
//    public void TC33_HNX_UPCOM_Buy_LO_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
//    {
//       dL.clickBatGhiLenh();
//        dL.setGia(gia);
//        dL.setKhoiLuong(khoiluong);
//        LogUtils.info("Giá nhập vào: " + gia + ", khối lượng nhập vào: " + khoiluong);
//        dL.clickGhiMua();
//        dL.showDanhSachGhiLenh();
//        dL.clickGuiTungLenh();
//    }



}
