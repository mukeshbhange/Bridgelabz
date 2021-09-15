package com.fellowship.day05;
import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		int one, two, three, largest, temp;  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		one = sc.nextInt();
		System.out.println("Enter the second number:");
		two = sc.nextInt();
		System.out.println("Enter the third number:");
		three = sc.nextInt();
		temp=one>two?one:two;
		largest=three>temp?three:temp;
		System.out.println("The largest number is: "+largest);  
	}  
}