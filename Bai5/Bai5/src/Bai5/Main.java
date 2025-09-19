package Bai5;

import java.util.Scanner;

import Bai5.KhuPho;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		KhuPho qlkp342 = new KhuPho();

		qlkp342.nhapDanhSach(sc);

		System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
		qlkp342.timKiemThongTin();

		// huy sc
		sc.close();
	}

}