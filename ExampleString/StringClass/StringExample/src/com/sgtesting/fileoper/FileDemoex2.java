package com.sgtesting.fileoper;

import java.io.File;

public class FileDemoex2 {
 public static void main(String []args) {
	 String path="E:\\Example\\Test\\Welcome.txt";
	 File f1=new File(path);
	 System.out.println("Name of the file: "+f1.getName());
	 System.out.println("Name of the file: "+f1.getAbsolutePath());
	 System.out.println("Name of the file: "+f1.getPath());
	 System.out.println("Name of the file: "+f1.getParent());
	 System.out.println("Name of the file: "+f1.canExecute());
	 System.out.println("Name of the file: "+f1.canRead());
	 System.out.println("Name of the file: "+f1.canWrite());
	 String path1="E:\\Example\\Test\\Welcomeh.txt";
	 
	 
 }
}
