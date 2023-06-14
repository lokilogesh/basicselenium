package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firefox {

	public static void main(String[] args) {
	
		WebDriverManager.firefoxdriver();
		
		WebDriver driver=new FirefoxDriver();

	}

}
