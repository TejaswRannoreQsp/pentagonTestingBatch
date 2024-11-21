package GenericPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile {
	public String toreadDataFrompropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		String BROWSER = prop.getProperty("browser");
		return key;
		
		
	}

}
