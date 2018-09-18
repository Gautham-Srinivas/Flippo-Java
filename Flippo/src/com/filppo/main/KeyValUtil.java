package com.filppo.main;

public class KeyValUtil {
	
	public int getKeyForVal(char Val) {
		for(Position value: Position.values()) {
			if(value.Val == Val) {
				return value.Key;
			}else {
				continue;
			}
		}
		return 0;
	}
	
	public char getValForKey(int Key) {
		for(Position value: Position.values()) {
			if(value.Key == Key) {
				return value.Val;
			}else {
				continue;
			}
		}
		return ' ';
	}
}
