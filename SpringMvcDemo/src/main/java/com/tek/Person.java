package com.tek;

public class Person {

	private String name;
	private String id;
	private String city;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setcity(String city) {
		this.city = city;

	}
	public String getcity()
	{
		return city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	
}
