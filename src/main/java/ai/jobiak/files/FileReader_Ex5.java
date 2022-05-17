package ai.jobiak.files;
import java.io.*;
public class FileReader_Ex5 {

	public static void main(String[] args) throws Exception
	{
		FileReader obj=new FileReader("hello.txt");
		int t;
		while((t=obj.read())!=-1)
		{
			System.out.print((char)t);
		}
		//System.out.println(obj.read());
		//System.out.println((char)obj.read());
		//System.out.println(obj.read());
	}

}
