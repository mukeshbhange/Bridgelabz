package com.fellowship.day05;
import java.util.Scanner;

public class PrimeFactorization {
	public static void main(String[] args) {
		boolean valid = false;
		while(valid == false){
			System.out.println("Enter Number for Factorization: ");
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextInt()) {
				int numb = sc.nextInt();
				for(int i=2;i<numb;i++) {
					while(numb % i == 0 ) {
						System.out.println(i);
						numb = numb / i;
					}
				}
				if(numb > 2) {
					System.out.println(numb);
				}
			}else {
				System.out.println("Enter Digits Only");
			}	
		}
		

	}

}