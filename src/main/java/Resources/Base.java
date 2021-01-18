package Resources;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Pageobjects.D42Login;

public class Base {

	// Provide the D42 Login credentials here
	static String username = "admin";
	static String password = "adm!nd42";

	public static D42Login d42 = new D42Login();
	public static WebDriver driver;

	@BeforeSuite(description = "This initialises the driver selected in the gloabal parameter which can be used by all tests")
	public WebDriver initializeDriver() throws Exception {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("src/main/java/Resources/data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/main/java/Resources/chromedriver.exe");
			driver = new ChromeDriver();
		}

		if (browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "src/main/java/Resources/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		if (browserName.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "src/main/java/Resources/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		return driver;
	}

	@BeforeClass(description = "This logs into the D42")
	public static void login() throws Exception {
		d42.login(username, password);
	}

	@AfterClass(description = "This logs out from D42")
	public static void logout() throws Exception {
		d42.signout();
	}

	@AfterSuite(description = "This closes the browser at the end of the suite")
	public static void closeBrowser() {
		driver.close();
	}
}
