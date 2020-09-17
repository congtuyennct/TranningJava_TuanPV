package main;

public class Dog extends Animal {

	public Dog() {
		super();
	}

	public Dog(String ten, int tuoi, String moTa) {
		super(ten, tuoi, moTa);
	}

	public Dog(String ten, int tuoi) {
		super(ten, tuoi);
	}

	public Dog(String ten) {
		super(ten);
	}

	@Override
	public void tiengKeu() {
		System.out.println("gâu");
	}

}
