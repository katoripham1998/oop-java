package QuanLyHoDan;

import java.util.Scanner;

public class QLHD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HoDan[] danhsachHD= null;// khai bao danh sach ban dau
		int n=0; //số hộ dân
		int luachon;
		Scanner sc= new Scanner(System.in);
		System.out.println("=======================MENU==============================");
		System.out.println("1.Nhap thong tin cho n ho dan");
		System.out.println("2.Hien thi thong tin cac ho dan trong khu pho");
		System.out.println("3.Thoat chuong trinh");
		System.out.println("=======================END===============================");
		do {
			try {
				System.out.println("Nhap lua chon cua ban: ");
				luachon = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Du lieu ban nhap khong hop le");
				luachon=0;
			}
			switch (luachon) {
			case 1:{
				while (true) 
				{
					try 
						{
							System.out.println("Nhap so ho dan trong khu pho: ");
							n = Integer.parseInt(sc.nextLine());
							
							if(n<0) throw new NumberFormatException();
							break;
						} 
					catch (NumberFormatException e) 
						{
							System.out.println("Ban can nhap so nguyen duong");
						} 
				}
				danhsachHD= new HoDan[n];       //danh sach luu tru n ho dan
				for(int i=0; i<danhsachHD.length;i++) {
					danhsachHD[i]= new HoDan(); //cấp phát bộ nhớ để lưu trữ
					System.out.println("Nhap thong tin ho dan thu "+(i+1));
					danhsachHD[i].Nhap();
				}
				break;
			}
			case 2:{
				System.out.println("THONG TIN CAC HO DAN TRONG KHU PHO");
				for(int i=0; i<danhsachHD.length;i++)
				{
					System.out.println("Ho dan thu "+(i+1)+"====================");
					danhsachHD[i].In();
				}
				break;
			}
			}
			
			
			
			
		} while (luachon!=3);
	}

}
