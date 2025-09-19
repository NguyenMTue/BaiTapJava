package Bai6;

import java.util.Scanner;

public class KhachTro extends Nguoi {
	// thuoc tinh
	private int soNgayTro342;
	private String loaiPhong342;
	private double giaPhong342;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhachTro() {

	}

	// ham khoi tao co doi so
	public KhachTro(String hoTen342, int CMND342, int soNgayTro342, String loaiPhong342, double giaPhong342) {
		this.hoTen342 = hoTen342;
		this.CMND342 = CMND342;
		this.soNgayTro342 = soNgayTro342;
		this.loaiPhong342 = loaiPhong342;
		this.giaPhong342 = giaPhong342;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so ngay tro: ");
		soNgayTro342 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong342 = sc.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong342 = sc.nextDouble();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo ngay tro: " + soNgayTro342);
		System.out.println("\tLoai phong: " + loaiPhong342);
		System.out.println("\tGia phong: " + giaPhong342);
	}

	// ham lay ra thong tin so ngay tro
	public int getSoNgayTro() {
		return soNgayTro342;
	}

	// ham lay thong tin gia phong
	public double getGiaPhong() {
		return giaPhong342;
	}
}