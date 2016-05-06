package vn.edu.imic.nguyenvanduc.oop.generic;

public class Pair<T> {
	private T first;
	private T second;

	public Pair() {
		first = null;
		second = null;
	}
	public Pair(T first, T second){
		this.first=first;
		this.second=second;
	}
	public T getFirst() {
		return first;
	}
	public void setFirst(T newvalue) {
		this.first = newvalue;
	}
	public T getSecond() {
		return second;
	}
	public void setSecond(T newvalue) {
		this.second = newvalue;
	}
	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}
}
