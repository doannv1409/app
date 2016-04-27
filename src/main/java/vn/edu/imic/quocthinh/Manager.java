package vn.edu.imic.quocthinh;
import java.util.Date;
public class Manager extends Employee{
public Employee assistant;
public Manager(Employee assistant, double salary){
	super();
}
@Override
public String toString() {
	return "Manager [assistant=" + assistant + "]";
}
}