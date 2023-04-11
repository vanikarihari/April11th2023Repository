package com.sgtesting.Fileinput;

import java.io.FileReader;

public class CharStreamEx {

	public static void main(String[] args) {
		 Reader();
	}
private static void Reader()
{
	FileReader fir=null;
	int n=0;
	try {
		fir=new FileReader("E:\\Example\\Test\\Vani.txt");
		while(true)
		{
			n=fir.read();
			if(n==-1)
			{
				break;
			}
			char ch=(char)n;
			System.out.print(ch);
		}
	}catch(Exception e)
	{
		e.printStackTrace();
	}finally {
		try {
			fir.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
}
