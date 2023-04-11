package com.sgtesting.Fileinput;

import java.io.FileInputStream;

public class InputOutput {

	public static void main(String[] args) {
		FileInputStream fin=null;
		int n=0;
		try {
			fin=new FileInputStream("E:\\Example\\Test\\Harish.txt");
			while(true)
			{
				n=fin.read();
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
		}
		finally
		{
			try
			{
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
