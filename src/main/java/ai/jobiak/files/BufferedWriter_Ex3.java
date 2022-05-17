package ai.jobiak.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_Ex3 {

	public static void main(String[] args) throws IOException 
	{
		BufferedWriter obj=new BufferedWriter(new FileWriter("hello.txt"));
		char[] c= {'J','a'};
		obj.write(c);
		obj.write(118);
		obj.write(97);
		obj.newLine();
		obj.write("Programming Language");
		obj.write(10);
		obj.close();
		System.out.println("Data inserted into the file");
		
	}

}
