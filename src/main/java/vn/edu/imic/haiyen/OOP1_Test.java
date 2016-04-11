package vn.edu.imic.haiyen;

public class OOP1_Test {
	
	public static void main(String[] args) {
		OOP1_Student sv01=new OOP1_Student();
		sv01.setMasv("SV01");
		sv01.setHoten("Hoang Van Hanh");
		sv01.setEmail("thanhhv@gmail.com");
		sv01.setPhone("0988 123 456");
		
		OOP1_Student sv02=new OOP1_Student();
		sv02.setMasv("SV02");
		sv02.setHoten("Pham Thi Thuy Linh");
		sv02.setEmail("linhptt@gmail.com");
		sv02.setPhone("0988 123 457");
		
		OOP1_Student sv03=new OOP1_Student();
		sv03.setMasv("SV03");
		sv03.setHoten("Tran Van Hieu");
		sv03.setEmail("hieutv@gmail.com");
		sv03.setPhone("0988 123 458");
		
		OOP1_Student sv04=new OOP1_Student();
		sv04.setMasv("SV04");
		sv04.setHoten("Nguyen Van Hung");
		sv04.setEmail("hungnv@gmail.com");
		sv04.setPhone("0988 123 459");
		
		System.out.println("Ma SV "+"   "+"Ho va ten"+ "             "+"Email"+"                "+"Phone"+"      ");
		System.out.println(sv01.getMasv()+"     "+sv01.getHoten()+"        "+sv01.getEmail()+"    "+sv01.getPhone());
		System.out.println(sv02.getMasv()+"     "+sv02.getHoten()+"    "+sv02.getEmail()+"    "+sv02.getPhone());
		System.out.println(sv03.getMasv()+"     "+sv03.getHoten()+"         "+sv03.getEmail()+"     "+sv03.getPhone());
		System.out.println(sv04.getMasv()+"     "+sv04.getHoten()+"       "+sv04.getEmail()+"     "+sv04.getPhone());
	}

}
