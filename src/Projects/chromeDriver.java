package Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chromedriver", "C:\\Users\\Hxtreme\\Desktop\\Automation Tools\\Drivers\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//		driver.get("https://www.selenium.dev/");
//		Thread.sleep(5000);
//		String Title = driver.getTitle(); 
//		System.out.println(Title);
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
//		driver.close();
		
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	driver.close()	;
	}

}
