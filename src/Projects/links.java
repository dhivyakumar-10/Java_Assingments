package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class links {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch the browser 
		WebDriver driver= new ChromeDriver();
		//launch the url 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		//find all the links 
	     List<WebElement> links = driver.findElements(By.tagName("a"));
	     System.out.println(links);

	}

}
