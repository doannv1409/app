package vn.edu.imic.quangminh.javapattern;

public class JavaPatternTest {
	public static void main(String[] args) {
		SingletonObject obj = SingletonObject.getInstance();
		SingletonObject obj2 = SingletonObject.getInstance();
		SingletonObject obj3 = SingletonObject.getInstance();
		
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj3);
		
		People p = new People();
		People p2 = p.process(9);
		System.out.println(p2.getName());
	}
}


class People {
	private String name;
	private static final People EMPTY = new People();

	
	public People process(int age) {
		if(age < 18){
			return EMPTY;
		}
		
		return new People();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}