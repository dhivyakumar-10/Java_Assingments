package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

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

public class windowsTab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        System.out.println(title);
        //driver.findElement(By.partialLinkText("knowmore")).click();
       // //System.out.println(knowmore);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://www.google.com/");
        String CurrentUrl = driver.getTitle();
        System.out.println(CurrentUrl);
       //driver.close();
       driver.quit();
	}

}
