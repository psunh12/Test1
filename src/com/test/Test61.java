package com.test;

public class Test61 {

	public static void main(String[] args) {
		Car3 car =null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		car.stop();
		fe2 = (FireEngine)car;
		fe2.water();

	}

}

class Car3 {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car3 {
	void water() {
		System.out.println("water!!!");
	}
}
