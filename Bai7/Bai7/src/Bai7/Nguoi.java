package Bai7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen342;
	protected Date ngaySinh342;
	protected String queQuan342;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen342, Date ngaySinh342, String queQuan342) {
		this.hoTen342 = hoTen342;
		this.ngaySinh342 = ngaySinh342;
		this.queQuan342 = queQuan342;
	}

	// ham nhap vao thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen342 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		String strDate342 = sc.nextLine();
		ngaySinh342 = strToDate(strDate342);

		System.out.print("\tNhap que quan: ");
		queQuan342 = sc.nextLine();
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
		System.out.println("\tQue quan: " + queQuan342);
	}

	// ham lay ra que quan
	public String getQueQuan() {
		return queQuan342;
	}

	// ham lay ra thong tin ve ngay sinh
	public Date getNgaySinh() {
		return ngaySinh342;
	}
}