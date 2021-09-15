package com.fellowship.day06;
import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		boolean valid = false;
		while(valid == false){
			System.out.println("Enter Number : ");
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextInt()) {
				int numb = sc.nextInt();
				int first = 0,second = 1,third;
				System.out.print(first+" "+second);
				for(int i = 2;i< numb;i++) {
					third = first + second;
					System.out.print(" "+third);
					first = second;
					second = third;
				}
				
				
			}else {
				System.out.println("Enter Digits Only");
			}	
		}
	}

}