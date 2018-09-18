package com.filppo.main;

public class PositionToMatrix {
	public static Integer[] positionToMatrix(String position){
		Integer[] xyVal = new Integer[2];
		
		KeyValUtil keyvalutil = new KeyValUtil();
		
		xyVal[0] = Integer.parseInt(String.valueOf(keyvalutil.getKeyForVal(position.charAt(0))));
		xyVal[1] = Integer.parseInt(String.valueOf(position.charAt(1))) - 1;
		
		return xyVal;
	}
	
	/*public static void main(String[] args) {
		Integer[] xyVal = 	positionToMatrix("A3");
		System.out.println(xyVal[0] + " "+ xyVal[1]);
	}*/
}
