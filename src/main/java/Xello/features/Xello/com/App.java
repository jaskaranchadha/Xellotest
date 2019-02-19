package Xello.features.Xello.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
	public static WebDriver driver;
    public static void Initialization(){
    	System.setProperty("webdriver.chrome.driver", ".//BrowserDriver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:4200"); 
    }
}
