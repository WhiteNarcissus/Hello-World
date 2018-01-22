package com.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioAndIoDemo1 {
	
	public static void main(String[] args){
		
		
		//method2();
		method1();
		
		
	}
	
	
	public static void method1(){
        RandomAccessFile aFile = null;
        try{
            aFile = new RandomAccessFile("E:\\TEST\\youdaonote_unsilent5.exe","rw");
            FileChannel fileChannel = aFile.getChannel();
            ByteBuffer buf = ByteBuffer.allocate(1024);
 
            int bytesRead = fileChannel.read(buf);
            System.out.println(bytesRead);
 
            while(bytesRead != -1)
            {
                buf.flip();
                while(buf.hasRemaining())
                {
                    System.out.print((char)buf.get());
                }
 
                buf.compact();
                bytesRead = fileChannel.read(buf);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(aFile != null){
                    aFile.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
	
	
	
	public static void method2(){
	       InputStream in = null;
	       try{
	           in = new BufferedInputStream(new FileInputStream("E:\\TEST\\nomal_io.txt"));
	 
	           byte [] buf = new byte[1];
	           int bytesRead = in.read(buf);
	           System.out.println(bytesRead);
	           while(bytesRead != -1)
	           {
	               for(int i=0;i<bytesRead;i++)
	                   System.out.print(bytesRead+":"+(char)buf[i]+i+"   ");
	               
	           // ����û������һ�䣬�������ѭ��������ѭ���ˣ� ��Ϊ bytesRead��������ԶΪ2��ֻ�е������ �����ļ���Ϊ-1
	            bytesRead = in.read(buf);
	             System.out.println("-"+bytesRead+"-");
	           }
	       }catch (IOException e)
	       {
	           e.printStackTrace();
	       }finally{
	           try{
	               if(in != null){
	                   in.close();
	               }
	           }catch (IOException e){
	               e.printStackTrace();
	           }
	       }
	   }
	
	
	
	
	
	
	
	

}
