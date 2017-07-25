package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObject {
	static Properties p = new Properties();
	public static Properties getObjectRepository(String objectFilePath)throws IOException{
		InputStream stream = new FileInputStream(new File(objectFilePath));
		p.load(stream);
		return p;
		
	}
public static void main (String[] args) throws IOException{
	Properties myP=ReadObject.getObjectRepository(System.getProperty("user.dir") +"\\src\\test\\java\\testData\\object.properties");
	System.out.println(myP.getProperty("uName"));
	
}
}
