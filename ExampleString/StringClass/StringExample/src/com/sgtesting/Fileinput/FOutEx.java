package com.sgtesting.Fileinput;

import java.io.FileOutputStream;

public class FOutEx {

	public static void main(String[] args) {
		writecontent();

	}
private static void writecontent()
{
	FileOutputStream fout=null;
	try {
		fout=new FileOutputStream("E:\\Example\\Test\\Vani.txt",true);
		String str="Iam The Biggest Ghost in the History of SG Institute";
		str=str+"I Drink litres of Blood from Innocent Harish";
		byte b[]=str.getBytes();
		fout.write(b);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	finally {
		try {
			fout.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
}
