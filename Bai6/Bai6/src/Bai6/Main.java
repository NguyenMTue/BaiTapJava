package Bai6;

import java.util.Scanner;

import Bai6.KhachSan;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		KhachSan ql342 = new KhachSan();

		ql342.nhapDanhSach(sc);

		System.out.print("Nhap vao khach tro can tinh tien: ");
		int cmnd342 = sc.nextInt();

		System.out.println("==> Tong tien la: " + ql342.tinhTien(cmnd342));

		sc.close();
	}
}