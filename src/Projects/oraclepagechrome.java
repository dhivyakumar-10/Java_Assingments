package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class oraclepagechrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		//Launch url
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		//maximise the window 
		driver.manage().window().maximize();
		//Enter Email address 
		driver.findElement(By.id("sView1:r1:0:email::content")).sendKeys("dhivya01@gamil.com");
		//Enter Password
		driver.findElement(By.id("sView1:r1:0:password::content")).sendKeys("Dharshini@2001");
		//Enter re password
		driver.findElement(By.id("sView1:r1:0:retypePassword::content")).sendKeys("Dharshini@2001");
		//Select Country 
		driver.findElement(By.id("sView1:r1:0:country::content")).sendKeys("india");
		//Enter firstname
		driver.findElement(By.name("sView1:r1:0:firstName")).sendKeys("dhivya");
		//Enter Lastname
		driver.findElement(By.name("sView1:r1:0:lastName")).sendKeys("dharshini");
		//Enter JobTitle
		driver.findElement(By.name("sView1:r1:0:jobTitle")).sendKeys("Testing");
		//Enter phone no 
		driver.findElement(By.name("sView1:r1:0:workPhone")).sendKeys("8549612325");
		//Enter Company Name
		driver.findElement(By.name("sView1:r1:0:companyName")).sendKeys("Kultivate");
		//Enter Address
		driver.findElement(By.id("sView1:r1:0:address1::content")).sendKeys("123,kulll");
		//Enter city 
		driver.findElement(By.id("sView1:r1:0:city::content")).sendKeys("Karur");
		//Enter state
		driver.findElement(By.id("sView1:r1:0:state")).sendKeys("Tamilnadu");
		//Enter ZipCode
		driver.findElement(By.id("sView1:r1:0:postalCode::content")).sendKeys("6401014");
		//close the browser
		driver.quit();
	}

}
