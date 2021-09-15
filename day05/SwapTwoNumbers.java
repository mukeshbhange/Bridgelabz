package com.fellowship.day05;
import java.util.*;

public class SwapTwoNumbers {
	public static void swapTwoNumbers(int a,int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swap : ");
		System.out.println("Number one : " + a +"\nNumber Two : "+b+"\n");

		
	}

	public static void main(String[] args) {
		boolean valid = false;
		while(valid == false){
			System.out.print("Number One : \n");
			Scanner one = new Scanner(System.in);
			System.out.println("Number Two : ");
			Scanner two = new Scanner(System.in);
			
			if(one.hasNextInt() && two.hasNextInt()) {
				int number_one = one.nextInt();
				int number_two = two.nextInt();
				System.out.println("Before Swap ");
				System.out.println("Number one : " + number_one+"\nNumber Two : "+number_two);
				swapTwoNumbers(number_one,number_two);
			}else {
				System.out.println("Enter Digits Only");
			}	
		}
		
	}
}
