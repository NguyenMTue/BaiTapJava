package Bai4;

import java.util.Scanner;

import Bai4.TuyenSinh;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TuyenSinh dsTuyenSinh342 = new TuyenSinh();

		System.out.println("Nhap vao danh sach thi sinh: ");
		dsTuyenSinh342.nhapDanhSach(sc);

		System.out.println("Danh sach thi sinh du thi la:");
		dsTuyenSinh342.hienThiDanhSach();

		System.out.print("Nhap so bao danh can tim: ");
		int soBaoDanh342 = sc.nextInt();
		sc.nextLine();

		dsTuyenSinh342.timKiemThiSinh(soBaoDanh342);

		sc.close();
	}
}