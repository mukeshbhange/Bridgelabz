package com.fellowship.day05;
import java.util.*;

public class LeapYear {
	public static void main(String[] args) {
		boolean valid = false;
		while(valid == false) {
			System.out.print("Enter the year here : ");
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextInt()) {
				int year = sc.nextInt();
				int length = String.valueOf(year).length();
				if(length == 4) {
					boolean leap = false;
					
					if (year % 4 == 0) {
						if (year % 100 == 0) {
							if (year % 400 == 0) {
								leap = true;
								
							}else {
								leap = false;
							}
						}else {
							leap = false;
						}
					}else {
						leap = false;
					}
					
					if (leap == true) {
						System.out.println(year + " is Leap Year");
					}else {
						System.out.println(year+" is NOT LEAP year.");
					}
					
				}else {
					System.out.println("Please Enter Four Digit Integer.");
				}
				
			}else {
				System.out.println("Please Enter Positive Integer.");
			}
		}
	}
}