// Josiah B. Quiñones 
// BSIT - 2B
// October 20, 2026

public class Main{
	public static void main(String[] args) {
		Student student1 = new Student("Ana Cruz", "STU001", "BSIT", 2);
		Student student2 = new Student("Mark Reyes", "STU002", "BSCS", 1);

		CollegeStudent student3 = new CollegeStudent("Lea Santos", "STU003", "BSIT", 3, "Full Scholar");

		System.out.println("===== STUDENT INFORMATION =====");
		student1.displayInfo();
		student2.displayInfo();

		System.out.println("\n===== COLLEGE INFORMATION =====");
		student3.displayInfo();

		System.out.println("\n===== UPDATE INFORMATION =====");
		student1.setYearLevel(4);
		
		student1.displayInfo();
	}
}


// Reflection Questions
//1. Why should the attributes of Student be private instead of public?
//- Student attributes should be private to protect the data and allow to access only to getters and setters.

//2. What would happen if CollegeStudent did not call super(...) in its constructor?
//-If the CollegeStudent class did not call super, the parent constructor will not receive the required values, 
// and the program would cause a compilation error.

//3. What is the benefit of overriding displayInfo() instead of writing a new method with a different name?
//- Overriding displayInfo() allows CollegeStudent class to reuse the parent's method and add its own information,
// such as scholarship status.