package vn.edu.imic.quangminh.generic;

public interface Transformer<O, I> {
	O transform(I i);
}
