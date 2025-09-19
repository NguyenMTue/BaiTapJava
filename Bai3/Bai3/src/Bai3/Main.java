package Bai3;

import java.util.Scanner;

import Bai3.QuanLySach;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuanLySach qls342 = new QuanLySach();

		qls342.nhapDanhSachTL(sc);

		System.out.print("\n\nNhap vao loai tai lieu can tim: ");
		String loai = sc.nextLine();
		qls342.timLoaiTL(loai);

		System.out.print("\n\nNhap vao ma tai lieu can tim: ");
		String maTL = sc.nextLine();
		qls342.timMaTL(maTL);

		sc.close();
	}

}
