package cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selector {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.findElement(By.cssSelector("span.hm-icon-label")).click();
	driver.findElement(By.cssSelector("a[data-menu-id='10']")).click();
	driver.findElement(By.cssSelector("a[href='/gp/browse.html?node=1968093031&ref_=nav_em_sbc_mfashion_shirts_0_2_10_4']")).click();
	//driver.findElement(By.cssSelector("
    driver.findElement(By.cssSelector("div[title='Amazon Brand - Inkast Denim Co. Men Casual Shirt'")).click();

	
	//Tag and id
	
	//driver.findElement(By.cssSelector("input#email")).sendKeys("TAG and ID");
	//Thread.sleep(3000);
	//driver.findElement(By.cssSelector("input#email")).clear();
	
	//Tag and class
	
	//driver.findElement(By.cssSelector("input.form-username")).sendKeys("Tag and class");
	//Thread.sleep(3000);
	//driver.findElement(By.cssSelector("input#email")).clear();	
	
	//Tag and attributes
	
	//driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Tag and attributes");
	//Thread.sleep(3000);
	//driver.findElement(By.cssSelector("input[placeholder='Username']")).clear();
	
	//Tag,class and attributes
	
	//driver.findElement(By.cssSelector("input.form-username[placeholder='Username']")).sendKeys("Tag,class and attributes");
	//Thread.sleep(3000);
	//driver.findElement(By.cssSelector("input.form-username[placeholder='Username']")).clear();
	
	//Tag,id and attributes
	
	//driver.findElement(By.cssSelector("input#email[placeholder='Username']")).sendKeys("Tag,id and attributes");
	//Thread.sleep(3000);
	//driver.findElement(By.cssSelector("input#email[placeholder='Username']")).clear();
	
	//Starts with
	
	//driver.findElement(By.cssSelector("input#email[placeholder^='Use']")).sendKeys("Starts-with");
	//Thread.sleep(3000);
	//driver.findElement(By.cssSelector("input#email[placeholder^='Use']")).clear();
	
	//Ends with
	
	//driver.findElement(By.cssSelector("input#email[placeholder$='ame']")).sendKeys("Ends-with");
	//Thread.sleep(3000);
	//driver.findElement(By.cssSelector("input#email[placeholder$='ame']")).clear();
	
	//Contains
	//driver.findElement(By.cssSelector("input#email[placeholder*='ame']")).sendKeys("Contains");
	//Thread.sleep(3000);
	//driver.findElement(By.cssSelector("input#email[placeholder*='ame']")).clear();
	}

}
