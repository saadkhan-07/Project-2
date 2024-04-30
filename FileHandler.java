package project1;
import java.util.*;
import java.io.*;
public class FileHandler {
private FileReader fr;//this to read file.
private BufferedReader br;//to read data from file via filereader
private FileWriter fw;//to read file for writing 
private BufferedWriter bw;//to write into file using file writer

FileHandler()
{
try
{
fw=new FileWriter("student.txt"); 	
bw=new BufferedWriter(fw);
fr=new FileReader("student.txt");
br=new BufferedReader(fr);

}

catch(Exception e)
{
e.printStackTrace();	
}

}

public void writeintoFile(ArrayList<String> list) throws Exception
{
	for(int i=0;i<list.size();i++)
	{
		String line=list.get(i);
		bw.append(line);
		bw.newLine();
		
	}
	bw.close();
	fw.close();
}

public ArrayList<String> readfromFile()throws Exception
{
ArrayList<String> arr=new ArrayList<String>();
String line=br.readLine();
while(line!=null)
{
arr.add(line);
line=br.readLine();
}
br.close();
fr.close();
return arr;
}

}
