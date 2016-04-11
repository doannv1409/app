package vn.edu.imic.vumanh;

public class Students_test {

	public static void main(String[] args) {
		Students sv01=new Students();
		sv01.setMasv("SV01");
		sv01.setHoten("Hoang Van Hanh");
		sv01.setEmail("thanhhv@gmail.com");
		sv01.setPhone("0988 123 456");
		
		Students sv02=new Students();
		sv02.setMasv("SV02");
		sv02.setHoten("Pham Thi Thuy Linh");
		sv02.setEmail("linhptt@gmail.com");
		sv02.setPhone("0988 123 457");
		
		Students sv03=new Students();
		sv03.setMasv("SV03");
		sv03.setHoten("Hoang Van Hanh");
		sv03.setEmail("hieutv@gmail.com");
		sv03.setPhone("0988 123 458");
		
		Students sv04=new Students();
		sv04.setMasv("SV04");
		sv04.setHoten("Hoang Van Hanh");
		sv04.setEmail("hungnv@gmail.com");
		sv04.setPhone("0988 123 459");
		
		System.out.println("Ma SV "+"   "+"Ho va ten"+ "             "+"Email"+"                "+"Phone"+"      ");
		System.out.println(sv01.getMasv()+"     "+sv01.getHoten()+"        "+sv01.getEmail()+"    "+sv01.getPhone());
		System.out.println(sv02.getMasv()+"     "+sv02.getHoten()+"    "+sv02.getEmail()+"    "+sv02.getPhone());
		System.out.println(sv03.getMasv()+"     "+sv03.getHoten()+"       "+sv03.getEmail()+"     "+sv03.getPhone());
		System.out.println(sv04.getMasv()+"     "+sv04.getHoten()+"       "+sv04.getEmail()+"     "+sv04.getPhone());
	}
}
