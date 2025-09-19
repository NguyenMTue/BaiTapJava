package Bai3;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    // thuộc tính
    private int soPhatHanh342;
    private int thangPhatHanh342;

    // hàm khởi tạo không đối số
    public TapChi() {

    }

    // hàm khởi tạo có đối số
    public TapChi(String maTaiLieu342, String tenNXB342, int soBanPhatHanh342,
                  int soPhatHanh342, int thangPhatHanh342) {
        super(maTaiLieu342, tenNXB342, soBanPhatHanh342);
        this.soPhatHanh342 = soPhatHanh342;
        this.thangPhatHanh342 = thangPhatHanh342;
    }

    // hàm nhập
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap so phat hanh: ");
        soPhatHanh342 = sc.nextInt();
        System.out.print("\tNhap thang phat hanh: ");
        thangPhatHanh342 = sc.nextInt();
        sc.nextLine();
    }

    // hàm hiển thị
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo phat hanh: " + soPhatHanh342);
        System.out.println("\tThang phat hanh: " + thangPhatHanh342);
    }
}
