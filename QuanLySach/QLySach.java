package QuanLySach;

import java.util.ArrayList;
import java.util.Scanner;

public class QLySach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sach> danhsach= new ArrayList<>();
		int n=0;//so luong sach
		int luachon;
		int[] Arr= null;
		System.out.println(" ___________________________________________ ");
		System.out.println("                                           ");
		System.out.println("  1.Nhap vao n quyen sach                 ");
		System.out.println("  2.Hien thi thong tin sach               ");
		System.out.println("  3.Liet ke sach xuat ban truoc nam n     ");
		System.out.println("  4.Thoat chuong trinh                    ");
		System.out.println("____________________________________________");
		Scanner sc= new Scanner(System.in);
		do {
			try {
				System.out.println("Nhap lua chon cua ban: ");
				luachon = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				luachon=0;
				System.out.println("Du lieu ban nhap khong hop le");
			}
			switch (luachon) {
			case 1:
				{
					while (true) {
						try {
							System.out.println("Nhap so luong sach: ");
							n = Integer.parseInt(sc.nextLine());
							break;
						} catch (NumberFormatException e) {
							System.out.println("Ban phai nhap so nguyen duong");
						} 
					}
					Arr= new int[n]; // Mang luu tru n quyen sach
					for(int i=0; i<Arr.length; i++)
						{
							Sach s= new Sach();
							s.NhapTT();
							danhsach.add(s);
						}
					break;
				}
			case 2:
				{
					System.out.println("\t\t\t==============THONG TIN SACH===============");
					System.out.printf("\t\t%-20s %-20s %-10s","Ten Sach", "Ten Tac Gia", "Nam Xuat Ban");
					for(int i=0; i<danhsach.size();i++)
						{
							danhsach.get(i).HienThiTT();
						}
					System.out.println();
					break;
				}
			case 3:
				{	
					int nam;
					int dem=0;
					System.out.println("Nhap nam xuat ban: ");
					nam= Integer.parseInt(sc.nextLine());
					System.out.println("\t\t\t==============THONG TIN SACH===============");
					System.out.printf("\t\t%-20s %-20s %-10s","Ten Sach", "Ten Tac Gia", "Nam Xuat Ban");
					for(int i=0; i<danhsach.size();i++)
					{
						if(nam>danhsach.get(i).getNamXuatBan())
						{
							danhsach.get(i).HienThiTT();
							dem++;
						}
					}
					System.out.println();
					if(dem==0) System.out.println("Khong co quyen sach nao xuat ban truoc nam "+nam);
					break;
				}
			}
			
		} while (luachon!=4);
	}

}
