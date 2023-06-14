package Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basicbrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//enter url
		
		driver.get("http://triotend.com/tts/site/login");
		
		Thread.sleep(3000);
		
		//navigate 
		
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(3000);
		
		//back
		driver.navigate().back();
		Thread.sleep(3000);
		
		//forward
		driver.navigate().forward();
		Thread.sleep(3000);
		//refresh
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		//minimize
		driver.manage().window().minimize();
		Thread.sleep(3000);
		//maximize
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//resize
		
		Dimension d=new Dimension(730, 1080);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		//close
		
		driver.close();
	}
	

}
