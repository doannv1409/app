package vn.edu.imic.trinhnv;

	public class People {
	    private int id;
	    private String fullName;
	    private int arm;
	    private int leg;
	    private String hairColor;
	    private String language;
	    private String gender;
	    
	    public People(){
	    }

	   public int getId(){
	       return id;
	   }
	   public void setId(int id){
	       this.id = id;
	   }
	    
	   public String getFullName(){
	       return fullName;
	   }
	   
	   public void setFullName(String fullName){
	       this.fullName = fullName;
	   }

	    public int getArm() {
	        return arm;
	    }

	    public void setArm(int arm) {
	        this.arm = arm;
	    }

	    public int getLeg() {
	        return leg;
	    }

	    public void setLeg(int leg) {
	        this.leg = leg;
	    }

	    public String getHairColor() {
	        return hairColor;
	    }

	    public void setHairColor(String hairColor) {
	        this.hairColor = hairColor;
	    }

	    public String getLanguage() {
	        return language;
	    }

	    public void setLanguage(String language) {
	        this.language = language;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }
	   
	   
	    public People(int id, String fullName, int arm, int leg, 
	            String hairColor, String language, String gender){
	        this.id = id;
	        this.fullName = fullName;
	        this.arm =  arm;
	        this.leg = leg;
	        this.hairColor = hairColor;
	        this.language = language;
	        this.gender = gender;
	    } 
	}

class ShowPeople{
	    public static void main(String[] args) {
	        System.out.println("...............d...............");
	        People h01 = new People(1, "Nguyen Van Minh", 2, 2,"Den", "VNI", "Nam");
	        print(h01);
	        People h02 = new People(2, "Pham Hong Nhung", 2, 2,"Nau", "VNI", "Nu");
	        print(h02);
	        People h03 = new People(3, "Hoang Minh Hieu", 2, 2,"Vang", "VNI", "Nam");
	        print(h03);
	        People h04 = new People(4, "J.Brave", 2, 2,"Do", "ENG", "Nam");
	        print(h04);
	        
	        System.out.println("...............e...............");
	        h01.setFullName("Nguyen Van Manh");
	        h01.setHairColor("Do");
	        h01.setLanguage("VNI,ENG");
	        print(h01);
	        h02.setFullName("Pham Thi Hong Nhung");
	        h02.setHairColor("Tim");
	        h02.setLanguage("VNI,ENG");
	        print(h02);
	        h03.setHairColor("Xanh");
	        h03.setLanguage("VNI,ENG,KOREA");
	        print(h03);
	        h04.setHairColor("Vang");
	        h04.setLanguage("ENG,VNI");
	        print(h04);
	    }
	    
	    private static void print(People people){
	        System.out.println("--------------" + people.getId() +"-----------------");
	        System.out.println("+Ho va ten:" + people.getFullName());
	        System.out.println("+So chan:" + people.getLeg() + "- So tay:" + people.getArm() +
	                " - Mau toc:"+ people.getHairColor());
	        System.out.println("+Ngon ngu:" + people.getLanguage());
	        System.out.println("+Gioi tinh:" + people.getGender());
	   }
}
