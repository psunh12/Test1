package com.test;

import java.util.Arrays;

public class Test33 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {100,95,80,70,60};
		char[] chArr = {'a','b','c','d'};
		
		for (int i=0; i < iArr1.length ; i++) {
			iArr1[i]=i+1;
		}
		for (int i=0; i < iArr2.length ; i++) {
			iArr2[i]=(int)(Math.random()*10)+1;
		}
		
		for(int i=0; i<iArr1.length;i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
		
		System.out.println();
		System.out.println();
		
		
		int[] math = new int[3];
		math[0] = 30;
		math[1] = 50;
		math[2] = 100;
		
		for (int i=0; i<math.length; i++) {
			System.out.println(math[i]);
		}
		
		String[] student = new String[5];
		student[0] = "홍길동";
		student[1] = "고길동";
		student[2] = "둘리";
		student[3] = "박세리";
		student[4] = "박찬호";
		
		for (int i=0; i<student.length; i++) {
			System.out.println(student[i]);
		}
				
		System.out.println();
		System.out.println("------------------------");
		
		
		int math1 = 30;
		int math2 = 50;
		int math3 = 100;
		
		System.out.println(math1);
		System.out.println(math2);
		System.out.println(math3);
	}
}
