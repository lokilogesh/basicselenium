package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssandxpath {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://triotend.com/tts/site/login");
	Thread.sleep(3000);
	
	
	//using single slash or absolute 
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/form/div[1]/input") ).sendKeys("absolute");
	Thread.sleep(3000);
	
    //using double slash 
	
	driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
	
	//single attributes
	
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("single attributes");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
	Thread.sleep(3000);
	
	//multiple attributes
	
	driver.findElement(By.xpath("//input[@placeholder='Username'][@id='email']")).sendKeys("multiple attributes");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
	Thread.sleep(3000);
	
	//And attributes
	
	
	driver.findElement(By.xpath("//input[@placeholder='Username' and @id='email']")).sendKeys("And attributes");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
	Thread.sleep(3000);
	
	//OR attributes
	
	driver.findElement(By.xpath("//input[@placeholder='Username' or @id='email']")).sendKeys("OR attributes");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
	Thread.sleep(3000);
	
	//Contains
	
	driver.findElement(By.xpath("//input[contains(@placeholder,'User')]")).sendKeys("contains");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
	Thread.sleep(3000);
	
	//starts with
	
	driver.findElement(By.xpath("//input[starts-with(@placeholder,'Us')]")).sendKeys("starts-with");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
	Thread.sleep(3000);
	
	//using text
	
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
	Thread.sleep(3000);
	
	
	}

}
