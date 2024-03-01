package com.chandan.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

	private String title;
	private List<Subscriber> subs = new ArrayList<>();

	public String getTitle() {
		return title;
	}

	public List<Subscriber> getSubs() {
		return subs;
	}

	public void addSubscriber(Subscriber s) {
		subs.add(s);
	}

	public void removeSubscriber(Subscriber s) {
		subs.remove(s);
	}

	public void uploaded(String title) {
		this.title = title;
		notifySubscribers();
	}

	private void notifySubscribers() {
		for (Subscriber subscriber : subs) {
			subscriber.update();
		}

	}

}
