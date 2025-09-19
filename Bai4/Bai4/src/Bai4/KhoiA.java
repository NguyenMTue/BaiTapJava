package Bai4;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	// thuoc tinh
	private String mon1_342;
	private String mon2_342;
	private String mon3_342;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhoiA() {

	}

	// ham khoi tao co doi so
	public KhoiA(String mon1_342, String mon2_342, String mon3_342) {
		this.mon1_342 = mon1_342;
		this.mon2_342 = mon2_342;
		this.mon3_342 = mon3_342;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap mon 1: ");
		mon1_342 = sc.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2_342 = sc.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3_342 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1_342 + " - " + mon2_342 + " - " + mon3_342);
	}
}