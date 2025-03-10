package LABTUAN3;

public class DEMO1 {

	public static void main(String[] args) {
		HOCSINH hs1 = new HOCSINH();
		System.out.print("Nhap thong tin hoc sinh: ");
		hs1.INDANHSACH();
		hs1.XUATDANHSACH();
		HOCSINH hs2 = new HOCSINH(137,"Le Tran Tan Phat",6.0f);
		hs2.XUATDANHSACH();
		HOCSINH hs3 = new HOCSINH(hs2);
		hs3.XUATDANHSACH();
		
		hs3.setHOTEN("Nguyen Thanh Phat");
		hs3.XUATDANHSACH();
		
		float lonnhat = hs1.getDIEMTB();
		String ten = hs1.getHOTEN();
		
		if (lonnhat < hs2.getDIEMTB()) {
			lonnhat = hs2.getDIEMTB();
			ten = hs2.getHOTEN();
		}
		if (lonnhat < hs3.getDIEMTB()) {
			lonnhat = hs3.getDIEMTB();
			ten = hs3.getHOTEN();
		} else {
			System.out.print(ten + " co diem trung binh lon nhat " + lonnhat);
		}
	}

}
