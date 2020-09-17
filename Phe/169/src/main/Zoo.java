package main;

import java.util.ArrayList;

public class Zoo {
	private ArrayList<Chuong> chuongs;

	public void themChuong(Chuong chuong) {
		// Mang chuongs chua duoc khoi tao
		if (chuongs == null) {
			this.chuongs = new ArrayList<>();
			this.chuongs.add(chuong);
		}
		// Mang da duoc khoi tao
		else {
			this.chuongs.add(chuong);
		}
	}

	public void xoaChuong(int maChuong) {
		if (chuongs != null) {
			for (int i = 0; i < chuongs.size(); i++) {
				if (chuongs.get(i).getMaChuong() == maChuong) {
					chuongs.remove(i);
				}
			}
		}
	}

	public ArrayList<Chuong> getChuongs() {
		return chuongs;
	}

	public void setChuongs(ArrayList<Chuong> chuongs) {
		this.chuongs = chuongs;
	}
}
