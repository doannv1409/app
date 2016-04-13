package vn.edu.imic.linh;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Person {
	private String name;
	protected Date birthay;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthay() {
		return birthay;
	}
	public void setBirthDay(Date date){
		this.birthay = date;
	}
	public Date setBirthdayByString(String date, String dateFormat) {
		Date bod = new Date();
		try{
			SimpleDateFormat dateformat = new SimpleDateFormat(dateFormat);
			bod = dateformat.parse(date);
			
		}
		catch(ParseException e){
			System.out.println("Cannot convert date");
		}
		
		return bod;
		
	}
	
	@Override
	public String toString(){
		return this.name + ',' + this.birthay;
	}
	
	public void display(){
		System.out.println(this.toString());
	}
	
}
