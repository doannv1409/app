package vn.edu.imic.vumanh;

public class UserNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String Code;
	private String Message;
	public UserNotFoundException(String code, String message) {
		super();
		Code = code;
		Message = message;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	
}
