package QuanLyKhachHang;

import java.util.ArrayList;
import java.util.Scanner;

public class QLKH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		ArrayList<KhachHang> danhsach= new ArrayList();
		System.out.println("=========================================================================");
		System.out.println("1.Nhap vao n Khach Hang");
		System.out.println("2.Hien thi danh sach Khach Hang");
		System.out.println("3.Hien thi Khach Hang co tong luong lon hon x");
		System.out.println("Thoat khoi chuong tring");
		System.out.println("=========================================================================");
		int n; int luachon;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Nhap vao lua chon cua ban");
			try {
				luachon=Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				luachon=0;
				System.out.println("Ban phai nhap vao mot so nguyen");
				
			}
			switch (luachon) {
			case 1:
				{
					System.out.print("Nhap so luong Khach Hang: ");
					n= Integer.parseInt(sc.nextLine());
					arr= new int[n]; //tạo lập số lượng phần tử cho mảng
					for(int i=0;i<arr.length;i++)
					{
						KhachHang kh= new KhachHang();
						kh.NhapTT();
						danhsach.add(kh); // thêm kh được lưu và danhsach
						
					}
					break;
				}
				
			case 2:{
				System.out.println("THONG TIN DANH SACH KHACH HANG CO TRONG DANH SACH ");
				for(int i=0; i<danhsach.size(); i++)
				{
					danhsach.get(i).HienThiTT();
				}
				break;
			}
			case 3:{
				System.out.println("Nhap tong luong: ");
				int x= Integer.parseInt(sc.nextLine());
				for(int i=0; i< danhsach.size();i++)
				{
					if(x>danhsach.get(i).getTongluong()) danhsach.get(i).HienThiTT();
				}
				break;
			}
		
			}
			
		} while (luachon!=4);
	}

}
