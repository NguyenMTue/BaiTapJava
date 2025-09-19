package Bai10;

import java.util.Scanner;

public class KhachHang {
	// Thuoc tinh
	protected String tenChuHo342;
	protected int soNha342;
	protected String maCongTo342;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public KhachHang() {

	}

	// Ham khoi tao co doi so
	public KhachHang(String tenChuHo342, int soNha342, String maCongTo342) {
		this.tenChuHo342 = tenChuHo342;
		this.soNha342 = soNha342;
		this.maCongTo342 = maCongTo342;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo342 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha342 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo342 = sc.nextLine();
	}

	// Ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo342);
		System.out.println("\tSo nha: " + soNha342);
		System.out.println("\tMa cong to: " + maCongTo342);
	}
}