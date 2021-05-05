package Entities;

public class User {
	int id;
	String fullName;
	String nationalId;
	String birthYear;
	
	public User(int id, String fullName, String nationalId, String birthYear) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.nationalId = nationalId;
		this.birthYear = birthYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
}
