package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SetupClass {

	Properties prop;

	public void initProperties() {
		prop = new Properties();
		FileInputStream fios;
		try {
			fios = new FileInputStream("src/test/resources/configuration/credential.properties");
			prop.load(fios);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
