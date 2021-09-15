package com.fellowship.day04;
import java.util.Random;
import java.util.Scanner;
public class SnakesAndLadders {

	public static void main(String[] args) {
		System.out.println(".........Welcome to Snakes And Ladders.....");
		snakeAndLadder(0);
	}
	
	public static void snakeAndLadder(int position_of_player) {
		int position = position_of_player;
		try (Scanner sc = new Scanner(System.in)) {
			boolean valid = false;
			while(valid == false) {
				System.out.println("Press 1 to roll the dice");
				int choice = sc.nextInt();
				if(choice == 1) {
					int roll_numb = diceRoll();
					System.out.println(roll_numb);
					valid = true;
					System.out.println("1.Snake\n2.Ladder\n3.No Play");
					int optchoice = checkOption();
					System.out.println("Your system Generated choice is : " + optchoice);
					if(optchoice == 1) {
						choiceSnake(roll_numb,position);					}
					else if(optchoice == 2) {
						choiceLadder(roll_numb,position);
					}else {
						choiceNoPlay(position);
					}
				}
			}
		}	
	}
	
	public static int diceRoll() {
		int max = 6;
		int min = 1;
		Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	public static int checkOption() {
		int max = 3;
		int min = 1;
		Random rand = new Random();
	    int checkopt = rand.nextInt((max - min) + 1) + min;
	    return checkopt;
		
	}
	
	public static void choiceSnake(int number,int position) {
		int new_position = position - number;
		int advanced_position=0;
		if(new_position > 0) {
			advanced_position = new_position;
			System.out.println("Your Position: "+advanced_position);
			snakeAndLadder(advanced_position);
		}else if(new_position <= 0 ){
			advanced_position = 0;
			System.out.println("Your Position: "+advanced_position);
			snakeAndLadder(advanced_position);
		}else {
			System.out.println("Roll again...");
			snakeAndLadder(advanced_position);
		}
	}
	public static void choiceLadder(int number,int position) {
		int new_position = position + number;
		int advanced_position = 0;
		if(new_position < 100) {
			advanced_position = new_position; 
			if(advanced_position == 100) {
				System.out.println("You have reached destination.");
				System.out.println("!!!......WINNER..WINNER....!!!");
			}
			System.out.println("Your Position: "+advanced_position);
			snakeAndLadder(advanced_position);
		}else{
			System.out.println("Roll again...");
			snakeAndLadder(advanced_position);	
		}
	}
	public static void choiceNoPlay(int position) {
		System.out.println("No play selected.");
		System.out.println("Roll again...");
		System.out.println("Your Position: "+position);
		snakeAndLadder(position);
	}
}