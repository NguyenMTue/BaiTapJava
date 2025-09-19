package Bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	private String hoTen342;
	private Date ngaySinh342;
	private String ngheNghiep342;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen342, Date ngaySinh342, String ngheNghiep342) {
		this.hoTen342 = hoTen342;
		this.ngaySinh342 = ngaySinh342;
		this.ngheNghiep342 = ngheNghiep342;
	}

	// nhap cac thong tung nguoi trong ho gia dinh
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen342 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String chuoiNgay342 = sc.nextLine();
		ngaySinh342 = strToDate(chuoiNgay342);
		System.out.print("\tNhap nghe nghiep: ");
		ngheNghiep342 = sc.nextLine();
	}

	// ham thuc hien chuyen string sang date
	private Date strToDate(String chuoiNgay342) {
		Date ngay342 = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			ngay342 = sdf.parse(chuoiNgay342);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return ngay342;
	}

	// hien thi ra tung nguoi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen342);
		System.out.println("\tNgay sinh: " + dateToString(ngaySinh342));
		System.out.println("\tNghe nghiep: " + ngheNghiep342);
	}

	// ham chuyen dinh dang tu date sang String
	private String dateToString(Date ngay342) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		String chuoiNgay342 = sdf.format(ngay342);

		return chuoiNgay342;
	}

	// ham lay thong tin ve ngay sinh
	public Date getNgaySinh342() {
		return ngaySinh342;
	}
}