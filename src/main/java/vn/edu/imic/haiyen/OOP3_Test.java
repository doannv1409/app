package vn.edu.imic.haiyen;

public class OOP3_Test {
	public static void displayInf(OOP3_Circle c){
		System.out.println("----------------Lan thuc hien "+c.getId()+"----------------");
		System.out.println("+ Doi tuong "+c.getObj()+":Voi ban kinh= "+c.getDRadius()+" Dien tich = "+c.Area());
		System.out.println();
	}
	public static void main(String[] args) {
		OOP3_Circle c1=new OOP3_Circle(1, "objC01", 30.5);
		c1.setDRadius(30.5);
		OOP3_Circle c2=new OOP3_Circle(2, "objC02", 40);
		c2.setDRadius(25.5);
		OOP3_Circle c3=new OOP3_Circle(3, "objC03", 120.5);
		c3.setDRadius(60);
		OOP3_Circle c4=new OOP3_Circle(4, "objC04", 88.5);
		
		displayInf(c1);
		displayInf(c2);
		displayInf(c3);
		displayInf(c4);
		 
	}

}
