package QuanLyTienDien;

import java.util.Scanner;

class BienLai extends KhachHang{
	private int soMoi;
	private int soCu;
	private int soTienTra;
	
	public BienLai() {}
	
	public BienLai(String hoTen, int soNha, int soCongTo, int soMoi, int soCu ) {
		super(hoTen, soNha, soCongTo);
		this.soMoi=soMoi;
		this.soCu=soCu;
	}	
	

	public void NHapTT() {
	super.NhapTT();
	Scanner sc= new Scanner(System.in);
	System.out.println("Chi so cu: ");
	soCu= Integer.parseInt(sc.nextLine());
	System.out.println("Chi so moi: ");
	soMoi= Integer.parseInt(sc.nextLine());
	
	}
	
	public void HienThiTT() {
		super.HienThiTT();
		System.out.println("Chi so cu: "+soCu);
		System.out.println("Chi so moi: "+soMoi);
		System.out.println("So tien phai tra"+ TinhTiendien());
	}
	
	public int TinhTiendien() {
		soTienTra= (soMoi-soCu)*850000;
		return soTienTra;
	}
}
