package vn.edu.imic.hongtran;

import java.util.Scanner;

public class ExCouple {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("+ nhap ten");
        String ten = scan.nextLine();
        if(ten.isEmpty()){
            System.out.print("chua nhap ten!");
            return;
        }        
        System.out.print("+ nhap tuoi = ");
        String box = scan.nextLine();
        if(box.isEmpty()){
            System.out.print("chua nhap tuoi!");
            return;
        }
        byte tuoi = Byte.parseByte(box);
        
        System.out.print("+ chon tinh trang hon nhan: (0)-Ly hon; (1)-Chua ket hon; (2)-da ket hon; ");
        box = scan.nextLine();
        if(box.isEmpty()){
            System.out.print("chon tinh trang hon nhan di!");
            
        }
        byte tinhtranghn = Byte.parseByte(box);
        
        System.out.print("+ Chon gioi tinh: (0)-Nu; (1)-Nam; ");
        box = scan.nextLine();
        if(box.isEmpty()){
            System.out.print("chon gioi tinh di");
            return;
        }
        byte gioitinh = Byte.parseByte(box);
        
       
        if(tuoi < 19 || tinhtranghn == 2){
            System.out.println("+ khong duoc tham gia");
            return;
        }
        else if(gioitinh == 1){
            if(tuoi < 22){
                System.out.println("+ khong duoc tham gia");
                return;
            }
            System.out.println("+duoc tham gia");
            return;
        }
        else{
            System.out.println("+ duoc tham gia");
        }		
	}

}
