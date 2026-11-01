// Josiah B. Quiñones
// BSIT - 2B
// October 21, 2026

public class Main{
	public static void main(String[] args) {
		Employee emp1 = new Employee("Juan Dela Cruz", "EMP001", "IT", 25000);
		Employee emp2 = new Employee("Maria Lopez", "EMP002", "HR", 22000);

		Manager emp3 = new Manager("Carlo Mendoza", "EMP003", "IT", 45000, 8);

		System.out.println("\n===== EMPLOYEE INFORMATION =====");
		emp1.displayInfo();
		emp2.displayInfo();

		System.out.println("\n===== MANAGER INFORMATION =====");
		emp3.displayInfo();

		System.out.println("\n===== UPDATE INFORMATION =====");
		emp2.setMonthlySalary(24000);

		emp2.displayInfo();
	}
}

// 1. Why should monthlySalary be private, and what does the setter protect against?
// - monthlySalary should be private to protect it from direct access.
//   The setter prevents negative salaries.

// 2. Is a Manager also an Employee? Explain using the word extends.
// - Yes, a Manager is also an Employee because Manager extends Employee.
//   It inherits the properties and methods of Employee.

// 3. What is the advantage of calling super.displayInfo() inside Manager's displayInfo()?
// - super.displayInfo() calls the Employee's displayInfo() method,
//    avoiding repeated code and displaying inherited information.