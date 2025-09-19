package Bai3;

import java.util.Scanner;

public class Bao extends TaiLieu {
	// thuoc tinh
	private String ngayPhatHanh342;

	// phuong thuc
	// ham khoi tao khong doi so
	public Bao() {

	}

	// ham khoi tao co doi so
	public Bao(String maTaiLieu342, String tenNXB342, int soBanPhatHanh342, String ngayPhatHanh342) {
		super(maTaiLieu342, tenNXB342, soBanPhatHanh342);
		this.ngayPhatHanh342 = ngayPhatHanh342;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap ngay phat hanh: ");
		ngayPhatHanh342 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNgay phat hanh: " + ngayPhatHanh342);
	}
}
