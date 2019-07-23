package ApachePOIandPropertyfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProFile 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Start");
		File file = new File("src/demo1/Demo.properties");
		FileInputStream fis = new FileInputStream(file);
		
		Properties pro = new Properties();
		pro.load(fis);
		
		pro.put("userName", "test@gmail.com");
		
		FileOutputStream fot = new FileOutputStream(file);
		pro.store(fot, "Testing Prop");
		System.out.println("End");
	}
}
