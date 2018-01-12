package com.visam.collectionsconcepts;

public class Student implements Comparable<Student> {
private int id;
private int age;
private String name;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (age != other.age)
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

/*public int compareTo(Student arg0) {
Student s=(Student)arg0;
if(s.getAge()==age)
	return 0;
else if(s.getAge()>age)
	return 1;
else return -1;
}*/
@Override
public int compareTo(Student st) {
	Student s=(Student)st;
	if(s.getAge()==age)
		return 0;
	else if(s.getAge()<age)
		return 1;
	else return -1;
}
@Override
public String toString() {
	return "Student [age=" + age + "]";
}

}
