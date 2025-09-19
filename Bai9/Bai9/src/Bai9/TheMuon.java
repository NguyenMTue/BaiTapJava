package Bai9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	// thuoc tinh
	private int soMuon342;
	private Date ngayMuon342;
	private Date hanTra342;
	private String soHieu342;

	// phuong thuc
	// ham khoi tao khong doi so
	public TheMuon() {

	}

	// ham khoi tao co doi so
	public TheMuon(int soMuon342, Date ngayMuon342, String soHieu342) {
		this.soMuon342 = soMuon342;
		this.ngayMuon342 = ngayMuon342;
		this.soHieu342 = soHieu342;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so muon: ");
		soMuon342 = sc.nextInt();
		sc.nextLine();

		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon342 = sc.nextLine();
		ngayMuon342 = strToDate(strNgayMuon342);

		String strNgayTra342 = "31-12-2020";
		hanTra342 = strToDate(strNgayTra342);

		System.out.println("\tNhap so hieu: ");
		soHieu342 = sc.nextLine();
	}

	private Date strToDate(String strNgayMuon342) {
		Date date342 = null;

		SimpleDateFormat sdf342 = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date342 = sdf342.parse(strNgayMuon342);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date342;
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon342);
		System.out.println("\tNgay muon: " + ngayMuon342);
		System.out.println("\tHan tra: " + hanTra342);
		System.out.println("\tSo hieu: " + soHieu342);
	}

	// ham lay ra thong tin ve han tra
	public Date getHanTra() {
		return hanTra342;
	}
}