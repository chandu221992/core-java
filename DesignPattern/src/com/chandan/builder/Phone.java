package com.chandan.builder;

public class Phone {
	
	private String os;
	private int ram;
	private String processor;
	private double size;
	private int battery;
	
	public Phone(String os, int ram, String processor, double size, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.size = size;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", size=" + size + ", battery="
				+ battery + "]";
	}
	
	
	

}
