package main;

import java.util.ArrayList;

public class Chuong {
	private int maChuong;
	private ArrayList<Animal> aminals;
	
	// nhiem vu chi la them con vat vao chuong con viec khoi tao con vat ra sao thi ko phai nhiem vu cua no
	public void themConVat(Animal animal) {
		// Mang aminals chua duoc khoi tao
		if(aminals == null) {
			this.aminals = new ArrayList<>();
			this.aminals.add(animal);
		}
		
		// Mang da duoc khoi tao
		else {
			this.aminals.add(animal);
		}
	}
	
	public void xoaConVat(String ten) {
		if(aminals != null) {
			for(int i = 0; i < aminals.size(); i++) {
				if(aminals.get(i).getTen().equals("ten")) {
					aminals.remove(i);
				}
			}
		}
	}
	
	public int getMaChuong() {
		return maChuong;
	}
	public void setMaChuong(int maChuong) {
		this.maChuong = maChuong;
	}
	public ArrayList<Animal> getAminals() {
		return aminals;
	}
	public void setAminals(ArrayList<Animal> aminals) {
		this.aminals = aminals;
	}
}
