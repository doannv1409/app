package vn.edu.imic.tung;

public class Oop1_Test {
	public static void main ( String [] agrs ){
		Oop1_Student Ms01 = new Oop1_Student();
		Ms01.setMsv("MS01");
		Ms01.setName("Hoang Van Thanh");
		Ms01.setMail("thanhhv@gmail.com");
		Ms01.setPhone("0988 123 456");
		
		Oop1_Student Ms02 = new Oop1_Student();
		Ms02.setMsv("MS02");
		Ms02.setName("Hoang Minh Chau");
		Ms02.setMail("Chauhm@gmail.com");
		Ms02.setPhone("0988 223 456");
		
		Oop1_Student Ms03 = new Oop1_Student();
		Ms03.setMsv("MS03");
		Ms03.setName("Tran Van Thai");
		Ms03.setMail("thaitv@gmail.com");
		Ms03.setPhone("0998 123 456");
		
		Oop1_Student Ms04 = new Oop1_Student();
		Ms04.setMsv("MS04");
		Ms04.setName("Nguyen Van Hai");
		Ms04.setMail("hainv@gmail.com");
		Ms04.setPhone("0977 123 456");
		System.out.println("Ma SV "+"   "+"Ho va ten"+ "             "+"Email"+"                "+"Phone"+"      ");
		print(Ms01);
		print(Ms02);
		print(Ms03);
		print(Ms04);
		
	}
	private static void print( Oop1_Student Student){
		System.out.println(Student.getMsv()+"     "+Student.getName()+"        "+Student.getMail()+"    "+Student.getPhone());
		
		
		
	};
}
