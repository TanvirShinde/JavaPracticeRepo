package basicPrograms;
class Employee{

	String empName="Ajay";
	int empAge=28;
	int empSalary=35000;

	void printEmployeeDetails(){
		System.out.println("Employee Name is = " +empName);
		System.out.println("Employee Age is = " +empAge);
		System.out.println("Salary is = " +empSalary);
	}

	public static void main(String[] args){
		Employee emp=new Employee();
		emp.printEmployeeDetails();
	}
}

/*
OUTPUT
Employee Name is = Ajay
Employee Age is = 28
Salary is = 35000
*/