package QuanLyHoDan;

import java.util.Scanner;

class HoDan extends NhanSu{
	private int soThanhVien;
	private int soNha;
	
	HoDan(){}
	
	HoDan(String hoTen, int tuoi, int namSinh, String ngheNghiep, int soThanhVien, int soNha){
		super(hoTen, tuoi, namSinh,ngheNghiep);
		this.soThanhVien= soThanhVien;
		this.soNha= soNha;
	}
	NhanSu[] danhsach= null;
	public void Nhap() {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap So nha: ");
		soNha= Integer.parseInt(sc.nextLine());
		
		
		while (true) 
		{
			try 
				{
					System.out.println("Nhap So thanh vien: ");
					soThanhVien = Integer.parseInt(sc.nextLine());
					if(soThanhVien<0) throw new NumberFormatException();
					break;
				} 
			catch (Exception e) 
				{
					System.out.println("Ban can nhap vao so nguyen duong");
				} 
		}
		danhsach= new NhanSu[soThanhVien];
		for(int i=0; i<danhsach.length; i++) {
			danhsach[i]= new NhanSu();
			System.out.println("Thanh vien thu "+(i+1));
			danhsach[i].Nhap();
		}
	}
	
	public void In() {
		System.out.println("So nha: "+ soNha);
		System.out.println("So Thanh vien: " +soThanhVien);
		for(int i=0; i<danhsach.length; i++) {
			System.out.println("Thong tin thanh vien thu "+(i+1));
			danhsach[i].In();
		}
	}

}
