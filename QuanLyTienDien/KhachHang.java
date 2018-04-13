package QuanLyTienDien;

import java.util.Scanner;

class KhachHang {
	private String hoTen;
	private int soNha;
	private int soCongTo;
	
	public KhachHang() {}
	
	public KhachHang( String hoTen, int soNha, int soCongTo) {
		this.hoTen= hoTen;
		this.soNha=soNha;
		this.soCongTo=soCongTo;
	}
	
	public void NhapTT() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap Ho ten KH: ");
		hoTen= sc.nextLine();
		System.out.println("Nhap So nha KH: ");
		soNha= Integer.parseInt(sc.nextLine());
		System.out.println("Nhap So cong to dien: ");
		soCongTo= Integer.parseInt(sc.nextLine());
	}

	public void HienThiTT() {
		System.out.println("Ten KH: "+hoTen);
		System.out.println("So nha KH: "+soNha);
		System.out.println("So cong to dien: "+soCongTo);
	}
}
