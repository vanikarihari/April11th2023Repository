package com.sgtesting.Fileinput;

import java.io.FileOutputStream;

public class FileOutputex {
public static void main(String []args) {
	OutputStream();
}
private static void OutputStream() {
	{
		FileOutputStream fout=null;
	try {	
		fout=new FileOutputStream("E:\\Example\\Test\\Welcome.txt",true);
		String k="Harsih lokare is a Civil Engineer";
		k=k+"But He left Civil Dept to Join IT Dept";
		byte b[]=k.getBytes();
		fout.write(b);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	finally 
	{
		try {
			fout.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	}
}
}
