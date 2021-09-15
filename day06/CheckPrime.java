package com.fellowship.day06;
import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		boolean valid = false;
		while(valid == false){
			System.out.println("Enter Number : ");
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextInt()) {
				int numb = sc.nextInt();
				boolean prime = false;
				for(int i= 2; i<numb/2;i++) {
					if(numb % i == 0) {
						prime =true;
						break;
					}
				}
				if(!prime) {
					System.out.println(numb+" is PRIME");
				}else {
					System.out.println(numb+ " is NOT PRIME.");
				}
				
			}else {
				System.out.println("Enter Digits Only");
			}	
		}
		

	}

}