package day2;
class Employee implements EmployeeInterface{
	public int salary = 30000;
	private int bonus = 2000;

	public void totalsalary() {
		int total = salary + bonus;
		System.out.println("total=" + total);
	}
	

	public void tasks(String t1, String t2) {
		System.out.println("My task is to: " + t1 + " and " + t2);
	}

	public void tasks(String t1) {
		System.out.println("My task is to: " + t1);
	}
}

public class Developer extends Employee {
	public void totalsalary() {
		// int total=salary+bonus;
		int total = salary;
		System.out.println("total=" + total);
	}
	public void MyId() {
		int id1=123;
		System.out.println("My Employee ID is:" + id1);
	}

	public static void main(String[] args) {
		Developer de = new Developer();
		de.totalsalary();
		de.tasks("debug", "deploy");
		de.MyId();
	}

}
