package com.test;

class Product2 {
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}

}

class Tv4 extends Product2 {
	Tv4 () { super(100);}
		
	public String toString() { return "Tv";}
}

class Computer2 extends Product2 {
	Computer2 () {super(200);}
	
	public String toString() {return "Computer";}
}

class Audio2 extends Product2 {
	Audio2 () {super(50);}
	
	public String toString() {return "Audio";}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10];
	int i = 0;
	
	void buy(Product2 p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
	
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
	
	void summary() {
		int sum = 0;
		String itemList ="";
		
		for(int i=0;i<cart.length;i++) {
			if(cart[i]==null)break;
			sum += cart[i].price;
			itemList += cart[i] +", ";
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� "+sum+"�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
	}
}
	



public class Test63 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv4());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();

	}

}
