package cssselector;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hotstar {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
	
	driver.findElement(By.cssSelector("button#btndropdown")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.cssSelector("button.close-dropdown")).click();
	
	driver.findElement(By.cssSelector("button#btndropdown")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	
	
	
	List<WebElement>options=driver.findElements(By.cssSelector("ul.dropdown-menu>li>label.radio-btn"));
	
   for (WebElement e1 : options) {
	   System.out.println(e1.getText());
	   if (e1.getText().equals("HTML"))
	   {
		e1.click();   
		
	}
	   else if (e1.getText().equals("CSS"))
	   {
		e1.click();   
		
	}
	
}

	}

}
