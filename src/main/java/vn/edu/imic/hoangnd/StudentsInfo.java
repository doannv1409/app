package vn.edu.imic.hoangnd;

public class StudentsInfo {
	public static void main(String[] args) {
		Students student1 = new Students("SV01", "Hoang Van Thanh   ", "thanhhv@gmail.com", "0988123456");
		Students student2 = new Students("SV02", "Pham Thi Thuy Linh", "linhptt@gmail.com", "0988123457");
		Students student3 = new Students("SV03", "Tran Van Hieu     ", "hieutv@gmail.com ", "0988123458");
		Students student4 = new Students("SV04", "Nguyen Van Hung   ", "hungnv@gmail.com ", "0988123459");
		
		System.out.println("Ma SV" + "     " + "Ho Va Ten" + "              " + "Email" + "          " + "Phone");
		printScreen(student1);
		printScreen(student2);
		printScreen(student3);
		printScreen(student4);
	}

	public static void printScreen(Students student) {
		System.out.println(
				" "+student.getID() + "  " + student.getName() + "  " + student.getEmail() + " " + student.getPhone());
	}
    
}
