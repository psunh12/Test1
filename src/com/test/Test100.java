package com.test;
import java.io.*;

public class Test100 {
	
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream(args[0]);
		
		int data=0;
		
		while((data=fis.read())!=-1) {
			char c =(char)data;
			System.out.print(c);
		}
	}
		
}