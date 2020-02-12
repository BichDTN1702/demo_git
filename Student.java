
public class Student {
	static int autoincrementID = 0;
	private int id;
	private String name;
	private int age;
	private String address;
	private float gpa;

	public Student(String name, int age, String address, float gpa) {
		this.id = autoincrementID;
		autoincrementID++;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public void showInfo() {
		System.out.println("----------Student Info----------");
		System.out.println("Student ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		System.out.println("GPA: " + gpa);
		System.out.println("-------------------------------");
	}

}
