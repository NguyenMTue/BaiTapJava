package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
	// thuoc tinh
	private ArrayList<TaiLieu> dstl342;

	// phuong thuc
	// ham khoi tao
	public QuanLySach() {
		dstl342 = new ArrayList<TaiLieu>(10);
	}

	// them moi 1 tai lieu
	public void themTaiLieu(TaiLieu tl) {
		dstl342.add(tl);
	}

	// nhap danh sach tai lieu
	public void nhapDanhSachTL(Scanner sc) {
		int chon342;
		String stop342;
		TaiLieu tl342;

		do {
			System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
			chon342 = sc.nextInt();
			sc.nextLine();

			switch (chon342) {
			case 1:
				tl342 = new Sach();
				break;
			case 2:
				tl342 = new TapChi();
				break;
			case 3:
				tl342 = new Bao();
				break;

			default:
				tl342 = new Sach();
				break;
			}

			tl342.nhapThongTin(sc);
			themTaiLieu(tl342);

			System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
			stop342 = sc.nextLine();
		} while (stop342.equals("c"));
	}

	// tim kiem theo ma tai lieu
	public void timMaTL(String maTL) {
		for (TaiLieu tl342 : dstl342) {
			if (maTL.equals(tl342.getMaTaiLieu())) {
				tl342.hienThiThongTin();
			}
		}
	}

	// tim kiem theo loai tai lieu
	public void timLoaiTL(String loai) {
		for (TaiLieu tl342 : dstl342) {
			if (loai.equals("Sach") && (tl342 instanceof Sach)) {
				tl342.hienThiThongTin();
			} else if (loai.equals("TapChi") && (tl342 instanceof TapChi)) {
				tl342.hienThiThongTin();
			} else if (loai.equals("Bao") && (tl342 instanceof Bao)) {
				tl342.hienThiThongTin();
			}
		}
	}
}
