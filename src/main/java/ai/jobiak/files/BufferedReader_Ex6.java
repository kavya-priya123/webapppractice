package ai.jobiak.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReader_Ex6 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("print.txt"));    
        int i;    
        while((i=br.read())!=-1){  
        System.out.print((char)i);  
        }  
        br.close();        
	}

}
