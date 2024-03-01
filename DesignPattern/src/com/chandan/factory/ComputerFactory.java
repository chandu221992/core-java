package com.chandan.factory;

public class ComputerFactory {
	
	private Computer comp;
	
	public Computer getInstance(String type) {
		
		if(type.equals("Desktop")) {
			comp=new Desktop();
		}else {
			comp=new Laptop();
		}
		return comp;
			
	}

}
