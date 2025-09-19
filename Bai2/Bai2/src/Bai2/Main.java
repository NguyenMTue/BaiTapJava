package Bai2;

import java.util.Scanner;

import Bai2.QLCB;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QLCB qlcb342 = new QLCB();

		qlcb342.nhapDanhSach(sc);

		System.out.print("Nhap vao ho ten can tim kiem: ");
		String hoTen342 = sc.nextLine();

		qlcb342.timKiemCanBo(hoTen342);

		// huy sc
		sc.close();
	}

}