
public class Student {
	
	
	int id;
	String name;
	String college;
	float fee;
	int marks;
	
	public Student() {
	
	}

	public Student(int id, String name, String college, float fee, int marks) {
		this.id = id;
		this.name = name;
		this.college = college;
		this.fee = fee;
		this.marks = marks;
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

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", fee=" + fee + ", marks=" + marks
				+ "]";
	}

	
	
	
	
	

}
