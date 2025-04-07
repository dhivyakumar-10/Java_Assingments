package Projects;
//
//1. TC-1 launch Firefox browser
//2. TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/
//3. TC-3 maximize the browser window
//4. TC-4 get the title of page
//5. TC-5 click on know more link text
//6. TC-6 switch from 0th window to 1st window
//7. TC-7 after switching get the title of page
//8. TC-8 close 1st window
//9. TC-8 switch from 1st window to 0th window
//10. TC-9 after switching get the title of page
//11.TC-10 close 0th window

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class morewindowsTabFF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. TC-1 launch Firefox browser
		WebDriver driver = new FirefoxDriver();
		//2. TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/
		driver.get(" https://netbanking.hdfcbank.com/netbanking/");
		//3. TC-3 maximize the browser window
		driver.manage().window().maximize();
		//4. TC-4 get the title of page
		String title = driver.getTitle();
		System.out.println(title);
		//6. TC-6 switch from 0th window to 1st window
		String MainWindow =  driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.guru99.com/xpath-selenium.html");
		//7. TC-7 after switching get the title of page
		String currentUrl = driver.getTitle();
		System.out.println(currentUrl);
		//8. TC-8 close 1st window
		driver.close();
		//9. TC-8 switch from 1st window to 0th window 
	    driver.switchTo().window(MainWindow);
		
	  //10. TC-9 after switching get the title of page 
	    String url= driver.getCurrentUrl();
	    System.out.println(url);
	    
	  //11.TC-10 close 0th window
driver.quit();
	    
		
	}

}
