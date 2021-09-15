package com.fellowship.day06;
import java.util.Scanner;

public class RevereseNumber {
	private static void reverseNumber(String number) {
		String input = String.valueOf(number);
	       String result = "";
	       for (int i = input.length() - 1; i >= 0; i--) {
	           result = result + input.charAt(i);
	       }
	       System.out.println(result);
	}

	public static void main(String[] args) {
		boolean valid = false;
		while(valid == false){
			System.out.println("Enter Number  to reverse : ");
			Scanner sc = new Scanner(System.in);
			if(sc.hasNext()) {
				String numb = sc.next();
				reverseNumber(numb);
				
			}else {
				System.out.println("Enter Digits Only");
			}	
		}
	}

}