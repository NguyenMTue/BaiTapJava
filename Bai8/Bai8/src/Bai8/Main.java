package Bai8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuanLy ql342 = new QuanLy();

		ql342.nhapDanhSach(sc);

		System.out.println("Danh sach nhung can bo co luong >= 8 trieu la:");
		ql342.timKiem(8000000);

		sc.close();
	}
}