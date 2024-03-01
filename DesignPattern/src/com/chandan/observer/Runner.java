package com.chandan.observer;

public class Runner {

	public static void main(String[] args) {
		Subscriber s1=new Subscriber("Chandan");
		Subscriber s2=new Subscriber("Kumar");
		Subscriber s3=new Subscriber("Panjiyar");
		Subscriber s4=new Subscriber("Ramesh");
		
		
		Channel ch=new Channel();
		ch.addSubscriber(s1);
		ch.addSubscriber(s2);
		ch.addSubscriber(s3);
		ch.addSubscriber(s4);
		
		s1.setChannel(ch);
		s2.setChannel(ch);
		s3.setChannel(ch);
		s4.setChannel(ch);
		
		ch.uploaded("New Video ");

	}

}
