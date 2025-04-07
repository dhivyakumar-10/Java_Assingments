package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Automate Facebook Registration Page using Direct Locator's in Chrome
//Browser https://www.facebook.com/
//2. Automate dropdowns part of Facebook Registration Page using Direct
//Locator's in Firefox Browser- https://www.facebook.com/

public class facebookLPdirectlocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//T1-Launch browser
		WebDriver driver = new ChromeDriver();
		//T2-Launch Url
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//T3-Create account btn
		driver.findElement(By.linkText("Create new account")).click();
		//T4- Enter firstname
		driver.findElement(By.name("firstname")).sendKeys("Dhivya");
		System.out.println("Firstname entered successfully");
		//T5-Enter Surname
		driver.findElement(By.name("lastname")).sendKeys("Dharshini");
		System.out.println("Surname entered successfully");
		//T6- Enter date of birth 
		driver.findElement(By.name("birthday_day")).sendKeys("10");
		driver.findElement(By.name("birthday_month")).sendKeys("April");
		driver.findElement(By.name("birthday_year")).sendKeys("2001");
		System.out.println("DOB entered successfully");
		//T7 - Select Gender
		driver.findElement(By.className("_8esa")).click();
		System.out.println("Gender entered successfully");
	    //T8 - ENter Mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9080283476");
		System.out.println("Mobilenumber entered successfully");
		//T9 - Enter password
		driver.findElement(By.id("password_step_input")).sendKeys("Dhivya@01");
		System.out.println("password entered successfully");
		//T10-Signup
		try{
			driver.findElement(By.name("websubmit")).click();
			System.out.println("successfully signed up ");
		}
		catch(Exception e)  {
			System.out.println("Not signed up ");
		}
		
		driver.quit();
		
	}
}
