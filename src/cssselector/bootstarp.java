package cssselector;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bootstarp {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();;
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("tex");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		List<WebElement>options=driver.findElements(By.cssSelector("ul.G43f7e>li"));
		
	     for (WebElement e2 : options) {
			
			  System.out.println(e2.getText());
			  
			if(e2.getText().equals("text")) {
				
				e2.click();
				break;
			}
			
		}
		

	}

}
