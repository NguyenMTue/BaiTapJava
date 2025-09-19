package Bai2;

import java.util.Scanner;

public class CanBo {
	// thuoc tinh
	private String hoTen342;
	private String ngaySinh342;
	private String gioiTinh342;
	private String diaChi342;

	// phuong thuc
	// ham khoi tao khong doi so
	public CanBo() {

	}

	// ham khoi tao co doi so
	public CanBo(String hoTen342, String ngaySinh342, String gioiTinh342, String diaChi342) {
		this.hoTen342 = hoTen342;
		this.ngaySinh342 = ngaySinh342;
		this.gioiTinh342 = gioiTinh342;
		this.diaChi342 = diaChi342;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen342 = sc.nextLine();
		System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
		ngaySinh342 = sc.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh342 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi342 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen342);
		System.out.println("\tNgay sinh: " + ngaySinh342);
		System.out.println("\tGioi tinh: " + gioiTinh342);
		System.out.println("\tDia chi: " + diaChi342);
	}

	// ham lay thong tin ho ten
	public String getHoTen342() {
		return this.hoTen342;
	}
}