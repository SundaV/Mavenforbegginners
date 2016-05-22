package org.treeser;

public class Info {
	private String name;
	private int sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	Info(String t ,int s){
		
		name=t;
		sal=s;
		
		
	}
	@Override
	public String toString() {
		return "Info [name=" + name + ", sal=" + sal + "]";
	}
	
	
	

}
