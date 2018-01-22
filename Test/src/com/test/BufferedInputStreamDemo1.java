package com.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamDemo1 {
    private static final String FILENAME="E:\\TEST\\youdaonote_unsilent5.exe";
    public static void main(String[] args) throws IOException {
        long l1 = readByBufferedInputStream();
        long l2 = readByInputStream();
        System.out.println("通过BufferedInputStream读取用时："+l1+";通过InputStream读取用时："+l2);
        method2();
    }
 
    public static long readByInputStream() throws IOException {
        InputStream in=new FileInputStream(FILENAME);
       
        byte[] b=new byte[8910];
        int l=0;
        long start=System.currentTimeMillis();
        while(in.read(b,0,8910)!=-1){
        }
        long end=System.currentTimeMillis();
        return end-start;
    }
 
    public static long readByBufferedInputStream() throws IOException {
        BufferedInputStream in=new BufferedInputStream(new FileInputStream(FILENAME));
       
        byte[] b=new byte[8910];
        int l=0;
        long start=System.currentTimeMillis();
        while(in.read(b,0,8910)!=-1){
        }
        long end=System.currentTimeMillis();
        return end-start;
    }
    
    public static void method2(){
        InputStream in = null;
        try{
            in = new BufferedInputStream(new FileInputStream("E:\\TEST\\nomal_io.txt"));
  
            byte [] buf = new byte[1024];
            int bytesRead = in.read(buf);
            while(bytesRead != -1)
            {
                for(int i=0;i<bytesRead;i++)
                    System.out.print((char)buf[i]);
                bytesRead = in.read(buf);
                System.out.print( bytesRead);
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