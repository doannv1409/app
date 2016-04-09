package vn.edu.imic.trinhnv;

public class Students {
    private String code;
    private String fullname;
    private String email;
    private String phone;

    public String getCode(){
        return code;
    }
    public String getFullName(){
        return fullname;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public Students(String code, String fullname){
        this.code = code;
        this.fullname = fullname;
    }
}

class ShowStudents{
    public static void main(String[] args) {
        Students sv01 = new Students("SV01"," Hoang Van Thanh");
        sv01.setEmail(" thanhhv@gmail.com");
        sv01.setPhone(" 0988 123 456");
        print(sv01);
        
        Students sv02 = new Students("SV02"," Pham Thi Thuy Linh");
        sv02.setEmail(" linhptt@gmail.com");
        sv02.setPhone(" 0988 123 457");
        print(sv02);
        
        Students sv03 = new Students("SV03"," Pham Van Hieu");
        sv03.setEmail(" hieutv@gmail.com");
        sv03.setPhone(" 0988 123 458");
        print(sv03);
        
        Students sv04 = new Students("SV04"," Nguyen Van Hung");
        sv04.setEmail(" hungnv@gmail.com");
        sv04.setPhone(" 0988 123 459");
        print(sv04);
    }
    
  private static void print(Students sv){
        System.out.print(sv.getCode());
        System.out.print(sv.getFullName());
        System.out.print(sv.getEmail());
        System.out.println(sv.getPhone());
    }
}

