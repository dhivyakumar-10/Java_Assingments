package Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.GeckoDriverInfo;

public class geckoDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("Webdriver.chromedriver", "C:\\Users\\Hxtreme\\Desktop\\Automation Tools\\Drivers\\chromedriver-win64.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.get("http://www.firefox.com");
	    Thread.sleep(5000);
	    driver.quit()	;
	}

}