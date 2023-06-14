package alerttest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class pracalert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.cssSelector("button#alertButton")).click();
		Thread.sleep(4000);
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		if(alt.getText().equals("You clicked a button")) {
			alt.accept();
			System.out.println("clicked");
		}else{
			alt.dismiss();
			
		}
		

}
}