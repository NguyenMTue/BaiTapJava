package Bai7;

import java.util.Scanner;

import Bai7.QLHS;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		QLHS list342 = new QLHS();
		
		list342.nhapDanhSachHS(sc);
		
		System.out.print("Nhung hoc sinh sinh nam 1985 va que Thai Nguyen la:");
		list342.timKiemThongTin(1985, "Thai Nguyen");
		
		System.out.println("Nhung hoc sinh hoc lop 10A1 la:");
		list342.timKiemThongTin("10A1");
		
		sc.close();
	}
}