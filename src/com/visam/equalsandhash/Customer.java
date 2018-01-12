package com.visam.equalsandhash;

public class Customer {

	private float transamnt;
	private String name;
	private boolean b;

	public float getTransamnt() {
		return transamnt;
	}

	public void setTransamnt(float transamnt) {
		this.transamnt = transamnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPreviousHistory(boolean b) {
		this.b = b;
	}

	public boolean getPreviousHistory() {
		return b;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Customer)) {
			return false;
		}
		if (name != ((Customer) obj).getName()) {
			return false;
		}
		if (transamnt != ((Customer) obj).getTransamnt()) {
			return false;
		}
		if (b != ((Customer) obj).getPreviousHistory()) {
			return false;
		}
		return true;

	}

	@Override
	public int hashCode() {
		int result;
		result = Boolean.hashCode(b);

		int res1;
		res1 = Float.hashCode(transamnt);

		int res2;
		res2 = (name == null ? 0 : name.hashCode());
		// int res3;
		// res3 = Integer.hashCode(i)

		return result + res1 + res2;
	}

	public static void main(String args[]) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();

		c1.setName("niha");
		c2.setName("niha");
		c1.setPreviousHistory(false);
		c2.setPreviousHistory(false);
		c1.setTransamnt(20);
		c2.setTransamnt(20);
		if (c1.equals(c2)) {
			System.out.println("objects are equal");
		} else
			System.out.println("objects are not equal");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}

}