package prachospital;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class smarthos {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://triotend.com/tts/site/login");
	
	driver.findElement(By.xpath("//input[@name='username'][@placeholder='Username']")).sendKeys("triotend@gmail.com");// using multiple attributes.
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("triotend");// using contains
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@type='submit' or @class='btn']")).click();// using or
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//span[text()='Front Office']")).click();//using text
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[starts-with(@data-toggle,'mod')]")).click();// using starts with
	Thread.sleep(3000);
	
    
    driver.findElement(By.id("patient_id")).sendKeys("1234");//using id
    Thread.sleep(3000);
    
    driver.findElement(By.name("email")).sendKeys("logu@gmail.com");//using name
    Thread.sleep(3000);
    
    driver.findElement(By.name("message")).sendKeys("hii");//using name
    Thread.sleep(3000);
    
    driver.findElement(By.name("patient_name")).sendKeys("guru");//using name
    Thread.sleep(3000);
    
    driver.findElement(By.name("mobileno")).sendKeys("9500696565");//using name
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/div/button")).click();//using xpath
    Thread.sleep(3000);
    
	}

}
