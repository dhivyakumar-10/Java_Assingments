package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookusingrelativexpathEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//T1-Launch browser
		WebDriver driver = new EdgeDriver();
		//T2-Launch Url
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//T3-Create account btn
		driver.findElement(By.xpath("//a[text()='Create new account']	")).click();
		//T4- Enter firstname
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dhivya");
		System.out.println("Firstname entered successfully");
		//T5-Enter Surname
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dharshini");
		System.out.println("Surname entered successfully");
		//T6- Enter date of birth 
		driver.findElement(By.xpath("//select[@id='day']//option[10]")).click();
		driver.findElement(By.xpath("//select[@id='month']//option[4]")).click();
		driver.findElement(By.xpath("//select[@id='year']//option[25]")).click();
		System.out.println("DOB entered successfully");
		//T7 - Select Gender
		driver.findElement(By.xpath("//label[text()='Female']//input")).click();
		System.out.println("Gender entered successfully");
	    //T8 - ENter Mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9080283476");
		System.out.println("Mobilenumber entered successfully");
		//T9 - Enter password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Dhivya@01");
		System.out.println("password entered successfully");
		//T10-Signup
		try{
			driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			System.out.println("successfully signed up ");
		}
		catch(Exception e)  {
			System.out.println("Not signed up ");
		}
		
		driver.quit();
		
	}
	}


