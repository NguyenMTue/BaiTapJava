package Bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	// thuoc tinh
	private ArrayList<KhachTro> ds342;

	// phuong thuc
	// ham khoi tao
	public KhachSan() {
		ds342 = new ArrayList<KhachTro>(10);
	}

	// ham them khach tro vao khach san
	public void themKhachTro(KhachTro kt342) {
		ds342.add(kt342);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		KhachTro khach342;

		System.out.print("Nhap vao so luong khach: ");
		int n342 = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin khach tro:");
		for (int i342 = 0; i342 < n342; i342++) {
			System.out.println("Khach tro thu " + (i342 + 1) + " la:");
			khach342 = new KhachTro();
			khach342.nhapThongTin(sc);
			themKhachTro(khach342);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		for (KhachTro khach342 : ds342) {
			khach342.hienThiThongTin();
		}
	}

	// ham tinh tien
	public double tinhTien(int CMND342) {
		double tien342 = 0;

		for (KhachTro khach342 : ds342) {
			if (khach342.getCMND() == CMND342) {
				tien342 = khach342.getSoNgayTro() * khach342.getGiaPhong();
			}
		}

		return tien342;
	}
}