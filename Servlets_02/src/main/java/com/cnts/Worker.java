package com.cnts;

public class Worker {
	private int id;
	private String name;
	private String caste;
	
	
	public Worker(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Worker(int id, String name, String caste) {
		super();
		this.id = id;
		this.name = name;
		this.caste = caste;
	}

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", caste=" + caste + "]";
	}

}
