package main;

public abstract class Persion {
	private int id;
	private String name;

	// chỉ cần viết ra tên các phương thức cốt lõi mà ko cần viết logic xử lý code
	abstract void sleep();
	
	public void work() {
		System.out.println("công việc");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
