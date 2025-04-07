package Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//
//1. TC-1 launch Chrome browser
//2. TC-2 go to test URL - https://www.google.com
//3. TC-3 maximize the browser window
//4. TC-4 get the URL of page
//5. TC-5 navigate to test URL - https://www.selenium.dev/
//6. TC-6 get the URL of page
//7. TC-7 navigate back to test URL - https://www.google.com
//8. TC-8 get the URL of page
//9. TC-8 navigate one step forward to test URL - https://www.selenium.dev/
//10. TC-9 get the URL of page
//11.TC-10 refresh the current page
//12. TC-11 get the URL of page
//13. TC-12 close the browser


public class chromeNavigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//1. TC-1 launch Chrome browser
		WebDriver driver = new ChromeDriver();
		//2. TC-2 go to test URL - https://www.google.com
		driver.get("https://www.google.com/");
		//3. TC-3 maximize the browser window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//4. TC-4 get the URL of page
		String url1 =driver.getCurrentUrl();
		System.out.println(url1);
		Thread.sleep(5000);
		//5. TC-5 navigate to test URL - https://www.selenium.dev/
		driver.navigate().to(" https://www.selenium.dev/");
		Thread.sleep(5000);
		//6. TC-6 get the URL of page 
		String url2 =driver.getCurrentUrl();
		System.out.println(url2);
		//7. TC-7 navigate back to test URL - https://www.google.com
		driver.navigate().back();
		Thread.sleep(5000);
		//8. TC-8 get the URL of page 
		String url3 =driver.getCurrentUrl();
		System.out.println(url3);
		//9. TC-9 navigate one step forward to test URL - https://www.selenium.dev/
		driver.navigate().forward();
		Thread.sleep(5000);
		//10. TC-10 get the URL of page
		String url4 =driver.getCurrentUrl();
		System.out.println(url4);
		//11.TC-11 refresh the current page
		driver.navigate().refresh();
		Thread.sleep(5000);
		//12. TC-12 get the URL of page
		String url5 =driver.getCurrentUrl();
		System.out.println(url5);
		Thread.sleep(5000);
		//13. TC-13 close the browser
		driver.quit();

	}

}
