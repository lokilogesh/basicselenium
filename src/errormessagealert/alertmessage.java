package errormessagealert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertmessage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		
		driver.findElement(By.cssSelector("button.btn")).click();
		WebElement error1=driver.findElement(By.xpath("//p[text()=Username field is required"));
		System.out.println(error1.isDisplayed());
		

	}

}
