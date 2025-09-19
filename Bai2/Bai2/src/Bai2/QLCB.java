package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	// thuoc tinh
	private ArrayList<CanBo> danhSachCanBo342;

	// phuong thuc
	// ham khoi tao
	public QLCB() {
		danhSachCanBo342 = new ArrayList<CanBo>(10);
	}

	// ham them can bo
	public void themCanBo(CanBo canBo342) {
		danhSachCanBo342.add(canBo342);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		CanBo canBo342;
		System.out.print("Nhap vao so luong can bo: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap thong tin chi tiet:");
		for (int i = 0; i < n; i++) {
			System.out.println("Lan nhap thu " + (i + 1) + ":");
			System.out.print("Chon can bo (1-KySu; 2-NhanVien;3-CongNhan): ");
			int chon = sc.nextInt();
			sc.nextLine();

			canBo342 = new CanBo();

			switch (chon) {
			case 1:
				canBo342 = new KySu();
				break;
			case 2:
				canBo342 = new NhanVien();
				break;
			case 3:
				canBo342 = new CongNhan();
				break;

			default:
				canBo342 = new KySu();
				break;
			}

			// sau khi chon loai can bo thi nhap thong tin cho can bo do
			canBo342.nhapThongTin(sc);

			// nhap xong roi thi them can bo vao danh sach
			themCanBo(canBo342);
		}
	}

	// ham tim kiem theo ten
	public void timKiemCanBo(String hoTen342) {
		for (CanBo canBo342 : danhSachCanBo342) {
			if (hoTen342.equals(canBo342.getHoTen342())) {
				canBo342.hienThiThongTin();
			}
		}
	}
}