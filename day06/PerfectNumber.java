package com.fellowship.day06;
import java.util.Scanner;

public class PerfectNumber {
	private static void perfectNumber(int numb) {
		int i;
		int total_fctr_addition = 0;
		for(i=1;i<numb;i++) {
			if(numb % i == 0) {
				total_fctr_addition = total_fctr_addition + i;	
			}
		}
		if(total_fctr_addition == numb) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("NOT a Perfect Number");
		}
	}
	
	public static void main(String[] args) {
		boolean valid = false;
		while(valid == false){
			System.out.println("Enter Number : ");
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextInt()) {
				int numb = sc.nextInt();
				perfectNumber(numb);
				
			}else {
				System.out.println("Enter Digits Only");
			}	
		}
	}
}