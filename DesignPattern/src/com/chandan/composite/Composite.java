package com.chandan.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements ComputerPart {
	private String name;

	public Composite(String name) {
		super();
		this.name = name;
	}

	List<ComputerPart> components = new ArrayList<>();

	public void addComputerPart(ComputerPart comp) {
		components.add(comp);
	}

	@Override
	public void show() {
		System.out.println(name);
		for (ComputerPart computerPart : components) {
			computerPart.show();
		}

	}

}
