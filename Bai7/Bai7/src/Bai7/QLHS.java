package Bai7;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
	// thuoc tinh
	private ArrayList<HocSinh> dshs342;

	// phuong thuc
	// ham khoi tao
	public QLHS() {
		dshs342 = new ArrayList<HocSinh>(10);
	}

	// ham them hoc sinh
	public void themHS(HocSinh hs342) {
		dshs342.add(hs342);
	}

	// ham nhap danh sach
	public void nhapDanhSachHS(Scanner sc) {
		HocSinh hs342;

		System.out.print("Nhap vao so luong hoc sinh: ");
		int n342 = sc.nextInt();

		System.out.println("Nhap thong tin cho hoc sinh trong danh sach:");
		for (int i342 = 0; i342 < n342; i342++) {
			System.out.println("\tHoc sinh thu " + (i342 + 1) + " la:");

			hs342 = new HocSinh();
			hs342.nhapThongTin(sc);

			themHS(hs342);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		int n342 = dshs342.size();
		for (int i342 = 0; i342 < n342; i342++) {
			System.out.println("\tHoc sinh thu " + (i342 + 1) + " la:");
			dshs342.get(i342).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin(int nam342, String que342) {
		for (HocSinh hs342 : dshs342) {
			if ((hs342.getNgaySinh().getYear() + 1900 == nam342) && (que342.equals(hs342.getQueQuan()))) {
				hs342.hienThiThongTin();
			}
		}
	}

	public void timKiemThongTin(String lop342) {
		for (HocSinh hs342 : dshs342) {
			if (lop342.equals(hs342.getLop())) {
				hs342.hienThiThongTin();
			}
		}
	}
}