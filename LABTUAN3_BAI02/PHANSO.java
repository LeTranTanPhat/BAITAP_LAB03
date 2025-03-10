package LABTUAN3_BAI02;
import java.util.Scanner;

public class PHANSO {
	private int tu;
	private int mau;
	
	public PHANSO() {
		this.tu = 0;
		this.mau = 1;
		
	}
	public PHANSO(int tu, int mau) {
		if (mau == 0) {
			System.out.print("Mau phai lon > 0. Mac dinh la 1!");
			this.mau = 1;
		} else {
			this.tu = tu;
			this.mau = mau;
		}
		rutGon();
	}
	public PHANSO(PHANSO p) {
		this.tu = p.tu;
		this.mau = p.mau;
		rutGon();
	}
	public void NHAPPHANSO() {
		Scanner kb = new Scanner(System.in);
		System.out.print("\nNhap tu so: ");
		this.tu = kb.nextInt();
		System.out.print("\nNhap mau so: ");
		this.mau = kb.nextInt();
		while (this.mau == 0) {
			System.out.print("Mau khong the bang 0. Vui long nhap lai!");
			this.mau = kb.nextInt();
		}
		rutGon();
	}
	public void XUATPHANSO() {
		if (mau == 1) {
			System.out.print(tu);
		} else {
			System.out.print(tu + "/" +mau);
		}
	}
	private int USCLN(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	public void rutGon() {
		int uscln = USCLN(this.tu, this.mau);
		this.tu /= uscln;
		this.mau /= uscln;
		if(this.mau < 0) {
			this.tu = -this.tu;
			this.mau = -this.mau;
		}
	}
	public PHANSO cong(PHANSO p) {
		int tumoi = this.tu * p.mau + this.mau * p.tu;
		int maumoi = this.mau * p.mau;
		return new PHANSO(tumoi, maumoi);
	}
	public PHANSO nhan(PHANSO p) {
		int tumoi = this.tu * p.tu;
		int maumoi = this.mau * p.mau;
		return new PHANSO(tumoi,maumoi);
	}
	public PHANSO chia(PHANSO p) {
		if (p.tu == 0) {
			System.out.print("Khong the chia cho 0!");
		}
		int tumoi = this.tu * p.mau;
		int maumoi = this.mau * p.tu;
		return new PHANSO(tumoi, maumoi);
	}
}
	
