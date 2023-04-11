package com.sgtesting.Fileinput;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriter {

	public static void main(String[] args) {
		//copypaste();
		writecontent();

	}
	private static void copypaste()
	{
		FileReader fir=null;
		FileWriter fiw=null;
		int n=0;
		{
			try {
			fir=new FileReader("E:\\Example\\Test\\Vani.txt");
			fiw=new FileWriter("E:\\Example\\Test\\Karishma.txt");
			while(true)
			{
				n=fir.read();
				if(n==-1)
				{
					break;
				}
				fiw.write(n);
			}
			}catch(Exception e)
			{
				e.printStackTrace();
			}finally {
				try {
					fir.close();
					fiw.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	private static void writecontent()
	{
		FileWriter fw=null;
		{
			try {
				fw=new FileWriter("E:\\Example\\Test\\Welcome1.txt",true);
				String h="SG Institute is a Software Testing Institute";
				h=h+"It is in Vijayanagara,Bengaluru";
				char ch[]=h.toCharArray();
				fw.write(ch);
			}catch(Exception e)
			{
				e.printStackTrace();
			}finally {
				try {
					fw.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}

}
