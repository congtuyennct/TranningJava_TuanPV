package inheritance2;

public class Student extends Persion{
	private int a;
	// ghi dè lại phương thức làm việc 
	// tương ứng vs đối tượng sinh viên
	
	// vì ở thằng con đã ghi đè lại phương thức work lên nó sẽ ko gọi đến phương thức work của thằng cha nữa
	@Override
	public void work() {
		System.out.println("học tập");
		
	}
	
	@Override
	public void sleep() {
		System.out.println("học sinh ngủ");
	}
	
	// vì thằng học sinh ko có lương lên ta ko cần ghi đè lại phương salary
	
	
	public void test(int b) {
		b = a;
		super.getId();
		this.getId();
	}
}
