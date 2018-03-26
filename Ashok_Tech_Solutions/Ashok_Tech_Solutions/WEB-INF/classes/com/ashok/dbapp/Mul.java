package com.ashok.dbapp;

public class Mul {

	public int multiplication(int x, int y) {
		int t=x;
		while(y!=1) {
			x=x+t;
			y--;
			
		}
		return x;
		
	}
	public static void main(String[] args) {
		
		Mul m=new Mul();
		
	System.out.println(m.multiplication(5, 10));	

	}

}
