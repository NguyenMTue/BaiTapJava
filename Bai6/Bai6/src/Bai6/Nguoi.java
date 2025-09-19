package Bai6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen342;
	protected Date ngaySinh342;
	protected int CMND342;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen342, Date ngaySinh342, int CMND342) {
		this.hoTen342 = hoTen342;
		this.ngaySinh342 = ngaySinh342;
		this.CMND342 = CMND342;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen342 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate342 = sc.nextLine();
		ngaySinh342 = strToDate(strDate342);
		System.out.print("\tNhap CMND: ");
		CMND342 = sc.nextInt();
	}

	private Date strToDate(String strDate342) {
		Date date342 = null;
		SimpleDateFormat sdf342 = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date342 = sdf342.parse(strDate342);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date342;
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen342);
		System.out.println("\tNgay sinh: " + ngaySinh342);
		System.out.println("\tCMND: " + CMND342);
	}

	// ham lay ra thong tin CMND
	public int getCMND() {
		return CMND342;
	}
}