package Bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// thuoc tinh
	private ArrayList<TheMuon> ds342;

	// phuong thuc
	// ham khoi tao khong doi so
	public QuanLy() {
		ds342 = new ArrayList<TheMuon>(10);
	}

	// ham them the muon vao danh sach
	public void themTheMuon(TheMuon theMuon342) {
		ds342.add(theMuon342);
	}

	// ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc) {
		TheMuon theMuon342;

		System.out.print("Nhap vao so luong the muon: ");
		int n342 = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i342 = 0; i342 < n342; i342++) {
			System.out.println("The muon thu " + (i342 + 1) + " la:");
			theMuon342 = new TheMuon();
			theMuon342.nhapThongTin(sc);
			themTheMuon(theMuon342);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSachTraCuoiThang() {
		for (TheMuon the342 : ds342) {
			if (the342.getHanTra().getDate() == 31 || the342.getHanTra().getDate() == 30) {
				the342.hienThiThongTin();
			}
		}
	}
}