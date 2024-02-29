package Pageobjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import common.Action;

public class base 
{
	public static Properties prop;
	public static WebDriver driver;
	
	@BeforeTest
	public void loadConfig()
	{
		try
		{
			prop = new Properties();
			System.out.println("super constrictor invoked");
			FileInputStream fis = new FileInputStream("/Users/lakshmianirudha/eclipse-workspace/demo/Configuration/config.properties");
			prop.load(fis);
			System.out.println("driver:" +driver);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void launchApp()
	{
		String browserName = prop.getProperty("browser");
		
		if(browserName.contains("chrome"))
		{
			driver = new ChromeDriver();
			
		}else if(browserName.contains("edge"))
		{
			driver = new FirefoxDriver();
		}
		Action.implicitwait(driver, 20);
		Action.pageloadtimeout(driver, 30);
		driver.get(prop.getProperty("url"));
	}
	
	
	
}
