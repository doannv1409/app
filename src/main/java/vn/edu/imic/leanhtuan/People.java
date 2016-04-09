package vn.edu.imic.leanhtuan;

public class People {
	private int id;
	private String name;
	private int numberleg;
	private int numberarm;
	private String haircolor;
	private String language;
	private String gender;
	
	//ham khoi tao
	public People(int id, String name, int numberleg, int numberarm, String haircolor, String language, String gender){
		this.id = id;
		this.name = name;
		this.numberleg = numberleg;
		this.numberarm = numberarm;
		this.haircolor = haircolor;
		this.gender = gender;
		this.language = language;
	}
	
	//ham set
	public void setId(int id){
		this.id = id;
	}
	
	// ham get
	public int getId(){
		return this.id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setNumberLeg(int numberleg){
		this.numberleg = numberleg;
	}
	
	public int getNumberLeg(){
		return this.numberleg;
	}
	
	public void setNumberarm(int numberarm){
		this.numberarm = numberarm;
	}
	
	public int getNumberArm(){
		return this.numberarm;
	}
	
	public void setHairColor(String haircolor){
		this.haircolor = haircolor;
	}
	
	public String getHairColor(){
		return this.haircolor;
	}
	
	public void setLanguage(String language){
		this.language = language;
	}
	
	public String getLanguage(){
		return this.language;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	
	public String getGender(){
		return this.gender;
	}
	
	public static void main(String [] args){
		// khoi tao gia tri cho doi tuong
		People people1 = new People(1, "Nguyen Van Minh", 2 , 2 , "Den","VNI", "Nam");
		People people2 = new People(2, "Pham Hong Nhung", 2 , 2 , "Nau","VNI", "Nu");
		People people3 = new People(3, "Hoang Minh Hieu", 2 , 2 , "Vang","VNI", "Nam");
		People people4 = new People(4, "J.Brave", 2 , 2 , "Do","ENG", "Nam");
		
		//dung thuoc tinh sua ten cho doi tuong
		people1.setName("Nguyen Van Manh");
		people2.setName("Pham Thi Hong Nhung");
		
		//dung thuoc tinh sua mau toc, ngon ngu cho doi tuong
		people1.setHairColor("Do");
		people1.setLanguage("VNI, ENG");
		
		people2.setHairColor("Tim");
		people2.setLanguage("VNI, ENG");
		
		people3.setHairColor("Xanh");
		people3.setLanguage("VNI, ENG,KOREA");
		
		people4.setHairColor("Vang");
		people4.setLanguage("ENG,VNI");
		
		System.out.println("-----------" + "1" + "------------");
		printPeople(people1);
		System.out.println("-----------" + "2" + "------------");
		printPeople(people2);
		System.out.println("-----------" + "3" + "------------");
		printPeople(people3);
		System.out.println("-----------" + "4" + "------------");
		printPeople(people4);
		
	}
	
	public static void printPeople(People people){
			System.out.println("+ Ho va Ten : " + people.getName());
			System.out.println("+ So chan : " + people.getNumberLeg() + "-" + "So tay : " + people.getNumberArm() + "-" + "Mau toc" + people.getHairColor());
			System.out.println("+ Ngon ngu : " + people.getLanguage());
			System.out.println("+ Gioi tinh : " + people.gender);
		}
	
	
}

