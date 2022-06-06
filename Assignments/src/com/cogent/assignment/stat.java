package com.cogent.assignment;

public class stat {
	
	int i = 10;
	static int j = 100;

	public static void main(String[] args) {
		System.out.println(j);
		stat s = new stat();
		System.out.println(s.i);
		//System.out.println(i);
		new stat().test();
	}
	void test() {
		System.out.println("Im a test");
	}			

}
