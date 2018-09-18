package com.filppo.main;

import java.util.HashMap;

public class CalculateCoins {

	//Util method to count black and white
	public HashMap<String, Integer> calculateCoins(Integer[][] board){
		int blackCount = 0;
		int whiteCount = 0;
		HashMap<String, Integer> count = new HashMap<>();
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(board[i][j] == 1) {
					whiteCount += 1;
				}else {
					blackCount +=1;
				}
			}
		}
		
		count.put("White", whiteCount);
		count.put("Black", blackCount);
		return count;
	}
}
