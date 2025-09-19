package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
	// thuoc tinh
	private ArrayList<ThiSinh> dsts342;

	// phuong thuc
	public TuyenSinh() {
		dsts342 = new ArrayList<ThiSinh>(10);
	}

	// ham them 1 thi sinh
	public void themThiSinh(ThiSinh ts342) {
		dsts342.add(ts342);
	}

	// nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		ThiSinh ts342;
		int chon342;

		System.out.print("Nhap vao so luong thi sinh: ");
		int n342 = sc.nextInt();
		sc.nextLine();

		for (int i342 = 0; i342 < n342; i342++) {
			System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
			chon342 = sc.nextInt();

			switch (chon342) {
			case 1:
				ts342 = new KhoiA("Toan", "Ly", "Hoa");
				break;
			case 2:
				ts342 = new KhoiB("Toan", "Hoa", "Sinh");
				break;
			case 3:
				ts342 = new KhoiC("Van", "Su", "Dia");
				break;
			default:
				ts342 = new KhoiA("Toan", "Ly", "Hoa");
				break;
			}

			ts342.nhapThongTin(sc);
			themThiSinh(ts342);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		int n342 = dsts342.size();
		for (int i342 = 0; i342 < n342; i342++) {
			System.out.println("Thi sinh thu " + (i342 + 1) + " la:");
			dsts342.get(i342).hienThiThongTin();
		}
	}

	// tim kiem thi sinh theo so bao danh
	public void timKiemThiSinh(int soBaoDanh342) {
		for (ThiSinh ts342 : dsts342) {
			if (ts342.getSoBD() == soBaoDanh342) {
				ts342.hienThiThongTin();
			}
		}
	}
}