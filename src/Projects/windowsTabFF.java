package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//1. TC-1 launch Chrome browser
//2. TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/
//3. TC-3 maximize the browser window
//4. TC-4 get the title of page
//5. TC-5 click on know more link text
//6. TC-6 switch from 0th window to 1st window
//7. TC-7 after switching get the title of page
//8. TC-8 switch from 1st window to 0th window
//9. TC-9 after switching, get the title of page
//10. TC-10 close all windows of the browser

public class windowsTabFF {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new FirefoxDriver();
      //2. TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
      //3. TC-3 maximize the browser window
        driver.manage().window().maximize();
      //4. TC-4 get the title of page
        String title=driver.getTitle();
        System.out.println(title);
       // TC-6 switch from 0th window to 1st window
       String MainWindow =  driver.getWindowHandle();
       driver.switchTo().newWindow(WindowType.WINDOW);
       System.out.println(MainWindow);
     //7. TC-7 after switching get the title of page
        driver.navigate().to("https://www.google.com/");
        String CurrentUrl = driver.getTitle();
        System.out.println(CurrentUrl);
      //8. TC-8 switch from 1st window to 0th window
        driver.switchTo().window(MainWindow);
        Thread.sleep(5);
       //driver.close();
       driver.quit();
	}

}
