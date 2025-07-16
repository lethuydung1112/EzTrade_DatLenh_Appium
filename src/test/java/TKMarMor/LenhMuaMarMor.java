package TKMarMor;

import Base.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LenhMuaMarMor extends BaseTest {
    @BeforeClass
    public void Login() throws InterruptedException {
        lP.clickTrangDangnhap();
        lP.clickAnotherAcc();
        lP.clickAnotherAcc2();
        //   lP.actionCheckStk("058C000715");
        lP.Dangnhap("058C000715", "Fpts@123");
        Thread.sleep(3000);
        dL.clickTrangDatLenh();
        dL.clickLayMaOtp();
        dL.clickOKOtp();
    }

    @Test(dataProvider = "HSX_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 1)
    public void TC1_HSX_Buy_LO(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setMaCk(mack);
        dL.setChuyenTrangthaiTkMargin();
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
    }

    @Test(dataProvider = "HSX_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 2)
    public void TC2_HSX_Buy_ATO(String mack, String khoiluong, String gia) throws InterruptedException {
        //    dL.setMaCk(mack);
        dL.setChuyenTrangthaiTkMargin();
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickDatMua();
        Thread.sleep(1000);
        dL.clickXacNhan();
    }

    @Test(dataProvider = "HSX_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 3)
    public void TC3_HSX_Buy_MP(String mack, String khoiluong, String gia) throws InterruptedException {
        // dL.setMaCk(mack);
        dL.setChuyenTrangthaiTkMargin();
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickDatMua();
        Thread.sleep(1000);
        dL.clickXacNhan();
    }

    @Test(dataProvider = "HSX_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 4)
    public void TC4_HSX_Buy_ATC(String mack, String khoiluong, String gia) throws InterruptedException {
        //  dL.setMaCk(mack);
        dL.setChuyenTrangthaiTkMargin();
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickDatMua();
        Thread.sleep(1000);
        dL.clickXacNhan();
    }

    @Test(dataProvider = "HSX_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 5)
    public void TC5_HSX_Buy_LO_Ghi_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setChuyenTrangthaiTkMargin();
        dL.clickBatGhiLenhMarM();
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiMua();
        Thread.sleep(1000);
        dL.clickThoatDanhSachDatLenh();
    }

    @Test(dataProvider = "HSX_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 6)
    public void TC6_HSX_Buy_ATO_Ghi_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setChuyenTrangthaiTkMargin();
        //dL.clickBatGhiLenhMarM();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiMua();
        Thread.sleep(1000);
    }

    @Test(dataProvider = "HSX_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 7)
    public void TC7_HSX_Buy_MP_Ghi_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setChuyenTrangthaiTkMargin();
        //  dL.clickBatGhiLenhMarM();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiMua();
        Thread.sleep(1000);
    }

    @Test(dataProvider = "HSX_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 8)
    public void TC8_HSX_Buy_ATC_Ghi_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setChuyenTrangthaiTkMargin();
        //   dL.clickBatGhiLenhMarM();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiMua();
        Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        //dL.clickXacNhan();
        dL.clickGuiAll();
        dL.clickThoatListKQGiaoDich();
    }

    @Test(dataProvider = "HSX_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 9)
    public void TC9_HSX_Buy_LO_Ghi_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setChuyenTrangthaiTkMargin();
        dL.clickBatGhiLenhMarM();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiMua();
        Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        dL.clickGuiTungLenhMarM();
    }

    @Test(dataProvider = "HSX_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 10)
    public void TC10_HSX_Buy_ATO_Ghi_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setChuyenTrangthaiTkMargin();
        //    dL.clickBatGhiLenhMarM();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiMua();
        Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        dL.clickGuiTungLenhMarM();
    }

    @Test(dataProvider = "HSX_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 11)
    public void TC11_HSX_Buy_MP_Ghi_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setChuyenTrangthaiTkMargin();
        //    dL.clickBatGhiLenhMarM();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        Thread.sleep(1000);
        dL.clickGhiMua();
        Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        dL.clickGuiTungLenhMarM();
    }

    @Test(dataProvider = "HSX_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 12)
    public void TC12_HSX_Buy_ATC_Ghi_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException {
        //   dL.setMaCk(mack);
        dL.setChuyenTrangthaiTkMargin();
        dL.clickBatGhiLenhMarM();
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        // Thread.sleep(1000);
        dL.clickGhiMua();
        Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        dL.clickGuiTungLenhMarM();
        Thread.sleep(1000);
        dL.clickTatGhiLenhMarM();
    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 13)
    public void TC13_HNX_LISTED_Buy_LO(String mack, String khoiluong, String gia) throws InterruptedException {
        Thread.sleep(2000);
        dL.setMaCk(mack);
        dL.setChuyenTrangthaiTkMargin();
        //click gia
        dL.setGia(gia);
        //click khoi luong
        dL.setKhoiLuong(khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 14)
    public void TC14_HNX_LISTED_Buy_PLO(String mack, String khoiluong, String gia) throws InterruptedException {
        //  dL.setMaCk(mack);
        //click gia
        dL.setChuyenTrangthaiTkMargin();
        dL.setGia(gia);
        //click khoi luong
        dL.setKhoiLuong(khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 15)
    public void TC15_HNX_LISTED_Buy_MTL(String mack, String khoiluong, String gia) throws InterruptedException {
        // dL.setMaCk(mack);
        dL.setChuyenTrangthaiTkMargin();
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 16)
    public void TC16_HNX_LISTED_Buy_MAK(String mack, String khoiluong, String gia) throws InterruptedException {
        // dL.setMaCk(mack);
        dL.setChuyenTrangthaiTkMargin();
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 17)
    public void TC17_HNX_LISTED_Buy_MOK(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.setChuyenTrangthaiTkMargin();
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 18)
    public void TC18_HNX_LISTED_Buy_ATC(String mack, String khoiluong, String gia) throws InterruptedException {
        // dL.setMaCk(mack);
        dL.setChuyenTrangthaiTkMargin();
        //click gia
        dL.setGia(gia);
        //click khoi luong
        dL.setKhoiLuong(khoiluong);
        dL.clickDatMua();
        dL.clickXacNhan();
    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 19)
    public void TC19_HNX_LISTED_Buy_LO_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.clickBatGhiLenhMarM();
        dL.setChuyenTrangthaiTkMargin();
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        //   Thread.sleep(1000);
        dL.clickGhiMua();
        //  Thread.sleep(1000);
        dL.clickThoatDanhSachDatLenh();
    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 20)
    public void TC20_HNX_LISTED_Buy_PLO_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        //dL.clickBatGhiLenhMarM();
        //dL.setMaCk(mack);
        dL.setChuyenTrangthaiTkMargin();
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        // Thread.sleep(1000);
        dL.clickGhiMua();
        // Thread.sleep(1000);
    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 21)
    public void TC21_HNX_LISTED_Buy_MTL_GuiALl(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.clickBatGhiLenhMarM();
        //dL.setMaCk(mack);
        dL.setChuyenTrangthaiTkMargin();
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        //  Thread.sleep(1000);
        dL.clickGhiMua();
        //  Thread.sleep(1000);

    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 22)
    public void TC22_HNX_LISTED_Buy_MAK_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        //  dL.clickBatGhiLenhMarM();
        //dL.setMaCk(mack);
        dL.setChuyenTrangthaiTkMargin();
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        //  Thread.sleep(1000);
        dL.clickGhiMua();
        // Thread.sleep(1000);

    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 23)
    public void TC23_HNX_LISTED_Buy_MOK_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        //  dL.clickBatGhiLenhMarM();
        //dL.setMaCk(mack);
        dL.setChuyenTrangthaiTkMargin();
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        //    Thread.sleep(1000);
        dL.clickGhiMua();
        //  Thread.sleep(1000);

    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 24)
    public void TC24_HNX_LISTED_Buy_ATC_GuiAll(String mack, String khoiluong, String gia) throws InterruptedException {
        //   dL.clickBatGhiLenhMarM();
        //dL.setMaCk(mack);
        dL.setChuyenTrangthaiTkMargin();
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        //  Thread.sleep(1000);
        dL.clickGhiMua();
        dL.showDanhSachGhiLenh();
        //  Thread.sleep(1000);
        dL.clickGuiAll();
        dL.clickThoatListKQGiaoDich();
    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 25)
    public void TC25_HNX_LISTED_Buy_LO_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.clickBatGhiLenhMarM();
        dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        // Thread.sleep(1000);
        dL.clickGhiMua();
        Thread.sleep(1000);
        //dL.showDanhSachGhiLenh();
        dL.clickGuiTungLenhMarM();
    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 26)
    public void TC26_HNX_LISTED_Buy_PLO_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException {
        //dL.clickBatGhiLenhMarM();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        // Thread.sleep(1000);
        dL.clickGhiMua();
        // Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        Thread.sleep(1000);
        dL.clickGuiTungLenhMarM();
    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 27)
    public void TC27_HNX_LISTED_Buy_MTL_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException {
        //     dL.clickBatGhiLenhMarM();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        //  Thread.sleep(1000);
        dL.clickGhiMua();
        //  Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        Thread.sleep(1000);
        dL.clickGuiTungLenhMarM();
    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 28)
    public void TC28_HNX_LISTED_Buy_MAK_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException {
        //    dL.clickBatGhiLenhMarM();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        //   Thread.sleep(1000);
        dL.clickGhiMua();
        //   Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        Thread.sleep(1000);
        dL.clickGuiTungLenhMarM();
    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 29)
    public void TC29_HNX_LISTED_Buy_MOK_GuiTunglenh(String mack, String khoiluong, String gia) throws InterruptedException {
        dL.clickBatGhiLenhMarM();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        //  Thread.sleep(1000);
        dL.clickGhiMua();
        // Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        Thread.sleep(1000);
        dL.clickGuiTungLenhMarM();
    }

    @Test(dataProvider = "HNX_LISTED_Buy_MarMor", dataProviderClass = Data_Mua_MarMor.class, priority = 30)
    public void TC30_HNX_LISTED_Buy_ATC_GuiTungLenh(String mack, String khoiluong, String gia) throws InterruptedException {
        //   dL.clickBatGhiLenhMarM();
        //dL.setMaCk(mack);
        dL.setGia(gia);
        dL.setKhoiLuong(khoiluong);
        //  Thread.sleep(1000);
        dL.clickGhiMua();
        //  Thread.sleep(1000);
        dL.showDanhSachGhiLenh();
        Thread.sleep(1000);
        dL.clickGuiTungLenhMarM();
    }


}
