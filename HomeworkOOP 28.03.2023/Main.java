package homeworkoop;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("Oleg", "Lotca", Gender.MALE, 1, "first");
		Student student2 = new Student("Maria", "Petrova", Gender.FEMALE, 2, "first");
		Student student3 = new Student("Anton", "Tcaciuc", Gender.MALE, 3, "first");
		Student student4 = new Student("Artem", "Tkachuk", Gender.MALE, 4, "first");
		Student student5 = new Student("Ruslan", "Babaev", Gender.MALE, 5, "first");
		Student student6 = new Student("Svetlana", "Popova", Gender.FEMALE, 6, "first");
		Student student7 = new Student("Anastasia", "Vatamaniuc", Gender.FEMALE, 7, "first");
		Student student8 = new Student("Marc", "Tsoy", Gender.MALE, 8, "first");
		Student student9 = new Student("Taisia", "Kiseeva", Gender.FEMALE, 9, "first");
		Student student10 = new Student("Leonardo", "DiCaprio", Gender.MALE, 10, "first");
		Student student11 = new Student("Peter", "Moryak", Gender.MALE, 11, "first");

		Group group1 = new Group();

		try {
			group1.addStudent(student1);
			group1.addStudent(student2);
			group1.addStudent(student3);
			group1.addStudent(student4);
			group1.addStudent(student5);
			group1.addStudent(student6);
			group1.addStudent(student7);
			group1.addStudent(student8);
			group1.addStudent(student9);
			group1.addStudent(student10);
			// group1.addStudent(student11);
		} catch (GroupOverflowException e) {
			e.printStackTrace();
		}
		System.out.println(group1);

		try {
			System.out.println(group1.searchStudentByLastName("Babaev"));
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();

		System.out.println("The student with the specified id has been deleted: " + group1.removeStudentByID(11));

		System.out.println();

		try {
			group1.addStudent(student11);
		} catch (GroupOverflowException e) {
			e.printStackTrace();
		}
		System.out.println(group1);
	}
}
