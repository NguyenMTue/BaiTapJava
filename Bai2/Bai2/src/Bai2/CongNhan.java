package Bai2;

import java.util.Scanner;

public class CongNhan extends CanBo {
	// thuoc tinh
	private String bac342;

	// phuong thuc
	// ham khoi tao khong doi so
	public CongNhan() {

	}

	// ham khoi tao co doi so
	public CongNhan(String hoTen342, String ngaySinh342, String gioiTinh342, String diaChi342, String bac342) {
		super(hoTen342, ngaySinh342, gioiTinh342, diaChi342);
		this.bac342 = bac342;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap bac: ");
		bac342 = sc.nextLine();
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tBac: " + bac342);
	}
}