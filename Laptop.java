package com.myproject;

public class Laptop extends Computer implements Portable {
	
	public Laptop(int cPU, int rAM) {
		super();
		CPU = cPU;
		RAM = rAM;
	}

	private int CPU;
	private int RAM;

	public int getCPU() {
		return CPU;
	}

	public void setCPU(int cPU) {
		CPU = cPU;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	@Override
	public void Hibernate() {
		
	}
	
	public void charge() {
		
	}

}
