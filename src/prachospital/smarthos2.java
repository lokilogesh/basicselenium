package prachospital;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class smarthos2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://triotend.com/tts/site/login");
		
		driver.findElement(By.xpath("//input[@name='username'][@placeholder='Username']")).sendKeys("triotend@gmail.com");// using multiple attributes.
		
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("triotend");// using contains
		
		driver.findElement(By.xpath("//button[@type='submit' or @class='btn']")).click();// using or
		
		driver.findElement(By.xpath("//span[text()='Front Office']")).click();//using text
		
		driver.findElement(By.xpath("//a[starts-with(@data-toggle,'mod')]")).click();// using starts with
		
		driver.findElement(By.id("patient_id")).sendKeys("1234");//using id
	  
	    
	    driver.findElement(By.name("email")).sendKeys("logu@gmail.com");//using name
	    
	    
	    driver.findElement(By.name("message")).sendKeys("hii");//using name
	   
	    
	    driver.findElement(By.name("patient_name")).sendKeys("guru");//using name
	   
	    
	    driver.findElement(By.name("mobileno")).sendKeys("9500696565");//using name
	  

	}

}
