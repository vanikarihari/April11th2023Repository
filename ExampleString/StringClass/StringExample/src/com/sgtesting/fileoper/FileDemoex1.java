package com.sgtesting.fileoper;

import java.io.File;

public class FileDemoex1 {

	public static void main(String[] args) {
		String path="E:\\Example\\Test\\Welcome.txt";
		File f1=new File(path);
		//Display the name of the File
		String name=f1.getName();
		System.out.println("File name: "+name);
		//Display the path of the file
		String path1=f1.getAbsolutePath();
		System.out.println("File path: "+path1);
		//Display the path of the file
		String path2=f1.getPath();
		System.out.println("File path: "+path2);
		//Display Parent Folder path
		String Parent=f1.getParent();
		System.out.println("Parent path: "+Parent);
		//Verify is it a file
		boolean isafile=f1.isFile();
		System.out.println("Is a File: "+isafile);
		//Verify is it a file
		boolean isafile1=f1.isDirectory();
		System.out.println("Is a Folder: "+isafile1);
		//Read Permission
		boolean v1=f1.canRead();
		System.out.println("Can Read: "+v1);
		//Write Permission
		boolean v2=f1.canWrite();
		System.out.println("Can Read: "+v2);
		//Write Permission
		boolean v3=f1.canExecute();
		System.out.println("Can Execute: "+v3);

	}

}
