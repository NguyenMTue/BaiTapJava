package Bai4;

import java.util.Scanner;

public class ThiSinh {
	// thuoc tinh
	private int soBD342;
	private String hoTen342;
	private String diaChi342;
	private String dienUuTien342;

	// phuong thuc
	// ham khoi tao khong doi so
	public ThiSinh() {

	}

	// ham khoi tao co doi so
	public ThiSinh(int soBD342, String hoTen342, String diaChi342, String dienUuTien342) {
		this.soBD342 = soBD342;
		this.hoTen342 = hoTen342;
		this.diaChi342 = diaChi342;
		this.dienUuTien342 = dienUuTien342;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD342 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen342 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi342 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien342 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD342);
		System.out.println("\tHo ten: " + hoTen342);
		System.out.println("\tDia chi: " + diaChi342);
		System.out.println("\tDien uu tien: " + dienUuTien342);
	}

	// ham lay ra thong tin ve so bao danh
	public int getSoBD() {
		return soBD342;
	}
}