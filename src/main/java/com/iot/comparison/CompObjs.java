package com.iot.comparison;

/*Comparable Interface: if used , we should implement compareTo method
 * 
 * When used collections.sort, we should compare with only one instance variable
 * 
 * to overcome this limitation , we use comparator.
 * 
 * For comparing objects we use comparable & comparators.
 * 
 * H.W: write similar kind of example
 */




public class CompObjs implements Comparable<CompObjs> {

	String name;
	String address;
	int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public CompObjs(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public int compareTo(CompObjs o) {
		
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return this.name + ", " + this.age;
	}

}
