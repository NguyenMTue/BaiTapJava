package Bai9;

import java.util.Scanner;

public class SinhVien {
	// thuoc tinh
	protected String hoTen342;
	protected String maSV342;
	protected String ngaySinh342;
	protected String lop342;

	// phuong thuc
	// ham khoi tao khong doi so
	public SinhVien() {

	}

	// ham khoi tao co doi so
	public SinhVien(String hoTen342, String maSV342, String ngaySinh342, String lop342) {
		this.hoTen342 = hoTen342;
		this.maSV342 = maSV342;
		this.ngaySinh342 = ngaySinh342;
		this.lop342 = lop342;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen342 = sc.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV342 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh342 = sc.nextLine();

		System.out.print("\tNhap lop: ");
		lop342 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen342);
		System.out.println("\tNgay sinh: " + ngaySinh342);
		System.out.println("\tMa sinh vien: " + maSV342);
		System.out.println("\tLop: " + lop342);
	}
}