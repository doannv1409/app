package vn.edu.imic.quangminh.javapattern;

public class SingletonObject {
	private static SingletonObject instance = new SingletonObject(); 
	private SingletonObject() {
		
	}
	
	public static SingletonObject getInstance() {
		return instance;
	}
}
