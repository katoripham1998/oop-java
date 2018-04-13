package QuanLyTienDien;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int luachon;
		int n;
		BienLai[] danhsach=null;
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Nhap thong tin n ho dan");
		System.out.println("2.Hien thi thong tin n ho dan");
		System.out.println("3.Thoat khoi chuong trinh");
		do {
			System.out.println("Moi ban nhap lua chon: ");
			luachon= Integer.parseInt(sc.nextLine());
			if(luachon<1||luachon>3) System.out.println("Du lieu nhap khong hop le");
			switch (luachon) {
			case 1:
				{
					System.out.println("Nhap so luong ho dan: ");
					n= Integer.parseInt(sc.nextLine());
					danhsach= new BienLai[n];
					for(int i=0;i< danhsach.length; i++) {
						danhsach[i]= new BienLai();
						danhsach[i].NHapTT();
					}
					break;
				}
			case 2:
			{
				System.out.println("DANH SACH HO DAN");
				for(int i=0; i< danhsach.length; i++) {
					danhsach[i].HienThiTT();
				}
				break;
			}
			
			}
		} while (luachon!=3);
	}

}
