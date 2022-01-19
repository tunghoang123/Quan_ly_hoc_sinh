package tung;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class TestvdvBD {
	static ArrayList<VDVbongda> vdvlist=new ArrayList<VDVbongda>();
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int n;
		
		do {
			menu();;
			n=Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				Themvdv();
				break;
	         case 2:
				Suavdv();
				break;
	        case 3:
				Xoavdv();
				break;
	        case 4:
			     SapXepByTenvdv();
			break;
	         case 5:
		          SapXepbyluong();
		    break;
	         case 6:
				Hienthivdv();
				break;
	         case 7:
				LuuFilevdv();
				break;
	         case 8:
				System.out.println("Thoát chương trình");
				break;

	default:
				System.out.println(" Bạn nhập sai, mời nhập lại!!!");
				break;
	}
		}while(n!=8);
	}
	
      private static void LuuFilevdv() {
		// luu file
    	  FileOutputStream fos =null;
    	  try {
    		   fos=new FileOutputStream("VDV.txt",true);
    			  for(VDVbongda vdv:vdvlist) {
    				  String line=vdv.GetFileline();
    				  try {
	      					byte[] b=line.getBytes("utf8");
	      					try {
	      						fos.write(b);
	      					} catch (IOException e) {
	      						// TODO Auto-generated catch block
	      						e.printStackTrace();
	      					}
	      				} catch (UnsupportedEncodingException e) {
    					// TODO Auto-generated catch block
	      					e.printStackTrace();
	      				}
	      				
	      			}
	      		} catch (FileNotFoundException e) {
	      			// TODO Auto-generated catch block
	      			e.printStackTrace();
	      		}finally {
	      			if(fos!=null) {
	      				try {
	      					fos.close();
	      				} catch (IOException e) {
	      					// TODO Auto-generated catch block
	      					e.printStackTrace();
    			  }
    	  }
      }
    	  
      }		  
    	  
	private static void Hienthivdv() {
		// hien thi vdv
		for(VDVbongda vdv:vdvlist) {
			vdv.Xuat();
			
		}
		
	}
	private static void SapXepbyluong() {
		// xap xep theo luong
	Collections.sort(vdvlist,new Comparator<VDVbongda>() {
		@Override
		public int compare(VDVbongda o1, VDVbongda o2) {
			// cao xuong thấp
			if(o1.tinhluong()>o2.tinhluong()){
			return -1;
		}
			return 1;
	}});
			}
	
	private static void SapXepByTenvdv() {
		// Sap xep theo ten
		Collections.sort(vdvlist, new Comparator<VDVbongda>() {

		
			@Override
			public int compare(VDVbongda o1, VDVbongda o2) {
				// TODO Auto-generated method stub
				return o1.getHoten().compareToIgnoreCase(o2.getHoten());
			}
		});
	}
	private static void Xoavdv() {
		// xoa van dong vien theo ho ten
		System.out.println("Xóa vận động viên theo mã vận động viên:  ");
	  String id=sc.nextLine();
	  for(VDVbongda vdv:vdvlist) {
		  if(vdv.getMavdv().equals(id)) {
			  vdvlist.remove(vdv);
			  break;
		  }
	  }
	}
	private static void Suavdv() {
		//Sua van dong vien
		System.out.println("Sửa vận động viên theo mã vdv: ");
		String id =sc.nextLine();
		for(VDVbongda vdv:vdvlist) {
			if(vdv.getMavdv().equals(id)) {
				vdv.Nhap();
				break;
			}
		}
		
	}
	private static void Themvdv() {
		// Them van dong vien
		System.out.println("Thêm vận động viên: ");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			VDVbongda vdv=new VDVbongda() {
				
			};
			vdv.Nhap();
			vdvlist.add(vdv);
		}
		
	}
	static void menu() {
    	    System.out.println("====menu====");
    	    System.out.println("1.thêm số vận động viên bóng đá: ");
    	    System.out.println("2.Sửa số vận động viên bóng đá theo mã vận động viên: ");
    	    System.out.println("3.Xoá vận động viên theo mã vận động viên:  ");
			System.out.println("4.Sắp xếp danh sách theo tên VDV");
			System.out.println("5.Sắp xếp Vdv theo lương của vận động viên");
			System.out.println("6. Hiển thị danh sách ");
			System.out.println("7. Lưu vào file Vdv.txt");
			System.out.println("8. Thoát khỏi chương trình");
			System.out.println(" Chọn");
		}

	}


