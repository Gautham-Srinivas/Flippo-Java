package com.filppo.main;

import java.util.Scanner;

public class FlippoMain {

	public static void main(String[] args) {
		
		//Board inputs
		Integer[][] board = new Integer[8][8];
		board[4][4] = 0;  //D4 black
		board[5][5] = 0;  //D5 black
		board[4][5] = 1;  //E4 white
		board[5][4] = 1;  //E5 white
		
		Scanner userInput = new Scanner(System. in);
		for(int i=0; i<60; i++) {
			String input = userInput.nextLine();  							//reads input
			String output = "";
			if(input.equalsIgnoreCase("start")) {  							//handle start
				i--;
				System.out.println(output);
			}else if(input.equalsIgnoreCase("quit")) { 						//handle quit
				System.exit(0);
			}else {   														//handle user moves
				System.out.println(output);
			}
		}
	}

}
