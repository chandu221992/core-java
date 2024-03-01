package com.chandan.builder;

public class Runner {

	public static void main(String[] args) {
		Phone phone=new PhoneBuilder().setOs("Android").setProcessor("intel").setRam(2).build();
		System.out.println(phone);

	}

}
