package ai.jobiak.files;

import java.io.File;
import java.io.IOException;

public class File_Ex1 
{
	public static void main(String[] args) throws IOException
	{
		//creation of directory
		File f=new File("Group");
		f.mkdir();
		System.out.println("Directory Created");
		//creation of file
		File f1=new File("input.txt");
		f1.createNewFile();
		System.out.println("File Created");
		//creation of file inside directory
		File f2=new File(f,"output.txt");
		f2.createNewFile();
		System.out.println("File Created Inside Directory");
		
	}

}
