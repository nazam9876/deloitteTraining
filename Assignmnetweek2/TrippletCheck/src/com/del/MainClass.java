package com.del;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int n,i;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the length of array");
		n=scan.nextInt();
		int []arr1=new int[n];
		for(i=0;i<=n;i++)
		{
			System.out.println("enter a no:");
			arr1[i]=scan.nextInt();		}
		
		
	}

}
