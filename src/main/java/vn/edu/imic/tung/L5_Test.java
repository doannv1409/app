package vn.edu.imic.tung;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
public class L5_Test {
	public static void main ( String[] args ){
		L5_Employee emp = new L5_Employee();
		emp.setName("nguyen nha truc");
		//SimpleDateFormat format = new SimpleDateFormat
		//		("dd/MM/yyyy");
		//Date birthday = null;
		//try {
			//Convert tu String date co dang dd/MM/yyyy
			//Thanh kieu java.util.Date
		//	birthday = format.parse("08/03/2016");
		//	System.out.print(birthday);
		//} catch (ParseException e) {
		//	e.printStackTrace();
		//}
		//emp.setBirthday(new Date());
		//String dobStr = format.format(emp.getBirthday());
		emp.setSalary(15000000);
		
		emp.toString();
		
	}

}
