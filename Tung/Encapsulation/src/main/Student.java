package main;

public class Student {
	// ten, tuoi, mau sac, kich thuoc
	private String ten;
	private int tuoi;
	private int money;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public String getCustomMoney() {
		// abcx
		return "100,000 d";
	}
}
