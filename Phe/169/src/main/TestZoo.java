package main;

import java.util.ArrayList;
import java.util.Scanner;

public class TestZoo {
	static Scanner scanner = new Scanner(System.in);
	
	public static boolean menu(Zoo zoo) {
		int index;
		int tuoi;
		int maChuong;
		int indexAmial;
		String ten;
		String moTa;
		Animal tiger;
		Animal dog;
		Animal cat;
		ArrayList<Chuong> chuongs;
		ArrayList<Animal> aminals;
		
		boolean flag = true;
		
		System.out.println("Menu");
		System.out.println("1. Thêm chuồng");
		System.out.println("2. Xóa chuồng");
		System.out.println("3. Thêm con vật");
		System.out.println("4. Xóa con vật");
		System.out.println("5. Xem tất cả các con vật");
		System.out.println("6. Thoát");
		System.out.print("Ban chon chuc nang: ");
		index = scanner.nextInt();
		scanner.nextLine();
		
		switch (index) {
			case 1:
				// B1. khoi tao ra 1 cai chuong
				Chuong chuong = new Chuong();
				// B2. Nhap thong tin cho chuong
				System.out.print("Nhap ma chuong: ");
				maChuong = scanner.nextInt();
				scanner.nextLine();
				chuong.setMaChuong(maChuong);
				
				zoo.themChuong(chuong);
				break;
			case 2:
				System.out.print("Nhap ma chuong can xoa: ");
				maChuong = scanner.nextInt();
				scanner.nextLine();
				zoo.xoaChuong(maChuong);
				break;
			case 3:
				// Them con vat
				System.out.println("Danh sach cac con vat");
				System.out.println("	1. Tiger");
				System.out.println("	2. Dog");
				System.out.println("	3. Cat");
				System.out.println("Vui long chon con vat muon them: ");
				
				indexAmial = scanner.nextInt();
				scanner.nextLine();
				
				switch (indexAmial) {
					case 1:
						System.out.println("Nhap thong tin cho con Tiger");
						System.out.print("Ten: ");
						ten = scanner.nextLine();
						System.out.print("Tuoi: ");
						tuoi = scanner.nextInt();
						scanner.nextLine();
						System.out.print("Mo ta: ");
						moTa = scanner.nextLine();
						tiger = new Tiger(ten, tuoi, moTa);
		
						System.out.print("Nhap ma chuong can them con vat");
						maChuong = scanner.nextInt();
						
						// them con vat vao chuong theo ma chuong
						chuongs = zoo.getChuongs();
						if (chuongs != null) {
							for (Chuong item : chuongs) {
								if (item.getMaChuong() == maChuong) {
									aminals = item.getAminals();
									if (aminals == null) {
										aminals = new ArrayList<>();
									}
									aminals.add(tiger);
									item.setAminals(aminals);
								}
							}
						} else {
							// rut gon vi hieu la da co chuong roi
						}
						break;
					case 2:
						System.out.println("Nhap thong tin cho con Dog");
						System.out.print("Ten: ");
						ten = scanner.nextLine();
						System.out.print("\nTuoi: ");
						tuoi = scanner.nextInt();
						scanner.nextLine();
						System.out.print("\nMo ta: ");
						moTa = scanner.nextLine();
						dog = new Dog(ten, tuoi, moTa);
		
						System.out.print("Nhap ma chuong can them con vat");
						maChuong = scanner.nextInt();
						// them con vat vao chuong theo ma chuong
						chuongs = zoo.getChuongs();
						if (chuongs != null) {
							for (Chuong item : chuongs) {
								if (item.getMaChuong() == maChuong) {
									aminals = item.getAminals();
									if (aminals == null) {
										aminals = new ArrayList<>();
									}
									aminals.add(dog);
									item.setAminals(aminals);
								}
							}
						} else {
							// rut gon vi hieu la da co chuong roi
						}
						break;
					case 3:
						System.out.println("Nhap thong tin cho con Cat");
						System.out.print("Ten: ");
						ten = scanner.nextLine();
						System.out.print("\nTuoi: ");
						tuoi = scanner.nextInt();
						scanner.nextLine();
						System.out.print("\nMo ta: ");
						moTa = scanner.nextLine();
						cat = new Cat(ten, tuoi, moTa);
		
						System.out.print("Nhap ma chuong can them con vat");
						maChuong = scanner.nextInt();
						// them con vat vao chuong theo ma chuong
						chuongs = zoo.getChuongs();
						if (chuongs != null) {
							for (Chuong item : chuongs) {
								if (item.getMaChuong() == maChuong) {
									aminals = item.getAminals();
									if (aminals == null) {
										aminals = new ArrayList<>();
									}
									aminals.add(cat);
									item.setAminals(aminals);
								}
							}
						} else {
							// rut gon vi hieu la da co chuong roi
						}
						break;
					default:
						System.err.println("Ban chon sai");
						break;
					}
				break;
			case 4:
				System.out.println("Nhap ten con vat can xoa: ");
				ten = scanner.nextLine();
				chuongs = zoo.getChuongs();
				if (chuongs != null) {
					for (Chuong chuong1 : chuongs) {
						aminals = chuong1.getAminals();
						if (aminals != null) {
							for (int i = 0; i < aminals.size(); i++) {
								if (aminals.get(i).getTen().equals(ten)) {
									aminals.remove(i);
								}
							}
						}
					}
				}
				break;
			case 5:
				chuongs = zoo.getChuongs();
				index = 0;
				if (chuongs != null) {
					for (Chuong chuong1 : chuongs) {
						aminals = chuong1.getAminals();
						System.out.println("Ma chuong : " + chuong1.getMaChuong());
						System.out.println("	Danh sach cac con vat trong chuong");
						for (int i = 0; i < aminals.size(); i++) {
							index++;
							System.out.print("		Con vat " + index + " : ");
							aminals.get(i).xemThongTin();
							aminals.get(i).tiengKeu();
							System.out.println();
						}
					}
				}
				break;
			case 6:
				flag = false;
				System.err.println("End");
				break;
			default:
				System.out.println("Vui long chon lai");
				break;
		}
		return flag;
	}

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		while (menu(zoo)) {
		}
	}
}
