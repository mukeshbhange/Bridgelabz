package com.fellowship.day05;
import java.util.*;
public class PowerOfTwo {

	public static void main(String[] args) {
		boolean valid = false;
		while(valid == false) {
			System.out.print("Enter integer between 0 and 31: ");
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextInt()) {
				int number = sc.nextInt();
				if( number > 0 && number < 31) {
					int powerOfTwo = 1;
					for(int i = 0; i< number; i++) {
						powerOfTwo = 2 * powerOfTwo;
						System.out.println(powerOfTwo);	
						leapYear(powerOfTwo);
					}
				}else {
					System.out.println("Enter Interger Between 0 and 31");
				}
				
				
			}else {
				System.out.println("Enter Only Integer.");
			}
		}

	}
	
	public static void leapYear(int year) {
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
			}
		if(leap == true) {
			System.out.println("LEAP year");
		}else {
			System.out.println("NOT LEAP year");
		}
		}
	}