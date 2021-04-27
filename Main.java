package com.myproject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop laptop1= new Laptop(8, 64);
		System.out.println("CPU:" + laptop1.getCPU() + " " + "RAM:" +  laptop1.getRAM());
		laptop1.Hibernate();
		
		

	}

}
