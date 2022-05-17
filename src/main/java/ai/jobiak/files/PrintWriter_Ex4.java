package ai.jobiak.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_Ex4 
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter obj=new PrintWriter(new FileWriter("print.txt"));
		char[] c= {'t','e','n'};
		obj.write(c);
		obj.println();
		obj.print(1);
		obj.println();
		obj.print(true);
		obj.println();
		obj.print(c);
		obj.println();
		obj.close();
		System.out.println("Data inserted in the print.txt file");
	}

}
