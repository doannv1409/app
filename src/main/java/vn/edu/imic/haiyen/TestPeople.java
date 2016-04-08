package vn.edu.imic.haiyen;

public class TestPeople {
	public static void main(String[] args) {
		//call default constructor
		People trinh = new People();
		//neu de the nay thi se in ra la null
		trinh.setFullName("nguyen van trinh");
		System.out.println(trinh.getFullName());
		
		//goi ham constructor co tham so
		People manh = new People("nguyen van manh", 23);
		System.out.println(manh.getFullName());//lay ten ra
		
	}

}
