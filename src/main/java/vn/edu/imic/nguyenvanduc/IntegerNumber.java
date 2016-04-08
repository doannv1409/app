package vn.edu.imic.nguyenvanduc;

public class IntegerNumber {
	private int value;

	public IntegerNumber(int value){
		this.value=value;
	}
	
	//nen de ve public hoac remove neu ko can
	private void setValue(int value) {
		this.value = value;

	}

	public Integer getvalue() {
		return this.value;
	}

}
