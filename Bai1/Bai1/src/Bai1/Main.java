package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo phanSo1_342 = new PhanSo();
        PhanSo phanSo2_342 = new PhanSo();
        PhanSo tongPhanSo342;

        System.out.println("Nhap phan so thu nhat:");
        phanSo1_342.nhapPS(sc);
        System.out.println("Nhap phan so thu hai:");
        phanSo2_342.nhapPS(sc);

        tongPhanSo342 = phanSo1_342.congPS(phanSo2_342);

        System.out.println("Phan so thu nhat: ");
        phanSo1_342.hienThiPS();
        System.out.println("Phan so thu hai: ");
        phanSo2_342.hienThiPS();
        System.out.println("Tong 2 phan so: ");
        tongPhanSo342.hienThiPS();

        sc.close();
    }
}