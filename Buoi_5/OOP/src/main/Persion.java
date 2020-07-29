package main;

public class Persion {
	// chứa những thông tin chung của lớp người
	private String id;
	private String name;
	
//	public Persion(String id) {
//		
//	}
	
	public Persion() {
		
	}
	
	// phương thức ngủ
	public void sleep() {
		System.out.println("ngủ");
	}
	
	public void work() {
		
	}
	
	public void salary() {
		System.out.println("có lương");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
