package com.del;

import java.util.Scanner;

public class MainClass {

	public MainClass() {
		Scanner sc = new Scanner(System.in);

		int c = 0;
		System.out.println("enter operation ");
		System.out.println("1.add 2.sub 3.mul 4.div");
		c = sc.nextInt();

		Arthimetic[] arth = { new Addition(0, 0, 0), new Subtraction(0, 0, 0), new Multiply(0, 0, 0),
				new Division(0, 0, 0) };

		arth[c - 1].read();
		
		try {
			arth[c - 1].calculate();
			arth[c - 1].display();
		}
		catch(ArithmeticException e){
			System.out.println("cannot divide by zero");
			
		}
		finally {
			sc.close();
		}

	}

	public static void main(String[] args) {

		new MainClass();

	}

}
