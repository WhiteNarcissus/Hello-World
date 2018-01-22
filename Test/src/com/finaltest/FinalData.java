package com.finaltest;

public class FinalData {
	
	
	private Value v1 = new Value(11);
	
	private final Value v2 = new Value(22);
	 private static final Value VAL_3 = new Value(33);
	 private final int[] a = { 1, 2, 3, 4, 5 };
	
	 public static void main(String[] args) {
		 
		 FinalData fd1 = new FinalData(); 
		 
		// fd1.v2 = new Value(1);
		// fd1.v1 = new Value(9);
		// fd1.VAL_3 = new Value(23);
		// fd1.a = new int[3];
	 }

}

class Value {
	
	int i;
	public Value(int i){ this.i=i;}
}