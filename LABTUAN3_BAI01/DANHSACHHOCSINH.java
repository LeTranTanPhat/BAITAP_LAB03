package LABTUAN3;
import java.util.Scanner;

public class DANHSACHHOCSINH {
	private HOCSINH danhsach[];
	private int soluonghs;
	
	public void NHAPDANHSACH() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Hay nhap so luong hoc sinh: ");
		soluonghs = kb.nextInt();
		
		danhsach = new HOCSINH[soluonghs];
		for (int i = 0; i < soluonghs; i++) {
			danhsach[i] = new HOCSINH();
			danhsach[i].XUATDANHSACH();
		}
		
	}
	public void XUATDS() {
		System.out.print("Danh sach hoc sinh la: \n");
		for (int i = 0; i < soluonghs; i++)
			danhsach[i].XUATDANHSACH();
	}
	public void SAPXEPDANHSACHTHEODIEMGIAMDAN() {
		for(int i = 0; i < soluonghs; i++) {
			for (int j = i + 1; j < soluonghs; j++) {
				if(danhsach[i].getDIEMTB() < danhsach[j].getDIEMTB());
				HOCSINH temp = danhsach[i];
				danhsach[i] = danhsach[j];
				danhsach[j] = temp;
			}
		}
	}
}
