package vn.edu.imic.TungLam;

import java.util.Scanner;

public class JavaForBase02 {
	

	public static void main(String[] args){
		
		Scanner sld=new Scanner(System.in);
		double Slide01, Slide02, Slide03;
		
		System.out.println("+ Các cạnh của tam giác là:");
		Slide01=sld.nextDouble();
		System.out.println("+ Slide01= "+Slide01);
		Slide02=sld.nextDouble();
		System.out.println("+ Slide02= "+Slide02);
		Slide03=sld.nextDouble();
		System.out.println("+ Slide03= "+Slide03);
		
		double area, p, per;
		
			p=(Slide01+ Slide02 + Slide03 )/2;
			area=Math.sqrt(p * (p-Slide01) * (p-Slide02) * (p-Slide03));
			per=Slide01 + Slide02 + Slide03;
				System.out.println("+ Diện tích của tam giác là "+area+" m2");
				System.out.println("+ Chu vi của tam giác là "+per+" m");
				
	}

}
