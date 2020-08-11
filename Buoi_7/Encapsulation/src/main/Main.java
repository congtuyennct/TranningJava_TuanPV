package main;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.setMasv(1);
		student.setEmail("test@");

		System.out.println(student.getMasv());
		System.out.println(student.getEmail());
	}

}
