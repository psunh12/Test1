package com.test;

public class Test42 {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ä���� " + t.channel + "�Դϴ�.");
		
	}
}

class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelup() { ++channel; }
	
	void channelDown() { 
		--channel; 
	}
}