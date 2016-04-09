package vn.edu.imic.leanhtuan;

public class Students {
	
	private String id;
	private String name;
	private String email;
	private String phone;
	
	// ham khoi tao
	public Students(String id, String name, String email, String phone){
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	//phuong thuc set
	public void setId(String id){
		this.id = id;
	}
	
	//phuong thuc get
	public String getId(){
		return this.id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public String getPhone(){
		return this.phone;
	}
	
	//ham main
	public static void main(String [] args){
		
		Students student1 = new Students("SV01", "Hoang Van Thanh", "thanhhv@gmail.com", "0988 123 456");
		Students student2 = new Students("SV02", "Pham Thi Thuy Linh", "linhptt@gmail.com", "0988 123 457");
		Students student3 = new Students("SV03", "Tran Van Hieu", "hieutv@gmail.com", "0988 123 458");
		Students student4 = new Students("SV04", "Nguyen Van Hung", "hungnv@gmail.com", "0988 123 459");
		
		System.out.println("Ma SV" +" | "+ "Ho Va Ten" + " | " + "Email" +" | "+ "Phone");
		printStudents(student1);
		printStudents(student2);
		printStudents(student3);
		printStudents(student4);
		
	}
	
	//ham in ra thong tin sinh vien
	public static void printStudents(Students students){
		System.out.println(students.getId()  +" "+ students.getName()  +" "+ students.getEmail() +" "+ students.getPhone());
		
	}
}
