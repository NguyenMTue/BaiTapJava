package Bai8;

import java.util.Scanner;

public class CBGV extends Nguoi {
	// thuoc tinh
	private double luongCung342;
	private double thuong342;
	private double phat342;
	private double luongThucLinh342;

	// phuong thuc
	// ham khoi tao khong doi so
	public CBGV() {

	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap luong cung: ");
		luongCung342 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong342 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap phat: ");
		phat342 = sc.nextDouble();
		sc.nextLine();

		// tinh luong
		luongThucLinh342 = luongCung342 + thuong342 - phat342;
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung342);
		System.out.println("\tThuong: " + thuong342);
		System.out.println("\tPhat: " + phat342);
		System.out.println("\tLuong thuc linh: " + luongThucLinh342);
	}

	// ham lay ra thong tin ve luong thuc linh
	public double getLuongThucLinh() {
		return luongThucLinh342;
	}
}