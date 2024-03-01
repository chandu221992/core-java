package com.chandan.adapter;

public class PenAdaptor implements Pen {
	
	PilotPen pp=new PilotPen();

	@Override
	public void write(String str) {
		pp.write(str);		
	}
	
	

}
