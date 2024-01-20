package instillPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testFofInstill {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//This sets up the updated chromedriver
		WebDriverManager.chromedriver().setup();
		
		//This instantiates and object of Chromedriver
		WebDriver driver = new ChromeDriver();
		
		
		//This calls the url, this can be parameterized if a frame work was used
		driver.get("https://www.canva.com/en_gb/");
		

		
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		
		
		
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//span[text()='Continue with email']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[type*='text']")).sendKeys("hyy@gmail.com");
		driver.findElement(By.cssSelector("button[type*='submit']")).click();
		driver.findElement(By.cssSelector("input[autocomplete*='name']")).sendKeys("Gman");
		driver.findElement(By.xpath("//span[text()='Create your account']")).click();
		
		//This retrieves a text to check that we have gotten to a page the requires a code input
		String text = "Code";
		String bodyText = driver.findElement(By.xpath("//span[text()='Code']")).getText();
		Assert.assertTrue(bodyText.contains(text));
		
		
		
	}

}
