package printlink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class printllink {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.selenium.dev/");
		List<WebElement>link=driver.findElements(By.tagName("a"));
		for (WebElement e2 : link) {
			
			System.out.println(e2.getText());
			
			System.out.println(e2.getAttribute("href"));
			
		}
		
		

	}

}
