package QuanLySach;

import java.util.Scanner;

class Sach {
	private String tenSach;
	private String tenTacGia;
	private int namXuatBan;
	
	public Sach() {}
	
	public Sach(String tenSach, String tenTacGia, int namXuatBan) {
		this.tenSach= tenSach;
		this.tenTacGia= tenTacGia;
		this.namXuatBan=namXuatBan;
	}
	
	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public void NhapTT() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap ten Sach: ");
		tenSach= sc.nextLine();
		System.out.println("Nhap ten tac gia: ");
		tenTacGia= sc.nextLine();
		System.out.println("Nhap nam xuat ban: ");
		namXuatBan= Integer.parseInt(sc.nextLine());
	}
	
	public void HienThiTT() {
		/*System.out.println("Ten sach: "+tenSach);
		System.out.println("Ten tac gia: "+tenTacGia);
		System.out.println("Nam xuat ban: "+namXuatBan);*/
		System.out.printf("\n\t\t%-20s %-20s %-10d",tenSach, tenTacGia, namXuatBan);
	}
}
