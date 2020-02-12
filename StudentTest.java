import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentTest {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Student> studentList = new ArrayList<Student>();

	public static void play() throws InterruptedException {
		int choose = 0;
		while (true) {
			int id = -1;
			showMenu();
			System.out.print("Enter your selection: ");
			choose = input.nextInt();
			input.nextLine();
			while (choose > 6 && choose < 1) {
				System.out.print("Enter your selection(from 0 to 6): ");
				choose = input.nextInt();
				input.nextLine();
			}
			switch (choose) {
				case 0:
					System.out.println("Goodbye!!!");
					return;
				case 1:
					addStudent();
					break;
				case 2:
					System.out.print("Nhập id sinh viên cần sửa: ");
					id = input.nextInt();
					input.nextLine();
					EditById(id);
					break;
				case 3:
					System.out.print("Nhập id sinh viên cần sửa: ");
					id = input.nextInt();
					input.nextLine();
					DeleteById(id);
					break;
				case 4:
					Collections.sort(studentList, new Comparator<Student>() {
						@Override
						public int compare(Student o1, Student o2) {
							return o1.getGpa() >= o2.getGpa() ? -1 : 1;
						}
					});
					for (int i = 0; i < studentList.size(); i++) {
						studentList.get(i).showInfo();
					}
					break;
				case 5:
					Collections.sort(studentList, new Comparator<Student>() {
						@Override
						public int compare(Student o1, Student o2) {
							int comparator = o1.getName().compareTo(o2.getName());
							if (comparator <= 0) {
								return -1;
							}
							return 1;
						}
					});
					// Show
					for (int i = 0; i < studentList.size(); i++) {
						studentList.get(i).showInfo();
					}
					break;
				case 6:
					displayAllStudent();
					break;
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {
		play();
	}

	static void showMenu() {
		System.out.println("****************************");
		System.out.println("1. Add Student");
		System.out.println("2. Edit student by id");
		System.out.println("3. Delete student by id");
		System.out.println("4. Sort student by gpa");
		System.out.println("5. Sort student by name");
		System.out.println("6. Show student");
		System.out.println("0. Exit");
	}

	public static void addStudent() {
		System.out.println("Nhập thông tin của sinh viên ");
		System.out.print("  >         Name: ");
		String name = input.nextLine();
		System.out.print("  >         Age : ");
		int age = input.nextInt();
		input.nextLine();
		System.out.print("  >      Address: ");
		String address = input.nextLine();
		System.out.print("  >         GPA : ");
		float gpa = input.nextFloat();
		input.nextLine();
		studentList.add(new Student(name, age, address, gpa));
	}

	public static Student findStudent(int id) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId() == id) {
				return studentList.get(i);
			}
		}
		return null;
	}

	public static void EditById(int id) {
		Student student = findStudent(id);
		if (student == null) {
			System.out.println("Không tìm thấy sinh viên");
		} else {
			System.out.println("Nhập thông tin sửa của sinh viên ");
			System.out.print("  >         Name: ");
			String name = input.nextLine();
			student.setName(name);
			System.out.print("  >         Age : ");
			int age = input.nextInt();
			input.nextLine();
			student.setAge(age);
			System.out.print("  >      Address: ");
			String address = input.nextLine();
			student.setAddress(address);
			System.out.print("  >         GPA : ");
			float gpa = input.nextFloat();
			input.nextLine();
			student.setGpa(gpa);
			System.out.println("Sửa thành công!");
		}
	}

	public static void DeleteById(int id) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId() == id) {
				studentList.remove(i);
				System.out.println("Xoá sinh viên thành công");
				return;
			}
		}
		System.out.println("Không tìm thấy sinh viên");
	}
	
	public static void displayAllStudent() {
		if (studentList.size() == 0) {
			System.out.println("Chưa có sinh viên nào để hiển thị");
		}else {
			for (int i = 0; i < studentList.size(); i++) {
				studentList.get(i).showInfo();
				System.out.println();
			}
		}
	}
	
}
