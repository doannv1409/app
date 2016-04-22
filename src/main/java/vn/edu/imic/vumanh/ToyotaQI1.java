package vn.edu.imic.vumanh;

public class ToyotaQI1 {
	public class ToyotaQ1 extends ToyotaQI {
		private String guong;
		private String amThanh;
		private String denSuongMu;
		public ToyotaQ1(String guong, String amThanh, String denSuongMu) {
			super();
			this.amThanh = amThanh;
			this.guong = guong;
			this.denSuongMu = denSuongMu;
		}
		
		@Override
		public String toString() {
			String thuocTinhChung = super.toString();
			StringBuilder info = new StringBuilder(thuocTinhChung);
			
			info.append("2. Phu kien di rieng cho dong xe nay: \n")
			.append("+ ").append(guong).append("\n")
			.append("+ ").append(amThanh).append("\n")
			.append("+ ").append(denSuongMu).append("\n");
			
			return info.toString();
		}
	}
}
