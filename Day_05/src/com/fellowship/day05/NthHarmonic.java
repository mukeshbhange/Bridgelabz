package com.fellowship.day05;
import java.util.*;
public class NthHarmonic {
	public static void main(String[] args) {
		boolean valid = false;
		while(valid == false){
			System.out.println("Which Harmonic term Number do you want?");
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextInt()) {
				int n = sc.nextInt();
				int i = 1;
				double hnumb = 0.0;
				while(i <= n) {
					hnumb = hnumb + (double)1/i;
					i++;
				}
				System.out.println(hnumb);
				
			}else {
				System.out.println("Enter Digits Only");
			}	
		}
		
	}
}