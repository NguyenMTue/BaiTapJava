package Bai8;

import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen342;
	protected String ngaySinh342;
	protected String queQuan342;

	// phuong thuc
	// ham khoi tao khong so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen342, String ngaySinh342, String queQuan342) {
		this.hoTen342 = hoTen342;
		this.ngaySinh342 = ngaySinh342;
		this.queQuan342 = queQuan342;
	}

	// ham nhap thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen342 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh342 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan342 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen342);
		System.out.println("\tNgay sinh: " + ngaySinh342);
		System.out.println("\tQue quan: " + queQuan342);
	}
}