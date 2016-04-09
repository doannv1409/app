package vn.edu.imic.haiyen;

public class People {
	private String fullName;
	public int age;

	// Constructor
	// ko khai bao constructor thi java se khai bao ham
	// mac dinh defaul constructor

	// khai bao constructor mac dinh - co the dinh nghía/ko
	public People() {

	}

	// thay cho ham set
	public People(String fullName, int age) {
		// khoi tao gia tri
		this.fullName = fullName;
		this.age = age;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
		// this tham chieu den lop doi tuong People
	}

	// lay ho ten cua lop People
	public String getFullName() {
		return fullName;
		// return this.fullName;
	}
	// constructor co tham so de khoi tao thuoc tinh

}
