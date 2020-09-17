package main;

public class Cat extends Animal {

	public Cat() {
		super();
	}

	public Cat(String ten, int tuoi, String moTa) {
		super(ten, tuoi, moTa);
	}

	public Cat(String ten, int tuoi) {
		super(ten, tuoi);
	}

	public Cat(String ten) {
		super(ten);
	}

	@Override
	public void tiengKeu() {
		System.out.println("meo meo");
	}
}
