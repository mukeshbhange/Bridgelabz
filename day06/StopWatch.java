package com.fellowship.day06;
import java.util.Scanner;

public class StopWatch {
	public long startWatch = 0;
	public long stopWatch = 0;
	public long totalTime = 0;
	
	public  long startTime() {
		System.out.println("Stop watch  started..\nPress 2 to stop watch");
		long start_watch = System.currentTimeMillis();
		return start_watch;
	}
	public long endTime() {
		System.out.println("Watch Stopped..");
		long stopWatch = System.currentTimeMillis();
		return stopWatch;
	}
	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		boolean valid = false;
		while(valid == false){
			System.out.print("Enter 1 to start Time : ");
			Scanner sc = new Scanner(System.in);
			valid = true;
			if(sc.hasNextInt()) {
				int numb = sc.nextInt();
				if(numb == 1) {
					long s_time = sw.startTime();
					//System.out.print("Enter 2 to End Time : "+s_time);
					int stop = sc.nextInt();
					if(stop == 2) {
						long e_time = sw.endTime();
						//System.out.println("end time "+e_time);
						long time = (e_time - s_time)/1000;
						System.out.println("total seconds Watch is on: "+time);	
					}else {
						System.out.print("Enter 2 to stop the Watch: ");
					}
				}
			}else {
				System.out.println("Enter Digits Only");
			}	
		}
		
	}

}