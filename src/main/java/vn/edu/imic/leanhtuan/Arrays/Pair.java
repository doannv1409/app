package vn.edu.imic.leanhtuan.Arrays;

public class Pair<T> {
	protected T first;
	protected T second;

	public Pair(){
		first = null;
		second = null;
	}

	public Pair(T first, T second){
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T newValue) {
		first = newValue;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T newValue) {
		second = newValue;
	}
	
	public String toString(){
		return "first: " + first + ", second: " + second;
		
	}

}

