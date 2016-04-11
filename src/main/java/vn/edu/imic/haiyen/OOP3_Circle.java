package vn.edu.imic.haiyen;

public class OOP3_Circle {
	private int id;
	String obj;
	double dRadius=1.0;
	public OOP3_Circle(){
		
	}
	public OOP3_Circle(int id, String obj,double NewdRadius){
		this.id=id;
		this.obj=obj;
		dRadius=NewdRadius;
	}
	public double Area(){
		return dRadius*dRadius*Math.PI;
	}
	public void setDRadius(double dRadius){
		this.dRadius=dRadius;
		
	}
	public double getDRadius(){
		return dRadius;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setObj(String obj){
		this.obj=obj;
	}
	public String getObj(){
		return obj;
	}
}
