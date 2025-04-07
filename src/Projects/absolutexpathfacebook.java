package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absolutexpathfacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//T1-Launch browser
				WebDriver driver = new ChromeDriver();
				//T2-Launch Url
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				//T3-Create account btn
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
				//T4- Enter firstname
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input")).sendKeys("Dhivya");
				System.out.println("Firstname entered successfully");
				//T5-Enter Surname
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("Dharshini");
				System.out.println("Surname entered successfully");
				//T6- Enter date of birth 
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div[2]/span/span/select[1]")).sendKeys("10");
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div[2]/span/span/select[2]")).sendKeys("April");
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div[2]/span/span/select[3]")).sendKeys("2001");
				System.out.println("DOB entered successfully");
				//T7 - Select Gender
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[1]/label")).click();
				System.out.println("Gender entered successfully");
			    //T8 - ENter Mobile number
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[6]/div/div[1]/input")).sendKeys("9080283476");
				System.out.println("Mobilenumber entered successfully");
				//T9 - Enter password
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[8]/div/div[1]/input")).sendKeys("Dhivya@01");
				System.out.println("password entered successfully");
				//T10-Signup
				try{
					driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
					System.out.println("successfully signed up ");
				}
				catch(Exception e)  {
					System.out.println("Not signed up ");
				}
				
				driver.quit();
	}

}
