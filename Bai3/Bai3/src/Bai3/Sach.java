package Bai3;

import java.util.Scanner;

public class Sach extends TaiLieu {
	// thuoc tinh
	private String tacGia342;
	private int soTrang342;

	// phuong thuc
	// ham khoi tao khong doi so
	public Sach() {

	}

	// ham khoi tao co doi so
	public Sach(String maTaiLieu342, String tenNXB342, int soBanPhatHanh342, String tacGia342, int soTrang342) {
		super(maTaiLieu342, tenNXB342, soBanPhatHanh342);
		this.tacGia342 = tacGia342;
		this.soTrang342 = soTrang342;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap tac gia: ");
		tacGia342 = sc.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang342 = sc.nextInt();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ttac gia: " + tacGia342);
		System.out.println("\tSo trang: " + soTrang342);
	}
}
