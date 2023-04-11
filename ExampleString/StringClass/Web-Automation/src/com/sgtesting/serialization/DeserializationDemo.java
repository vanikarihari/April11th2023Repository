package com.sgtesting.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		Deserialization();

	}
	private static void Deserialization()
	{
		FileInputStream f=null;
		ObjectInputStream o=null;
		Employee l=null;
		try {
		f=new FileInputStream("E:\\Example\\Employee.ser");
		o=new ObjectInputStream(f);
		l=(Employee) o.readObject();
		l.showJobName();
		l.showEmpNo();
		l.showJobName();
		l.showSalary();
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				f.close();
				o.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
