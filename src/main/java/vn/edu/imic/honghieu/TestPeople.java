package vn.edu.imic.honghieu;

public class TestPeople {
	public static void main (String[] args){
		People sv1 = new People("1", "NguyenVanMinh", 2, 2,"Den", "VNI", "Nam");
		print(sv1);
		People sv2 = new People("2","PhamHongNhung",2,2,"Nau","VNI","Nu");
		print(sv2);
		People sv3 = new People("3","HoangMinhHieu",2,2,"Vang","VNI","Nam");
		print(sv3);
		People sv4 = new People("4","J.Brave",2,2,"Do","ENG","Nam");
		print(sv4);
	}

	private static void print(People People) {
		System.out.println(People.getid());
		System.out.println(People.getname());
		System.out.println(People.gettay());
		System.out.println(People.getchan());
		System.out.println(People.gethaircolor());
		System.out.println(People.getlanguage());
		System.out.println(People.getgioitinh());
	}
}
