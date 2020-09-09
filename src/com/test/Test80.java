package com.test;

public class Test80 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1�� v2�� �����ϴ�.");
		else
			System.out.println("v1�� v2�� �ٸ��ϴ�.");

	}

}

class Value{
	int value;
	
	Value(int value) {
		this.value = value;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Value)
			return value == ((Value)obj).value;
		else
			return false;
	}
	
	
}