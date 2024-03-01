package com.chandan.composite;

public class Runner {

	public static void main(String[] args) {
		ComputerPart hd=new Leaf("Hard Disk", 100);
		ComputerPart ram=new Leaf("RAM", 200);
		ComputerPart cpu=new Leaf("CPU", 300);
		ComputerPart mouse=new Leaf("MOUSE", 400);
		ComputerPart keyboard=new Leaf("Key Board", 500);
		
		Composite cabinet=new Composite("Cabinet");
		Composite mb=new Composite("Mother Board");
		Composite ph=new Composite("PeriPheral Devices");
		Composite computer=new Composite("Computer");
		mb.addComputerPart(ram);
		mb.addComputerPart(cpu);
		cabinet.addComputerPart(hd);
		cabinet.addComputerPart(mb);
		ph.addComputerPart(mouse);
		ph.addComputerPart(keyboard);
		computer.addComputerPart(cabinet);
		computer.addComputerPart(ph);
		
		computer.show();

	}

}
