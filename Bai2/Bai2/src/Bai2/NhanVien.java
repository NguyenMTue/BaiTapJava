package Bai2;

import java.util.Scanner;

public class NhanVien extends CanBo {
	// thuoc tinh
	private String congViec342;

	// phuong thuc
	// ham khoi tao khong doi so
	public NhanVien() {

	}

	// ham khoi tao co doi so
	public NhanVien(String hoTen342, String ngaySinh342, String gioiTinh342, String diaChi342, String congViec342) {
		super(hoTen342, ngaySinh342, gioiTinh342, diaChi342);
		this.congViec342 = congViec342;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap cong viec: ");
		congViec342 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tCong viec: " + congViec342);
	}
}