package Bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// thuoc tinh
	private ArrayList<CBGV> ds342;

	// phuong thuc
	// ham khoi tao
	public QuanLy() {
		ds342 = new ArrayList<CBGV>(10);
	}

	// ham them can bo vao danh sach
	public void themCBGV(CBGV canBo342) {
		ds342.add(canBo342);
	}

	// ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc) {
		CBGV canBo342;

		System.out.print("Nhap vao so luong can bo: ");
		int n342 = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i342 = 0; i342 < n342; i342++) {
			System.out.println("Can bo thu " + (i342 + 1) + " la:");
			canBo342 = new CBGV();
			canBo342.nhapThongTin(sc);
			themCBGV(canBo342);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		for (CBGV cb342 : ds342) {
			cb342.hienThiThongTin();
		}
	}

	// ham tim kiem
	public void timKiem(double luong342) {
		for (CBGV cb342 : ds342) {
			if (cb342.getLuongThucLinh() >= luong342) {
				cb342.hienThiThongTin();
			}
		}
	}
}