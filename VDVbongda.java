package tung;

import java.util.Scanner;

 abstract class VDVbongda extends Nguoi {
	 private Double luongcb,hsl,thuong;
     private String clb;
	private String mavdv;
	
	
	public VDVbongda() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VDVbongda(Double luongcb, Double hsl, Double thuong, String clb, String mavdv) {
		super();
		this.luongcb = luongcb;
		this.hsl = hsl;
		this.thuong = thuong;
		this.clb = clb;
		this.mavdv = mavdv;
	}
	public Double getLuongcb() {
		return luongcb;
	}
	public void setLuongcb(Double luongcb) {
		this.luongcb = luongcb;
	}
	public Double getHsl() {
		return hsl;
	}
	public void setHsl(Double hsl) {
		this.hsl = hsl;
	}
	public Double getThuong() {
		return thuong;
	}
	public void setThuong(Double thuong) {
		this.thuong = thuong;
	}
	public String getClb() {
		return clb;
	}
	public void setClb(String clb) {
		this.clb = clb;
	}
	public String getMavdv() {
		return mavdv;
	}
	public void setMavdv(String mavdv) {
		this.mavdv = mavdv;
	}
	public Double tinhluong () {
    	Double s=0.0;
    	s=(luongcb*hsl)+thuong;
		return s ;
}
	public void Nhap() {
		super.Nhap();;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập clb:  ");
	 	clb=sc.nextLine();
	 	System.out.println("Nhập mã vận động viên:  ");
	 	mavdv=sc.nextLine();
		System.out.println("lương cơ bản: ");
    	luongcb=sc.nextDouble();
    	System.out.println("Nhập hệ số lương: ");
    	hsl=sc.nextDouble();
    	System.out.println("Nhập tiền thưởng: ");
    	thuong=sc.nextDouble();
}
	public void Xuat() {
		super.Xuat();
		System.out.println(" Clb:  "+clb);
		System.out.println(" Mã vận động viên:  "+mavdv);
		System.out.println("lương cơ bản: "+luongcb);
		System.out.println("hệ số lương:"+hsl);
		System.out.println("thưởng: "+thuong);
		System.out.println("Tổng tiền vdv:  "+tinhluong());
		System.out.println("=========================");
	}
	public String GetFileline() {
		
		return clb+"\t"+mavdv+"\t"+ luongcb+"\t "+hsl+"\t"+ thuong+"\n"+super.GetFileline()+"\n";
	}
}