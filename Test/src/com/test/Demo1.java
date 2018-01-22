package com.test;

import java.io.FileReader;
import java.io.IOException;

public class Demo1 {
	
	public static void main(String[] args) throws IOException {
		
		
		StringBuffer str = new StringBuffer();
		
		char[] buf = new char[1];
	
	
	FileReader f = new FileReader("E:\\file.ini");
	// f.read(buf);
	while(f.read(buf)>0)
	//for(int i=0;i<3;i++)
	{
	//	
		//f.read(buf);
		str.append(buf);
	}
	
	
	
	  //str.toString();
	  
	  System.out.println(str);
	
	

}
}