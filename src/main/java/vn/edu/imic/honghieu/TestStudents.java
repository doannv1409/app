package vn.edu.imic.honghieu;

public class TestStudents {
	public static void main (String[] args){
		Students sv1 = new Students("sv01","  HoangVanThanh","  thanh@gmail.com","  0988123456");
		print(sv1);
		Students sv2 = new Students("sv02","  PhamThiThuyLinh","  linh@gmail.com","  0988123457");
		print(sv2);
		Students sv3 = new Students("sv03","  TranVanHieu","  hieu@gmail.com","  0988123458");
		print(sv3);
		Students sv4 = new Students("sv04","  NguyenVanHung","  hung@gmail.com","  0988123459");
		print(sv4);
	}

	private static void print(Students students) {
		System.out.println(students.getma()+students.getten()+students.getgmail()+students.getphone());
	}

}
