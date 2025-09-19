package Bai3;

import java.util.Scanner;

public class TaiLieu {
    // thuộc tính
    private String maTaiLieu342;
    private String tenNXB342;
    private int soBanPhatHanh342;

    // hàm khởi tạo không đối số
    public TaiLieu() {

    }

    // hàm khởi tạo có đối số
    public TaiLieu(String maTaiLieu342, String tenNXB342, int soBanPhatHanh342) {
        this.maTaiLieu342 = maTaiLieu342;
        this.tenNXB342 = tenNXB342;
        this.soBanPhatHanh342 = soBanPhatHanh342;
    }

    // hàm nhập
    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ma tai lieu: ");
        maTaiLieu342 = sc.nextLine();
        System.out.print("\tNhap ten nha xuat ban: ");
        tenNXB342 = sc.nextLine();
        System.out.print("\tNhap so ban phat hanh: ");
        soBanPhatHanh342 = sc.nextInt();
        sc.nextLine();
    }

    // hàm hiển thị
    public void hienThiThongTin() {
        System.out.println("\tMa tai lieu: " + maTaiLieu342);
        System.out.println("\tTen nha xuat ban: " + tenNXB342);
        System.out.println("\tSo ban phat hanh: " + soBanPhatHanh342);
    }

    // hàm lấy mã tài liệu
    public String getMaTaiLieu() {
        return maTaiLieu342;
    }
}
