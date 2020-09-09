package com.test;

public class Test57 {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true ;
		ctv.displayCaption("Hello, World");

	}
}

class CaptionTv extends Tv1{
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

class Tv1 {
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}
