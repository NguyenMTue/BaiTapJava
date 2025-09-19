package Bai7;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	// thuoc tinh
	private String lop342;
	private String khoHoc342;
	private String kyHoc342;

	// phuong thuc
	// ham khoi tao khong doi so
	public HocSinh() {

	}

	// ham khoi tao co doi so
	public HocSinh(String hoTen342, String lop342, String khoaHoc342, String kyHoc342) {
		this.hoTen342 = hoTen342;
		this.lop342 = lop342;
		this.khoHoc342 = khoHoc342;
		this.kyHoc342 = kyHoc342;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap lop: ");
		lop342 = sc.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoHoc342 = sc.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc342 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop342);
		System.out.println("\tKhoa hoc: " + khoHoc342);
		System.out.println("\tKy hoc: " + kyHoc342);
	}

	// ham lay ra thong tin ve lop
	public String getLop() {
		return lop342;
	}
}