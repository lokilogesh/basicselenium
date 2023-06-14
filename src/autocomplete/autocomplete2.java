package autocomplete;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autocomplete2 {
       public static void main(String[]args) {
    	   WebDriverManager.edgedriver().setup();
    	   WebDriver driver=new EdgeDriver();
    	   driver.get("https://www.google.co.in/");
    	   driver.findElement(By.cssSelector("input[name='q']")).sendKeys("loki");
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    	   List<WebElement>options=driver.findElements(By.cssSelector("ul.G43f7e>li"));
    	   for (WebElement e1 : options) {
    		   if(e1.getText().equals("loki vegetable")) {
    			   e1.click();
    		   }
			
		}
	
		
		
		
}}
