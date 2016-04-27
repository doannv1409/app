package vn.edu.imic.linh;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	
	private String id;
	private String name;
	private float avergeMark;
	
	public Student(){
		
	}
	public Student(String id, String name, float avergeMark){
		this.id = id;
		this.name = name;
		this.avergeMark = avergeMark;
	}
	
	public String getName(){
		return this.name;
	}
	
	public float getAvergeMark(){
		return this.avergeMark;
	}
	
	@Override
	public int compare(Student student1, Student student2){
		return student1.getName().compareTo(student2.getName());
		
	}
	
	@Override
	public String toString(){
		StringBuffer string = new StringBuffer();
		string.append("Id: "+this.id).append("\n");
		string.append("Name: "+this.name).append("\n");
		string.append("Averge Mark: "+this.avergeMark).append("\n");
		return string.toString();
	}
	

}
