package Bai10;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuanLy ql342 = new QuanLy();
		ql342.nhapDanhSach(sc);

		System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
		ql342.hienThiDanhSach();

		sc.close();
	}
}