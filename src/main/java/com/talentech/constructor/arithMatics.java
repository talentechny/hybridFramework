package com.talentech.constructor;

public class arithMatics {
	
	private int x = 3;
	private int y = 5;
	
	
	//default constructor
	public arithMatics(){
		
		System.out.println("I am a default constructor");
		
	}//default constructor
	
	
	//parameterized constructor
	public arithMatics(int a, int b){
		x = a;
		y = b;
		
	}
	
	public void add(){
		int sum = x+y;
		System.out.println("The Sum is: "+ sum);

	}

}
