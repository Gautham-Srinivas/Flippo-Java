package com.filppo.main;

public enum Position {
	A('A', 0), B('B', 1), C('C', 2), D('D', 3), E('E', 4), F('F', 5), G('G', 6), H('H', 7);

	public char Val;
	public int Key;

	private Position(char Val, int Key) {
		this.Val = Val;
		this.Key = Key;
	}
}
