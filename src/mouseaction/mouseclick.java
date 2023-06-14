package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseclick {

	public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	
	driver.get("http://triotendtech.in/treecutting/documents.html");
	
	WebElement btn=driver.findElement(By.cssSelector("input#picture"));
	
	Actions act=new Actions(driver);
	act.click(btn).build().perform();

	}

}
