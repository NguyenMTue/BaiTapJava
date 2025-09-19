package Bai2;

import java.util.Scanner;

public class KySu extends CanBo {
	// thuoc tinh
	private String nganhDaoTao342;

	// phuong thuc
	// ham khoi tao khong doi so
	public KySu() {

	}

	// ham khoi tao co doi so
	public KySu(String hoTen342, String ngaySinh342, String gioiTinh342, String diaChi342, String nganhDaoTao342) {
		super(hoTen342, ngaySinh342, gioiTinh342, diaChi342);
		this.nganhDaoTao342 = nganhDaoTao342;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap nganh dao tao: ");
		nganhDaoTao342 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNganh dao tao: " + nganhDaoTao342);
	}
}