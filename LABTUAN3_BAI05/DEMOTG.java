package LABTUAN3_BAI05;
import java.util.Scanner;

public class DEMOTG {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Nhap mot tam giac: ");
		TAMGIAC tg1 = new TAMGIAC();
		tg1.nhap();
		TAMGIAC[] danhsach = {
				tg1,
				new TAMGIAC(3, 4, 5),   
	            new TAMGIAC(6, 6, 6),   
	            new TAMGIAC(5, 5, 8),   
	            new TAMGIAC(7, 7, 10),  
	            new TAMGIAC(1, 2, 3)
		};
		System.out.print("\n ket qua: ");
		for (TAMGIAC tg : danhsach) {
			tg.xuat();
		}

	}

}
