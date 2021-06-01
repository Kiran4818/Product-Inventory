package com.learn.javacourse;




import java.util.Vector;

public class Main {
	public static void main(String[] args) {


		Vector<Integer> vec = new Vector<Integer>(100);

		vec.add(5);
		vec.add(7);
		vec.add(9);
		vec.add(6);
		vec.add(11);
		vec.add(88);
		vec.add(77);


		vec.remove(1);
		vec.remove(0);
		

		System.out.println("Values in vector after added & removed: " + vec);


	}
}















