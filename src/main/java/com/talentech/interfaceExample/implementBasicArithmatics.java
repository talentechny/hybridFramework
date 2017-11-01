package com.talentech.interfaceExample;

public class implementBasicArithmatics implements basicArithmatics {

	@Override
	public void add(int a, int b) {
		System.out.println("This method is for addition");
		
	}

	@Override
	public void sub() {
		System.out.println("This method is for subtraction");
		
	}

	@Override
	public void mul() {
		System.out.println("This method is for multiplication");
		
	}

	@Override
	public void div() {
		System.out.println("This method is for division");
		
	}

	@Override
	public void add(int a, int b, int c) {
		// TODO Auto-generated method stub
		
	}
	
	public void sqRoot(){
		System.out.println("This method is for sqaure root");
	}
	

}
