package com.talentech.oop1;

public class arithmaticOOP {
	
	//four types of access modifier
	//1. private - accessible only within the class
	//2. protected - accessible within class, within a package, and outside of package if inherited
	//3. public - accessible from any program
	//4. default - accessible within class, and within package
	
	protected int sum;
	protected int sub;
	private int mul, div;
	
	
	int add(int x, int y){
		sum = x+y;
		return sum;
	}//end of add
	
	protected int sub(int x, int y){
		sub = x-y;
		return sub;
	}
	
	protected int mul(int x, int y){
		mul = x*y;
		return mul;
	}
	
	public int div(int x, int y){
		div = x/y;
		return div;
	}

}//end of class
