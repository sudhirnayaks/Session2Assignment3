package com.session2;

import java.util.Scanner;

public class S2A3 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter three Numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1>= num2 && num1>=num3){
			System.out.println("Largest among three numbers is "+num1);		
		}
		if(num2>=num1 && num2>=num3){
			System.out.println("Largest among three numbers is "+num2);	
		}
		if(num3>=num1 && num3>=num2){
			System.out.println("Largest among three numbers is "+num3);
		}

	}
}
