package Bai10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// Thuoc tinh
	private ArrayList<BienLai> ds342;

	// Phuong thuc
	// Ham khoi tao
	public QuanLy() {
		ds342 = new ArrayList<BienLai>(10);
	}

	// Ham them bien lai vao danh sach
	public void themBienLai(BienLai bienLai342) {
		ds342.add(bienLai342);
	}

	// Ham nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		BienLai bienLai342;
		System.out.print("Nhap vao so luong bien lai: ");
		int n342 = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao danh sach bien lai:");
		for (int i342 = 0; i342 < n342; i342++) {
			System.out.println("Bien lai thu " + (i342 + 1) + " la:");
			bienLai342 = new BienLai();
			bienLai342.nhapThongTin(sc);

			themBienLai(bienLai342);
		}
	}

	// Ham hien thi danh sach
	public void hienThiDanhSach() {
		for (int i342 = 0; i342 < ds342.size(); i342++) {
			System.out.println("Bien lai thu " + (i342 + 1) + " la:");
			ds342.get(i342).hienThiThongTin();
			System.out.println();
		}
	}
}