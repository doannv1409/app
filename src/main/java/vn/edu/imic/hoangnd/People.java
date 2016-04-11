package vn.edu.imic.hoangnd;

public class People {
	public int ID;
	public String Name;
	public int NumberOfLeg;
	public int NumberOfArm;
	public String HairColor;
	public String Language;
	public String Gender;

	public People(int ID, String Name, int NumberOfLeg, int NumberOfArm, String HairColor, String Language,
			String Gender) {
		this.ID = ID;
		this.Name = Name;
		this.NumberOfLeg = NumberOfLeg;
		this.NumberOfArm = NumberOfArm;
		this.HairColor = HairColor;
		this.Gender = Gender;
		this.Language = Language;
	}

	public void setId(int ID) {
		this.ID = ID;
	}

	public int getId() {
		return this.ID;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getName() {
		return this.Name;
	}

	public void setNumberOfLeg(int NumberOfLeg) {
		this.NumberOfLeg = NumberOfLeg;
	}

	public int getNumberOfLeg() {
		return this.NumberOfLeg;
	}

	public void setNumberOfArm(int NumberOfArm) {
		this.NumberOfArm = NumberOfArm;
	}

	public int getNumberOfArm() {
		return this.NumberOfArm;
	}

	public void setHairColor(String HairColor) {
		this.HairColor = HairColor;
	}

	public String getHairColor() {
		return this.HairColor;
	}

	public void setLanguage(String Language) {
		this.Language = Language;
	}

	public String getLanguage() {
		return this.Language;
	}

	public void setGender(String Gender) {
		this.Gender = Gender;
	}

	public String getGender() {
		return this.Gender;
	}
}
