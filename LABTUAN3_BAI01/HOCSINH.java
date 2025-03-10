package LABTUAN3;
import java.util.Scanner;

public class HOCSINH {
	private int maso;
	private String hoten;
	private float diemtb;
	
	public int getMASO() {
		return maso;
	}
	public void setMASO(int maso) {
		this.maso = maso;
	}
	public String getHOTEN() {
		return hoten;
	}
	public void setHOTEN(String hoten) {
		this.hoten = hoten;
	}
	public float getDIEMTB() {
		return diemtb;
	}
	public void setDIEMTB(float diemtb) {
		this.diemtb = diemtb;
	}
	public HOCSINH() {	
		this.maso = 0;
		this.hoten = "";
		this.diemtb = 0f;
	}
	public HOCSINH(int maso, String hoten, float diemtb) {
		this.maso = maso;
		this.hoten = hoten;
		this.diemtb = diemtb;
	}
	public HOCSINH (HOCSINH tmp) {
		this.maso = tmp.maso;
		this.hoten = tmp.hoten;
		this.diemtb = tmp.diemtb;
	}
	public void INDANHSACH() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap ma so: ");
		maso = kb.nextInt();
		System.out.print("Nhap Ho va Ten: ");
		hoten = kb.nextLine();
		System.out.print("Nhap diem trung binh: ");
		diemtb = kb.nextFloat();
	}
	public void XUATDANHSACH() {
		System.out.print(maso + " " + hoten + " " + diemtb);
	}
}
