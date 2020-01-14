package ApachePOIandPropertyfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProFile 
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("\\Training\\src\\ApachePOIandPropertyfiles\\test.properties");
		FileInputStream fis = new FileInputStream(file);
		
		Properties pro = new Properties();
		pro.load(fis);
		
		String url = pro.getProperty("URL");
		System.out.println("url:- "+ url);
		
	
	}
}
