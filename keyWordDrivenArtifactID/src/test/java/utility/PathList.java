package utility;

import java.util.Properties;

public class PathList {
	public static final String currentDir = System.getProperty("user.dir");
	public static final String chromeDriver=currentDir + "\\src\\test\\java\\utility\\chromedriver.exe";
	public static final String firefoxDriver=currentDir + "\\src\\test\\java\\utility\\geckodriver.exe";
	public static final String excelPath = currentDir + "\\src\\test\\java\\utility\\TestCase.xlsx";
	public static final  String objectProperties=currentDir +"\\src\\test\\java\\utility\\object.properties";



}
