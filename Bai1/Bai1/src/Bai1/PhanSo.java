package Bai1;

import java.util.Scanner;

public class PhanSo {
    // thuộc tính
    private int tuSo342;
    private int mauSo342;

    // hàm khởi tạo không đối số
    public PhanSo() {
        tuSo342 = 0;
        mauSo342 = 1;
    }

    // hàm khởi tạo có đối số
    public PhanSo(int tuSo342, int mauSo342) {
        this.tuSo342 = tuSo342;
        this.mauSo342 = mauSo342;
    }

    // hàm nhập phân số
    public void nhapPS(Scanner sc) {
        int a342;
        int b342;

        do {
            System.out.print("\tNhập vào tử số: ");
            a342 = sc.nextInt();

            System.out.print("\tNhập vào mẫu số: ");
            b342 = sc.nextInt();

            if (b342 == 0) {
                System.out.println("Mẫu số không được bằng 0. Hãy nhập lại!");
            } else {
                tuSo342 = a342;
                mauSo342 = b342;
            }
        } while (b342 == 0);
    }

    // hàm hiển thị
    public void hienThiPS() {
        if (tuSo342 * mauSo342 < 0) {
            System.out.println("\t-" + Math.abs(tuSo342) + "/" + Math.abs(mauSo342));
        } else {
            System.out.println("\t" + Math.abs(tuSo342) + "/" + Math.abs(mauSo342));
        }
    }

    // hàm cộng
    public PhanSo congPS(PhanSo ps2) {
        int a342 = tuSo342 * ps2.mauSo342 + ps2.tuSo342 * mauSo342;
        int b342 = mauSo342 * ps2.mauSo342;

        return new PhanSo(a342, b342);
    }

    // hàm trừ
    public PhanSo truPS(PhanSo ps2) {
        int a342 = tuSo342 * ps2.mauSo342 - ps2.tuSo342 * mauSo342;
        int b342 = mauSo342 * ps2.mauSo342;

        return new PhanSo(a342, b342);
    }

    // hàm nhân
    public PhanSo nhanPS(PhanSo ps2) {
        int a342 = tuSo342 * ps2.tuSo342;
        int b342 = mauSo342 * ps2.mauSo342;

        return new PhanSo(a342, b342);
    }

    // hàm chia
    public PhanSo chiaPS(PhanSo ps2) {
        int a342 = tuSo342 * ps2.mauSo342;
        int b342 = mauSo342 * ps2.tuSo342;

        return new PhanSo(a342, b342);
    }

    // hàm tìm USCLN
    private int timUSCLN(int a342, int b342) {
        int r342 = a342 % b342;

        while (r342 != 0) {
            a342 = b342;
            b342 = r342;
            r342 = a342 % b342;
        }

        return b342;
    }

    // kiểm tra tối giản
    public boolean kiemTraToiGian() {
        return timUSCLN(tuSo342, mauSo342) == 1;
    }

    // tối giản phân số
    public void toiGianPS() {
        int x342 = timUSCLN(tuSo342, mauSo342);

        tuSo342 /= x342;
        mauSo342 /= x342;
    }
}
