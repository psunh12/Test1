package com.test;

public class Test54 {

	public static void main(String[] args) {
		Student2 s =new Student2();
		s.name ="ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸�:"+s.name);
		System.out.println("����:"+s.getTotal());
		System.out.println("���:"+String.format("%.1f", s.getAverage()));

	}
}

class Student2{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	static int total;
	static float avg;
	
	Student2(){}
	
	Student2(String name, int ban, int no, int kor, int eng, int math,int total, float avg){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total=total; 
	}
	
	int getTotal() {
		total = kor+eng+math; 
		return total;
	}
	
	float getAverage() {
		float avg = total/(float)3;
		return avg;
		
	}
	
}
