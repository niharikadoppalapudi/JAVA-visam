package com.visam.cloning;

class Employee implements Cloneable {
	private int id;
	private String name;
	private int salary;

	private Person person;

	public Employee(int id, String name, int salary, Person p) {
		this.person = p;
		this.id = id;
		this.name = name;
		this.salary = salary;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		if (id != ((Employee) obj).getId()) {
			return false;
		} else
			return true;
	}

	@Override

	public int hashCode() {
		int res;
		res = Integer.valueOf(id).hashCode();
		return res;
	}
}

public class Clone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person();
		p.setGender("Female");
		Employee originalobj = new Employee(836, "Niha", 4000, p);

		Employee cloneobj = (Employee) originalobj.clone();

		cloneobj.setName("Niha1");
		cloneobj.getPerson().setGender("male");

		System.out.println(
				
				"Original object values" + originalobj.getName() + "Gender" + originalobj.getPerson().getGender());

		/*
		 * System.out.println(cloneobj.name); System.out.println(originalobj.getClass()
		 * == cloneobj.getClass()); System.out.println(originalobj == cloneobj);
		 * originalobj.setId1(100);
		 * 
		 * System.out.println(originalobj.getId1()); cloneobj.setId1(200);
		 * System.out.println(originalobj.getId1());
		 * 
		 * System.out.println(originalobj.equals(cloneobj));
		 * System.out.println(originalobj.hashCode());
		 * System.out.println(cloneobj.hashCode());
		 */}

}
