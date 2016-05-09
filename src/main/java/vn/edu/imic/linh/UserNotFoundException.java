package vn.edu.imic.linh;

public class UserNotFoundException extends RuntimeException {

	private String code;
	private String message;

	public UserNotFoundException(String message, String code) {
		super(message);
		this.code = code;
		this.message = message;

	}

}
