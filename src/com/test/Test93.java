package com.test;
import java.util.*;

class Product1 {}
class Tv8 extends Product1{}
class Audio3 extends Product1 {}

public class Test93 {

	public static void main(String[] args) {
		ArrayList<Product1> productList = new ArrayList<Product1>();
		ArrayList<Tv8> tvList =new ArrayList<Tv8>();
		
		productList.add(new Tv8());
		productList.add(new Audio3());
		
		tvList.add(new Tv8());
		tvList.add(new Tv8());
		
		printAll(productList);
		

	}
	public static void printAll(ArrayList<Product1> list) {
		for (Product1 p : list)
			System.out.println(p);
	}

}
