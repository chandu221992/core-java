package com.chandan.factory;

public class Runner {

	public static void main(String[] args) {
		ComputerFactory cf = new ComputerFactory();
		cf.getInstance("Laptop").compute();
	}
}
