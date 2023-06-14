package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pracselector {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://triotend.com/tts/site/login");
	
	driver.findElement(By.id("password")).sendKeys("pass");
	
	driver.findElement(By.className("form-username")).sendKeys("user");
	
	driver.findElement(By.tagName("button")).click();
	
	driver.findElement(By.className("forgot")).click();
	
	driver.findElement(By.xpath("//*[@id=\"form-username\"]")).sendKeys("loki");
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button")).click();
	
	}

}
