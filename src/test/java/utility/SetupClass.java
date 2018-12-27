package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetupClass {

	public static Properties prop;

	public static void initProperties() {
		prop = new Properties();
		
		try {
			FileInputStream fios = new FileInputStream("src/test/resources/configuration/credential.properties");
			prop.load(fios);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static WebDriver driver;

	public static void setUp() {
		initProperties();
		String browserName = prop.getProperty("browser");
		String osName = System.getProperty("os.name");
		if (browserName.equalsIgnoreCase("chrome")) {
			if (osName.contains("Mac")) {
				System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
			} else if (osName.contains("Windows")) {
				System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			}
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			if (osName.contains("Mac")) {
				System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver");
			} else if (osName.contains("Windows")) {
				System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
			}
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		if (osName.contains("Mac")) {
			driver.manage().window().fullscreen();
		} else if (osName.contains("Windows")) {
			driver.manage().window().maximize();
		}
		driver.get(prop.getProperty("url"));
	}

	public static void tearDown() {
		driver.quit();
	}

}
