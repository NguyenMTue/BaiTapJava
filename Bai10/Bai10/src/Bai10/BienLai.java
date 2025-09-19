package Bai10;

import java.util.Scanner;

public class BienLai extends KhachHang {
	// Thuoc tinh
	private int chiSoMoi342;
	private int chiSoCu342;
	private double tien342;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public BienLai() {

	}

	// Ham khoi tao co doi so
	public BienLai(int chiSoMoi342, int chiSoCu342, double tien342) {
		this.chiSoMoi342 = chiSoMoi342;
		this.chiSoCu342 = chiSoCu342;
		this.tien342 = tien342;
	}

	public BienLai(String tenChuHo342, int chiSoMoi342, int chiSoCu342, double tien342) {
		this.tenChuHo342 = tenChuHo342;
		this.chiSoMoi342 = chiSoMoi342;
		this.chiSoCu342 = chiSoCu342;
		this.tien342 = tien342;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi342 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu342 = sc.nextInt();
		sc.nextLine();
		tien342 = (chiSoMoi342 - chiSoCu342) * 750;
	}

	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi342);
		System.out.println("\tChi so cu: " + chiSoCu342);
		System.out.println("\tTien: : " + tien342);
	}
}