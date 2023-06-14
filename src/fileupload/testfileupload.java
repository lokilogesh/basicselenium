package fileupload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testfileupload {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://triotendtech.in/treecutting/documents.html");
		
		WebElement btn=driver.findElement(By.cssSelector("input#picture"));
		
		Actions act=new Actions(driver);
		act.click(btn).build().perform();
		
		Runtime.getRuntime().exec("./src/fileupload/fileupload.exe"+" "+"D:\\Eclipse\\fileupload\\bug001.docx");


	}

}
