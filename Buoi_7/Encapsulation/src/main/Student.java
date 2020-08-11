package main;

public class Student {
	private int masv;
	private String email;

	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv + 10;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email + " tuan";
	}
}
