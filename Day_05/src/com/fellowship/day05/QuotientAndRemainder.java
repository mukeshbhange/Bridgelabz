package com.fellowship.day05;
import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		boolean valid = false;
		while(valid == false){
			System.out.print("Divident : \n");
			Scanner number_one = new Scanner(System.in);
			System.out.println("Divisor : ");
			Scanner number_two = new Scanner(System.in);
			
			if(number_one.hasNextInt() && number_two.hasNextInt()) {
				int divident = number_one.nextInt();
				int divisor = number_two.nextInt();
				
				int remainder = divident % divisor;
				int quotient = divident / divisor;
				System.out.println("Quotient : " + quotient+"\nRemainder : "+remainder);
			}else {
				System.out.println("Enter Digits Only");
			}	
		}
		
	}

}