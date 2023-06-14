package cssselector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selector1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://triotend.com/tts/site/login");
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("triotend@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("triotend");
		driver.findElement(By.cssSelector("button.btn")).click();
		
		//Direct child
		
		driver.findElement(By.cssSelector("ul.sidebar-menu>li")).click();
        Thread.sleep(3000);
		//nth child
		
		//driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(9)")).click();
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//subchild 
	    
	    //driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(10)")).click();
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//driver.findElement(By.cssSelector("ul.treeview-menu>li:nth-child(2)")).click();
		//Thread.sleep(3000);
		
		//task clicking complain
		
		driver.findElement(By.cssSelector("div.box-tools>a:nth-child(6)")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("a.btn-primary")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("nehru");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[name='contact']")).sendKeys("66688484");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("textarea#description[name='description']")).sendKeys("help");
		Thread.sleep(3000);
	}

}
