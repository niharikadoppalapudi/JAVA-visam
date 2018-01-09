package com.vism;

public class Data {

	private String name;
	private Integer age;

	public Data() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
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
		Data other = (Data) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Data [age=" + age + "]";
	}

	/*
	 * @Override public int compareTo(Object arg0) {
	 * 
	 * Data d = (Data)arg0;
	 * 
	 * if(d.getAge() > age){ return 1; }else if (d.getAge() == age) { return 0;
	 * }else{ return -1; } }
	 */
	
	

}
