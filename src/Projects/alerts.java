package Projects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

        try {
            // Step 2: Open test URL
            driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
            driver.manage().window().maximize();

            // Step 3: Switch into the iframe
            //driver.switchTo().frame("iframeResult");
           

            // Step 4: Click on "Try it" Button
            WebElement tryItButton = driver.findElement(By.xpath("//button[text()='Try it']"));
            tryItButton.click();

            // Step 5: Handle JavaScript Prompt Alert and send text
            Alert alert = driver.switchTo().alert();
            String inputText = "John Doe";
            alert.sendKeys(inputText);
            Thread.sleep(1000); // Wait for input to process

            // Step 6: Accept the Alert
            alert.accept();

            // Step 7: Get the text displayed on the page after alert is accepted
            WebElement resultText = driver.findElement(By.id("demo"));
            System.out.println("Displayed Text on Page: " + resultText.getText());

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Step 8: Close browser
            driver.quit();
        }
    }
	}


