package QuanLyHoDan;

import java.util.Scanner;

class NhanSu {
	private String hoTen;
	private int tuoi;
	private int namSinh;
	private String ngheNghiep;

	public NhanSu() {}
	
	public NhanSu(String hoTen, int tuoi, int namSinh, String ngheNghiep) {
		this.hoTen= hoTen;
		this.tuoi= tuoi;
		this.namSinh= namSinh;
		this.ngheNghiep= ngheNghiep;
	}
	
	public void Nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap Ho ten thanh vien: ");
		hoTen= sc.nextLine();
		System.out.println("Nhap Tuoi: ");
		tuoi= Integer.parseInt(sc.nextLine());
		System.out.println("Nhap Nam sinh: ");
		namSinh= Integer.parseInt(sc.nextLine());
		System.out.println("Nhap nghe nghiep: ");
		ngheNghiep= sc.nextLine();
	}
	
	public void In() {
		System.out.println("Ho va ten: "+ hoTen);
		System.out.println("Tuoi: "+ tuoi);
		System.out.println("Nam sinh: "+ namSinh);
		System.out.println("Nghe nghiep: "+ngheNghiep);
	}
}
