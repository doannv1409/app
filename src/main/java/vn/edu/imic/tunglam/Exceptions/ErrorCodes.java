package vn.edu.imic.tunglam.Exceptions;

import java.util.ArrayList;
import java.util.List;

public enum ErrorCodes {
	EMPTY_USERNAME("empty username", "001"), EMPTY_PASSWORD("empty password",
			"002"), INVALID_USER("invalid username or password", "003");
	private String message;
	private String code;

	private ErrorCodes(String message, String code) {
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
		List<String> errCodes = new ArrayList<>();
		for (ErrorCodes error : ErrorCodes.values()) {
			errCodes.add(error.code());
		}
		return errCodes;
	}
}
