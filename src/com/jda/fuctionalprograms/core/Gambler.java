package com.jda.fuctionalprograms.core;
import java.util.Scanner;

import com.jda.fuctionalprograms.util.SecondUtil;

/**
 * 
 * @author bridgelabz
 *Gambler Class takes the number of time the user plays, the goal, and the stake. Returns the perce
 */
public class Gambler {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int goal = in.nextInt();
		int stake = in.nextInt();
		int win = 0; int loss = 0;
	  for(int i=0; i<N; i++){
		  int count = 0;
		  int temp = stake;
		  while(temp > 0 && temp < goal){
			  if(SecondUtil.flipCoin()){
				  temp++;
				  count++;
			  }else{
				  temp--;
				  count ++;
			  }
		  }
		  System.out.print(count + " ");
		  if(temp == 0){
			  System.out.println("loss");
			  loss++;
		  }else{
			  System.out.println("win");
			  win++;
		  }
	  }
	  System.out.println("win percentage" + (float)win/N*100);
	  System.out.println("loss percentage" + (float)loss/N*100);
	}
}
