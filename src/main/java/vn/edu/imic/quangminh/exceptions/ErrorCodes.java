package vn.edu.imic.quangminh.exceptions;

import java.util.ArrayList;
import java.util.List;

public enum ErrorCodes {
	EMPTY_USERNAME("Empty username", "001"),
	EMPTY_PASSWORD("Empty password", "002"),
	INVALID_USER("Invalid username or password", "003");
	private String message;
	private String code;
	
	private ErrorCodes(String message, String code){
		this.message = message;
		this.code = code;
	}
	
	public String message() {
		return this.message;
	}
	
	public String code() {
		return this.code;
	}
	
	public static List<String> codes() {
		List<String> errorCodes = new ArrayList<>();
		for (ErrorCodes error : ErrorCodes.values()) {
			errorCodes.add(error.code());
		}
		
		return errorCodes;
	}
}
