package com.fellowship.day05;
import java.util.*;

public class VowelAndConsonent {
	public static void main(String[] args) {
		boolean valid = false;
		while(valid == false) {
			System.out.println("Enter Alphabet");
			Scanner sc = new Scanner(System.in);
			if(sc.hasNext()) {
				char ch = sc.next().charAt(0);
		        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
		        	System.out.println(ch+" is Vowel.");
		        }else {
		        	System.out.println(ch+" is Consonent.");
		        }
				
			}else {
				System.out.println("Enter only Aphabet");
			}
			
		}
		
		}

}