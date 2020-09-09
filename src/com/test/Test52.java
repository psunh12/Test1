package com.test;

public class Test52 {
	static int[] arr =new int[10];
	
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10)+1;
		}
	}
	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++)
			System.out.println("arr["+i+"] :"+arr[i]);
			

	}

}
