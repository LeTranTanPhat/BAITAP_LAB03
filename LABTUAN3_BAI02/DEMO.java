package LABTUAN3_BAI02;

public class DEMO {

	public static void main(String[] args) {
		PHANSO p1 = new PHANSO();	
		System.out.print("Phan so p1 ban dau: ");
		p1.XUATPHANSO();
		System.out.print("\nPhan so p1 da nhap: ");
		p1.NHAPPHANSO();
		System.out.print("\nPhan so p1 sau khi nhap: ");
		p1.XUATPHANSO();
		
		PHANSO p2 = new PHANSO(4,16);
		System.out.print("\nPhan so p2: ");
		p2.XUATPHANSO();
		
		p2.rutGon();
		System.out.print("\nPhan so p2 khi da rut gon la: ");
		p2.XUATPHANSO();
		
		PHANSO p3 = new PHANSO();
		System.out.print("\nNhap phan so p3: ");
		p3.NHAPPHANSO();
		System.out.print("\nPhan so p3: ");
		p3.XUATPHANSO();
		
		PHANSO tong = p1.cong(p3);
		System.out.print("\np1 + p3 = ");
		tong.XUATPHANSO();
		
		PHANSO p4 = new PHANSO(tong);
		System.out.print("\nPhan so p4 duoc sao chep tu phep tinh o tren la: ");
		p4.XUATPHANSO();
		
		PHANSO tich = p4.nhan(p2);
		System.out.print("\np4 nhan voi p2 la: ");
		tich.XUATPHANSO();
	}

}
