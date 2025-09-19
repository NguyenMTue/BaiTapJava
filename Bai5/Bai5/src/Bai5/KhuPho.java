package Bai5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
	// thuoc tinh
	private ArrayList<HoDan> danhSachHoDan342;

	// phuong thuc
	// ham khoi tao
	public KhuPho() {
		danhSachHoDan342 = new ArrayList<HoDan>(10);
	}

	// ham them 1 ho dan
	public void themHoDan(HoDan hoDan342) {
		danhSachHoDan342.add(hoDan342);
	}

	// ham nhap vao danh sach ho dan
	public void nhapDanhSach(Scanner sc) {
		HoDan hoDan342;

		System.out.print("Nhap vao so ho dan: ");
		int soHoDan342 = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin cho tung ho dan:");
		for (int i = 0; i < soHoDan342; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			hoDan342 = new HoDan();
			hoDan342.nhapThongTin(sc);
			themHoDan(hoDan342);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		int n = danhSachHoDan342.size();

		for (int i = 0; i < n; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			danhSachHoDan342.get(i).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin() {
		// lay ra duoc nam hien tai
		Date now = new Date();
		int namHienTai = now.getYear() + 1900;

		Nguoi[] danhSachThanhVien342 = null;

		for (HoDan hoDan342 : danhSachHoDan342) {
			danhSachThanhVien342 = hoDan342.getDanhSach342();
			for (int i = 0; i < hoDan342.getSoNguoi342(); i++) {
				if (namHienTai - (danhSachThanhVien342[i].getNgaySinh342().getYear() + 1900) == 80) {
					hoDan342.hienThiThongTin();
				}
			}
		}
	}
}