package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Enter url
		
		driver.get("http://triotend.com/tts/site/login");
	Thread.sleep(3000);
		
		//by id
		
		driver.findElement(By.id("email")).sendKeys("By id");
		Thread.sleep(3000);
		
		//by classname
		
		driver.findElement(By.id("password")).sendKeys("By pass");
		Thread.sleep(3000);
		
		//by tag name
		
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		
		//by name
		
		driver.findElement(By.name("username")).sendKeys("By name");
		Thread.sleep(3000);
		
		//by link text
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(3000);
		
		//by css selector
		
		driver.findElement(By.cssSelector("#form-username")).sendKeys("By selector");
		Thread.sleep(3000);
		
		//by x path
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button")).click();
		Thread.sleep(3000);
		
		//by partial link path
		
		driver.findElement(By.partialLinkText("Admin ")).click();
		Thread.sleep(3000);
		
		
		
	

	}

}
