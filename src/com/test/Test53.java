package com.test;

public class Test53 {

	public static void main(String[] args) {
		Student s = new Student("ȫ�浿",1,1,100,60,76);
		int a=3;
		String str =s.info(a);
		System.out.println(str);

	}

}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info(int b) {
		int sum = kor + eng + math;
		float avg = sum / (float)3;
		
		String ft = name+","+ban+","+no+","+kor+","+eng+","+math+","+sum+","+String.format("%.1f", avg)+",    "+b;
		return ft;
	}
	
	
	
	
}
