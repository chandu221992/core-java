package com.chandan.factory;

public class Desktop implements Computer {

	@Override
	public void compute() {
		System.out.println(this.getClass().getName() +" is computing");
		
	}

}
