package com.fellowship.day05;
import java.util.*;

public class CoinFlip {
	public static void main(String[] args) {
		boolean valid = false;
		while(valid == false) {
			System.out.println("How Many Times Do You Want To Flip The Coin?");
			Scanner scanner = new Scanner(System.in);
			if(scanner.hasNextInt()) {
				int number = scanner.nextInt();
				valid = true;
				int head =0;
				for(int i=0; i<number; i++) {
					double flip = Math.random();
					System.out.println(flip);
					if(flip >=0.5) head = head + 1;
				}
				int percentage_of_head = (head * 100)/number;
				int percentage_of_tail = 100  -  percentage_of_head;
				System.out.println("Head Percntage : "+percentage_of_head+"%");
				System.out.println("Tail Percntage : "+percentage_of_tail+"%");
				
			}
		}
	}

}