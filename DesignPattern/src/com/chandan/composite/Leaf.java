package com.chandan.composite;

public class Leaf implements ComputerPart{
	
	private String name;
	private int price;
	
	public Leaf(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public void show() {
		System.out.println(name+" : "+price);
		
	}

}
