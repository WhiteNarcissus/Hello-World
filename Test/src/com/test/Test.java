package com.test;

public class Test {
	
	 public static void main(String[] args)  {
	        String a = "hello2"; 
	        final String b = "hello";
	        String d = "hello";
	        String f = "hello2";
	        String c = b + 2; 
	        String e = d + 2;
	        System.out.println((a == c));
	        System.out.println(a == e);
	        System.out.println(a == f);
	        
	    }

}