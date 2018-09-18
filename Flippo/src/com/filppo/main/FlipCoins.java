package com.filppo.main;

import java.util.HashMap;

public class FlipCoins {

	//Util method to find possible moves 
		public static Integer[][] flipCoins(Integer[][] board, String position, int tileValue){
			
			Integer[][] tempBoard = board; 
			Integer[] tileChange = PositionToMatrix.positionToMatrix(position);
			int xVal = tileChange[0];
			int yVal = tileChange[1];
			HashMap<String, Integer[]> flipPositions = new HashMap<>();
			
			//8 directions check
			//right
			for(int i=yVal; i<(8-yVal); i++) {
				if(!(tempBoard[xVal][i]==0) || !(tempBoard[xVal][i]==1)){
					break;
				}
				if(tileValue == tempBoard[xVal][i]) {
					Integer[] vals = new Integer[2];
					vals[0] = xVal;
					vals[1] = i;
					flipPositions.put("Right", vals);
				}
			}
			//left
			for(int i=yVal; i<0; i--) {
				if(!(tempBoard[xVal][i]==0) || !(tempBoard[xVal][i]==1)){
					break;
				}
				if(tileValue == tempBoard[xVal][i]) {
					Integer[] vals = new Integer[2];
					vals[0] = xVal;
					vals[1] = i;
					flipPositions.put("Left", vals);
				}
			}
			//down
			for(int i=xVal; i<(8-xVal); i++) {
				if(!(tempBoard[yVal][i]==0) || !(tempBoard[yVal][i]==1)){
					break;
				}
				if(tileValue == tempBoard[yVal][i]) {
					Integer[] vals = new Integer[2];
					vals[0] = yVal;
					vals[1] = i;
					flipPositions.put("Down", vals);
				}
			}
			//up
			for(int i=xVal; i<0; i--) {
				if(!(tempBoard[yVal][i]==0) || !(tempBoard[yVal][i]==1)){
					break;
				}
				if(tileValue == tempBoard[yVal][i]) {
					Integer[] vals = new Integer[2];
					vals[0] = yVal;
					vals[1] = i;
					flipPositions.put("Up", vals);
				}
			}
			
			for(String Key: flipPositions.keySet()) {
				Integer[] vals = flipPositions.get(Key);
				switch(Key) {
				case "Right": 
					for(int i=yVal+1; i<vals[1];i++) {
						tempBoard[xVal][i] = change(tempBoard[xVal][i]);
					}
					break;
				case "Left":
					for(int i=yVal-1; i>vals[1];i--) {
						tempBoard[xVal][i] = change(tempBoard[xVal][i]);
					}
					break;
				case "Down": 
					for(int i=xVal+1; i<vals[1];i++) {
						tempBoard[i][yVal] = change(tempBoard[i][yVal]);
					}
					break;
				case "Up":
					for(int i=xVal-1; i>vals[1];i--) {
						tempBoard[i][yVal] = change(tempBoard[i][yVal]);
					}
					break;
				}
			}
			return tempBoard;
		}

	private static Integer change(Integer integer) {
		if (integer == 0) {
			return 1;
		} else {
			return 0;
		}

	}

}
