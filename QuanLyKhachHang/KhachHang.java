package QuanLyKhachHang;

import java.util.Scanner;

class KhachHang {
	private String MaKH;
	private String hoten;
	private int namsinh;
	private double tongluong;
	
	public KhachHang() {}
	
	public KhachHang(String MaKH) {
		this.MaKH=MaKH;
	}
	
	public KhachHang( String MaKH, String hoten, int namsinh, double tongluong) {
		this.hoten=hoten;
		this.MaKH=MaKH;
		this.namsinh=namsinh;
		this.tongluong=tongluong;
	}
	
	
	public String getMaKH() {
		return MaKH;
	}

	public void setMaKH(String maKH) {
		MaKH = maKH;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	public double getTongluong() {
		return tongluong;
	}

	public void setTongluong(double tongluong) {
		this.tongluong = tongluong;
	}

	public void NhapTT() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap ma Khach hang: ");
		MaKH=sc.nextLine();
		System.out.print("Nhap ten Khach hang: ");
		hoten=sc.nextLine();
		System.out.print("Nhap nam sinh: ");
		namsinh=Integer.parseInt(sc.nextLine());
		System.out.print("Nhap tong luong: ");
		tongluong=Double.parseDouble(sc.nextLine());
		
	}
	
	public void HienThiTT() {
		System.out.print(" Ma Khach hang: "+MaKH);
		System.out.print(" Ho ten Khach hang: "+hoten);
		System.out.print(" Nam sinh: "+namsinh);
		System.out.println(" Tong luong: "+tongluong);
	}
}
