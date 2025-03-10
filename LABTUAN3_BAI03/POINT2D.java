package LABTUAN3_BAI03;
import java.util.Scanner;

public class POINT2D {
	private float x;
	private float y;
	
	public POINT2D() {
		this.x = 0.0f;
		this.y = 0.0f;
		
	}
	public POINT2D(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public void NHAPTOADO() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap hoanh do x: ");
		x = kb.nextFloat();
		System.out.print("Nhap tung do y: ");
		y = kb.nextFloat();
	}
	public POINT2D tong(POINT2D p) {
		return new POINT2D(this.x + p.x, this.y + p.y);
	}
	public POINT2D doixungquatruchoanh() {
		return new POINT2D(this.x, -this.y);
	}
	public void hienthitoado() {
		System.out.print("(" + x + "," + y + ")");
	}
}
