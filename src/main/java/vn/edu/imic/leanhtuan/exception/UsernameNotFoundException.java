package vn.edu.imic.leanhtuan.exception;

public class UsernameNotFoundException extends RuntimeException{
		/**
	 * 
	 */
	private static final long serialVersionUID = -5895086142426965560L;

		public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

		protected String code;
		protected String message;
		
		public UsernameNotFoundException(String message, String code){
			this.message = message;
			this.code = code;
		}
}
