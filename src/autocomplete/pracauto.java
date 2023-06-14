package autocomplete;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pracauto {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("tea");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		List<WebElement>e1=driver.findElements(By.cssSelector("ul.G43f7e>li"));
		for (WebElement wwf : e1) {
			System.out.println(wwf.getText());
			if (wwf.getText().equals("teams login")) {
				wwf.click();
			break;
			
			}
		
	

	}}}


