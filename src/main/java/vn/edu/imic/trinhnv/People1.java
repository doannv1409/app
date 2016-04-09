package vn.edu.imic.trinhnv;

import java.util.Date;

public class People1 {
	private String Fullname;
    public int age;
    protected Date DateOfBirth;
    String address;

    public People1() {
    }
    public People1(String Fullname, int age){
        this.Fullname = Fullname;
        this.age = age;
    }
    public String getFullname(){
        return  Fullname;
    }
    public void setFullname(String Fullname){
        this.Fullname = Fullname;
    }
}

class TestPeople {
	 public static void main(String[] args) {
	        People1 tr = new People1();
	        tr.setFullname("Nguyen van A");
	        tr.age = 25;
	        tr.address = "Ha noi";
	        tr.DateOfBirth = new Date();
	        print(tr);
	        
	        People1 vm = new People1("nguyen van B", 23);
	        vm.address = "Ha noi 2";
	        vm.DateOfBirth = new Date();
	        print(vm);
	    }
	    
	 public static void print (People1 ez){
	        System.out.println(ez.getFullname());
	        System.out.println(ez.age);
	        System.out.println(ez.address);
	        System.out.println(ez.DateOfBirth);
	  }
}
