package com.fellowship.day05;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		boolean valid = false;
		while(valid == false){
			System.out.println("Enter Number for to check Even Or Odd: ");
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextInt()) {
				int numb = sc.nextInt();
				if(numb % 2 == 0) {
					System.out.println("EVEN");
				}else {
					System.out.println("ODD");
				}
			}else {
				System.out.println("Enter Digits Only");
			}	
		}
	}

}