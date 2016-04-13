package vn.edu.imic.haiyen;

public class B2_Manager extends B2_Employee {
	B2_Employee assistant;

	public B2_Manager(double salary, B2_Employee assistant) {
		super(salary);
		this.assistant = assistant;
	}

	public void setAssistant(B2_Employee employee) {
		this.assistant = employee;
	}

	@Override
	public String toString() {
		return super.toString();

	}

	@Override
	public String display() {
		return "assistant of" + name + "is" + assistant.name;
	}

}
