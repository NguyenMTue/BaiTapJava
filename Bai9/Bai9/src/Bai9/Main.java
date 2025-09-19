package Bai9;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuanLy ql342 = new QuanLy();

		ql342.nhapDanhSach(sc);

		System.out.println("Danh sach sinh vien tra sach vao cuoi thang:");
		ql342.hienThiDanhSachTraCuoiThang();

		sc.close();
	}
}