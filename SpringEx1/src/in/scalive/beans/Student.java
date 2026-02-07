package in.scalive.beans;

public class Student {
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		System.out.println("Setter of setRoll_no is called...");
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter of setName is called...");
		this.name = name;
	}

	public Student() {
		System.out.println("Constructor is called");
	}

	private int roll_no;
	private String name;

}
