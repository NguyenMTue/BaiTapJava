package Bai5;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
	// thuoc tinh
	private int soNguoi342;
	private int soNha342;
	private Nguoi[] danhSach342; // danhSach342 la mang danh sach chua cac thanh vien trong ho

	// phuong thuc
	// ham khoi tao khong doi so
	public HoDan() {
		danhSach342 = new Nguoi[10];
	}

	// ham khoi tao co doi so
	public HoDan(String hoTen342, Date ngaySinh342, String ngheNghiep342, int soNguoi342, int soNha342) {
		super(hoTen342, ngaySinh342, ngheNghiep342);
		this.soNguoi342 = soNguoi342;
		this.soNha342 = soNha342;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi342 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha342 = sc.nextInt();
		sc.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i = 0; i < soNguoi342; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			danhSach342[i] = new Nguoi();
			danhSach342[i].nhapThongTin(sc);
		}
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi342);
		System.out.println("\tSo nha: " + soNha342);
		System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
		for (int i = 0; i < soNguoi342; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			danhSach342[i].hienThiThongTin();
		}
	}

	// ham lay ra thanh vien trong ho dan
	public Nguoi[] getDanhSach342() {
		return danhSach342;
	}

	// ham lay ra so thanh vien trong ho gia dinh
	public int getSoNguoi342() {
		return soNguoi342;
	}
}