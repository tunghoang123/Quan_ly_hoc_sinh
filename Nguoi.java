package tung;

import java.util.Scanner;

abstract class Nguoi {
	private String Hoten,sdt,quequan;
    
	public Nguoi() {
		
	}
	public Nguoi(String hoten, String sdt, String quequan
			) {
		Hoten = hoten;
		this.sdt = sdt;
		this.quequan = quequan;
		
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getQuequan() {
		return quequan;
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}	
 public void Nhap() {
 	Scanner sc=new Scanner(System.in);
 	System.out.println("Nhập thông tin: ");
 	System.out.println("Nhập họ tên: ");
 	Hoten=sc.nextLine();
 	System.out.println("Nhập số điện thoại: ");
 	sdt=sc.nextLine();
 	System.out.println("Quê quán: ");
 	quequan=sc.nextLine();
 	
 	
 }
 public void Xuat() {
  	System.out.println("Họ tên:"+Hoten);
  	System.out.println("Số điện thoại: "+sdt);
  	System.out.println("Quê quán: "+quequan);
  
  	
}
 public String GetFileline() {
		return Hoten+"\t"+ sdt+"\t"+quequan+"\n";
	}
  protected abstract Double tinhluong() ;
	 
 
}
