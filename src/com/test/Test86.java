package com.test;

public class Test86 {

	public static void main(String[] args) {
		SutdaCard1 c1 = new SutdaCard1(3, true);
		SutdaCard1 c2 = new SutdaCard1(3, true);
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c1.equals(c2):"+c1.equals(c2));

	}

}

class SutdaCard1 {
	int num;
	boolean isKwang;
	
	SutdaCard1(){
		this(1,true);
	}
	
	SutdaCard1(int num, boolean isKwang){
		this.num = num;
		this.isKwang= isKwang;
	}
	
	public boolean equals(Object obj) {
	if (obj instanceof SutdaCard1) 
		return num == ((SutdaCard1)obj).num & isKwang == ((SutdaCard1)obj).isKwang ;
	else
		return false;

	}
	
	

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
