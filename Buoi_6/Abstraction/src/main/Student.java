package main;

public class Student implements IPersion, IMy{

	@Override
	public void sleep() {
		System.out.println("xử lý");
	}

	@Override
	public void work() {
		System.out.println();
	}

}
