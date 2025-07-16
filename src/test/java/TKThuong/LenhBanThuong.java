package TKThuong;

import Base.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LenhBanThuong extends BaseTest{
    @BeforeClass
    public void Login() throws InterruptedException {
        lP.clickTrangDangnhap();
        lP.clickAnotherAcc();
        lP.clickAnotherAcc2();
        //   lP.actionCheckStk("058C000715");
        lP.Dangnhap("058C888777", "Fpts@123");
        Thread.sleep(3000);
        dL.clickTrangDatLenh();
        dL.clickLayMaOtp();
        dL.clickOKOtp();
    }

        @Test(dataProvider = "HSX_Sell_Thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 1)
    public void TC1_HSX_Sell_LO(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.setTrangThaiBan();
        Thread.sleep(1000);
        dL.setMaCk(mack);
        Thread.sleep(2000);
        //click gia
        dL.setGia(gia);
        //click khoi luong
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickDatBan();
        Thread.sleep(1000);
        dL.clickXacNhan();
    }
    @Test(dataProvider = "HSX_Sell_Thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 2)
    public void TC2_HSX_Sell_ATO(String mack, String khoiluong, String gia) throws InterruptedException
    {
      //  dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickDatBan();
        Thread.sleep(1000);
        dL.clickXacNhan();
    }
    @Test(dataProvider = "HSX_Sell_Thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 3)
    public void TC3_HSX_Sell_MP(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.setTrangThaiBan();
     //   dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickDatBan();
        Thread.sleep(1000);
        dL.clickXacNhan();
    }
    @Test(dataProvider = "HSX_Sell_Thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 4)
    public void TC4_HSX_Sell_ATC(String mack, String khoiluong, String gia) throws InterruptedException
    {
     //   dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickDatBan();
        Thread.sleep(1000);
        dL.clickXacNhan();
    }
    @Test(dataProvider = "HSX_Sell_Thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 5)
    public void TC5_HSX_Sell_LO_Ghi_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.clickBatGhiLenhBan();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);
        dL.clickThoatDanhSachDatLenh();
        //dL.clickXacNhan();
    }
    @Test(dataProvider = "HSX_Sell_Thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 6)
    public void TC6_HSX_Sell_ATO_Ghi_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
    {
        //dL.clickBatGhiLenhBan();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);
        //dL.clickXacNhan();
    }
    @Test(dataProvider = "HSX_Sell_Thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 7)
    public void TC7_HSX_Sell_MP_Ghi_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
    {
        //  dL.clickBatGhiLenhBan();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);
        //dL.clickXacNhan();
    }
    @Test(dataProvider = "HSX_Sell_Thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 8)
    public void TC8_HSX_Sell_ATC_Ghi_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
    {
       // dL.clickBatGhiLenhBan();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        //dL.clickXacNhan();
        dL.clickGuiAll();
        dL.clickThoatListKQGiaoDich();
    }
    @Test(dataProvider = "HSX_Sell_Thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 9)
    public void TC9_HSX_Sell_LO_Ghi_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.setTrangThaiBan();
        dL.clickBatGhiLenhBan();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);
        //dL.showDanhSachGhiLenh();
        dL.clickGuiTungLenhBan();
    }
        @Test(dataProvider = "HSX_Sell_Thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 10)
    public void TC10_HSX_Sell_ATO_Ghi_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        // dL.setMaCk(mack);
        //dL.setTrangThaiBan();
        // dL.clickBatGhiLenhBan();
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        dL.clickGuiTungLenhBan();
    }
    @Test(dataProvider = "HSX_Sell_Thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 11)
    public void TC11_HSX_Sell_MP_Ghi_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        //   dL.clickBatGhiLenhBan();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        dL.clickGuiTungLenhBan();
    }
    @Test(dataProvider = "HSX_Sell_Thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 12)
    public void TC12_HSX_Sell_ATC_Ghi_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        //   dL.clickBatGhiLenhBan();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        dL.clickGuiTungLenhBan();
        dL.clickTatGhiLenhBan();
    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 13)
    public void TC13_HNX_LISTED_Sell_LO(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.setTrangThaiBan();
        Thread.sleep(2000);
        dL.setMaCk(mack);
        //click gia
        dL.setGia(gia);
        //click khoi luong
        dL.setKhoiLuong(khoiluong);
        dL.clickDatBan();
        dL.clickXacNhan();
    }
        @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 14)
    public void TC14_HNX_LISTED_Sell_PLO(String mack, String khoiluong, String gia) throws InterruptedException
    {
        //  dL.setMaCk(mack);
        //click gia
        Thread.sleep(2000);
        dL.setGia(gia);
        //click khoi luong
        dL.setKhoiLuong(khoiluong);
        dL.clickDatBan();
        dL.clickXacNhan();
    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 15)
    public void TC15_HNX_LISTED_Sell_MTL(String mack, String khoiluong, String gia) throws InterruptedException
    {
        // dL.setMaCk(mack);
        Thread.sleep(2000);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        dL.clickDatBan();
        dL.clickXacNhan();
    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 16)
    public void TC16_HNX_LISTED_Sell_MAK(String mack, String khoiluong, String gia) throws InterruptedException
    {
        // dL.setMaCk(mack);
        Thread.sleep(2000);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        dL.clickDatBan();
        dL.clickXacNhan();
    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 17)
    public void TC17_HNX_LISTED_Sell_MOK(String mack, String khoiluong, String gia) throws InterruptedException
    {
        // dL.setMaCk(mack);
        Thread.sleep(2000);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        dL.clickDatBan();
        dL.clickXacNhan();
    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 18)
    public void TC18_HNX_LISTED_Sell_ATC(String mack, String khoiluong, String gia) throws InterruptedException
    {
        // dL.setMaCk(mack);
        Thread.sleep(2000);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        dL.clickDatBan();
        dL.clickXacNhan();
    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 19)
    public void TC19_HNX_LISTED_Sell_LO_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.clickBatGhiLenhBan();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);
        dL.clickThoatDanhSachDatLenh();
    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 20)
    public void TC20_HNX_LISTED_Sell_PLO_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
    {
        //dL.clickBatGhiLenh();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);
    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 21)
    public void TC21_HNX_LISTED_Sell_MTL_GuiALl(String mack, String khoiluong, String gia) throws InterruptedException
    {
        //  dL.clickBatGhiLenh();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);

    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 22)
    public void TC22_HNX_LISTED_Sell_MAK_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
    {
        //  dL.clickBatGhiLenh();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);

    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 23)
    public void TC23_HNX_LISTED_Sell_MOK_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
    {
        //  dL.clickBatGhiLenh();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);

    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 24)
    public void TC24_HNX_LISTED_Sell_ATC_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.clickBatGhiLenh();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        dL.showDanhSachGhiLenh();
        Thread.sleep(1000);
        dL.clickGuiAll();
        dL.clickThoatListKQGiaoDich();
    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 25)
    public void TC25_HNX_LISTED_Sell_LO_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.clickBatGhiLenhBan();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(2000);
        dL.showDanhSachGhiLenh();
        Thread.sleep(1000);
        dL.clickGuiTungLenhBan();
    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 26)
    public void TC26_HNX_LISTED_Sell_PLO_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        // dL.clickBatGhiLenhBan();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        dL.clickGuiTungLenhBan();
    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 27)
    public void TC27_HNX_LISTED_Sell_MTL_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        //dL.clickBatGhiLenh();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        Thread.sleep(1000);
        dL.clickGuiTungLenhBan();
    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 28)
    public void TC28_HNX_LISTED_Sell_MAK_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        //dL.clickBatGhiLenh();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        Thread.sleep(1000);
        dL.clickGuiTungLenhBan();
    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 29)
    public void TC29_HNX_LISTED_Sell_MOK_GuiTunglenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        //dL.clickBatGhiLenh();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        Thread.sleep(1000);
        dL.clickGuiTungLenhBan();
    }
    @Test(dataProvider = "HNX_LISTED_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 30)
    public void TC30_HNX_LISTED_Sell_ATC_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        // dL.clickBatGhiLenhBan();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiBan();
        Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        dL.clickGuiTungLenhBan();
        dL.clickTatGhiLenhBan();
    }
    @Test(dataProvider = "HNX_UPCOM_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 31)
    public void TC31_HNX_UPCOM_Sell_LO(String mack, String khoiluong, String gia) throws InterruptedException
    {
        Thread.sleep(2000);
        dL.setMaCk(mack);
        //click gia
        dL.setGia(gia);
        //click khoi luong
        dL.setKhoiLuong(khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
    }
    @Test(dataProvider = "HNX_UPCOM_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 32)
    public void TC32_HNX_UPCOM_Sell_LO_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.clickBatGhiLenh();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiMua();
        Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        dL.clickGuiAll();
    }
    @Test(dataProvider = "HNX_UPCOM_Sell_thuong",dataProviderClass = Data_Ban_Thuong.class,priority = 33)
    public void TC33_HNX_UPCOM_Sell_LO_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException
    {
        dL.clickBatGhiLenh();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiMua();
        Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        dL.clickGuiTungLenhBan();
        //   dL.clickTatGhiLenh();
    }
}
