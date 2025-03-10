package LABTUAN3_BAI05;
import java.util.Scanner;

public class TAMGIAC {
	private int a, b, c;
	
	public TAMGIAC() {
		this.a = this.b = this.c = 0;
	}
	public TAMGIAC(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void nhap() {
		Scanner kb = new Scanner(System.in);
		do {
			System.out.print("Nhap canh a: ");
			a = kb.nextInt();
			System.out.print("Nhap canh b: ");
			b = kb.nextInt();
			System.out.print("Nhap canh c: ");
			c = kb.nextInt();
			if (!kiemtratamgiac())
				System.out.print("Khong phai la tam giac! Vui long nhap lai!");
		} while (!kiemtratamgiac());
	}
	public boolean kiemtratamgiac() {
		return (a+b>c) && (a+c>b) && (b+c>a);
	}
	public int chuvi() {
		if (kiemtratamgiac()) {
			return a + b + c;
		} else {
			return 0;
		}
	}
	public double dientich() {
		if (!kiemtratamgiac()) {
			System.out.print("Khong phai la tam giac nen khong the tinh dien tich!");
			return 0;
		}
		double p = (a+b+c)/2;
			return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
	}
	public String loai() {
		if (!kiemtratamgiac()) {
			System.out.print("Khong phai la tam giac!");
		}
		boolean vuong = (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
		boolean can = (a == b) || (a== c) || (b == c);
		if (a == b && b == c) return "Tam giac deu";
		if (vuong && can) return"Tam giac vuong can";
		if (vuong) return "Tam giac vuong";
		if (can) return"Tam giac can";
		return "Tam giac thuong";
	}
	public void xuat() {
		if(!kiemtratamgiac()) {
			System.out.print("\nCac canh khong hop le!");
			return;
		}
		System.out.print("Canh " + a + ", " + b +", " + c + " Chu vi: " + chuvi() + " Dien tich: " + dientich() + " Loai: "+loai());
		
	}
}

