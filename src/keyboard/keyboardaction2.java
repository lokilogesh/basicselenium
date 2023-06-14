package keyboard;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardaction2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://triotend.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(4000);
		
		

	}

}
