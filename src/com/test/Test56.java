package com.test;

import java.util.Arrays;

public class Test56 {
	
	static int max(int[] data) {
		int max = -999999;
		
		if(data == null || data.length == 0) {
			return max;
		}
		
		max = data[0];
		
		for(int i=1;i<data.length;i++) {
			if(data[i]>max) {
				max=data[i];
			}
				
		}
		
		return max;
	}
	
	
	
	public static void main(String[] args) {
		 
		
			int[] data = {3, 2, 9, 4, 7};
			System.out.println(java.util.Arrays.toString(data));
			System.out.println("최대값:"+max(data));
			System.out.println("최대값:"+max(null));
			System.out.println("최대값:"+max(new int[] {}));
			
		}

	}

