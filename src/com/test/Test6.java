package com.test;

public class Test6 {

	public static void main(String[] args) {
		int x=10, y=5;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		int tmp222 = x;
		x=y;
		y=tmp222;
		System.out.println("x="+x);
		System.out.println("y="+y);

	}

}
