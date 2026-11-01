// Josiah B. Quiñones
// BSIT - 2B
// October 21, 2026

public class Employee{
	private String name;
	private String employeeId;
	private String department;
	private double monthlySalary;

	public Employee(String name, String employeeId, String department, double monthlySalary){
		this.name = name;
		this.employeeId = employeeId;
		this.department = department;
		setMonthlySalary(monthlySalary);
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setEmployeeId(String employeeId){
		this.employeeId = employeeId;
	}

	public String getEmployeeId(){
		return employeeId;
	}

	public void setDepartment(String department){
		this.department = department;
	}

	public String getDepartment(){
		return department;
	}

	public void setMonthlySalary(double monthlySalary){
		if(monthlySalary > 0){
			this.monthlySalary = monthlySalary;
		}else{
			System.out.println("Monthly salary must be greater than zero.");
		}
	}

	public void displayInfo(){
		System.out.println("\nName: " + name);
		System.out.println("ID: " + employeeId);
		System.out.println("Department: " + department);
		System.out.println("Monthly Salary: " + monthlySalary);
	}
}