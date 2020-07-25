package inheritance2;

public class Main {
	public static void main(String[] args) {
		
		Persion p = new Persion();
		p.setId("1");
		
		Student student = new Student();
		student.sleep();
		student.work();
	}
}
