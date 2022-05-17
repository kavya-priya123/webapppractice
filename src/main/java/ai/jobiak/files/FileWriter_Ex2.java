package ai.jobiak.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Ex2 
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw=new FileWriter("new.txt");
		fw.write(97);
		char[] t= {'p','p'};
		fw.write(t);
		fw.write("le");
		fw.write(" Fruit");
		//fw.write(5);
		fw.close();
		System.out.println("Data Successful");
	}
}
