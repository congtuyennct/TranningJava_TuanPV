package main;

public class Student extends Persion {
	private String job;
	
	public Student() {
		super();
	}

	public void showInfoPersion() {
		System.out.println(this.getId());
		System.out.println(this.getName());
		this.sleep(); // this là từ khoá đại diện cho lớp hiện tại
		super.sleep(); // super là từ khoá đại diện cho lớp cha
	}
	
	// xảy ra khi thằng con muốn sửa lại phương thức đã có ở thằng cha
	@Override
	public void work() {
		super.work();
		System.out.println("học tập");
	}
	
	@Override
	public void salary() {
		System.out.println("không có");
	}
}
