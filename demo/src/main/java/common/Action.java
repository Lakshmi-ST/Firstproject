package common;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pageobjects.base;

public class Action extends base 
{
	public static void scroll(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoview();", ele);
		
	}
	
	public static void click(WebDriver Idriver, WebElement locatorName)
	{
		Actions act = new Actions(driver);
		act.moveToElement(locatorName).click().build().perform();
	}
	
	public static  boolean findelement(WebDriver Idriver,WebElement ele)
	{
		boolean flag = false;
		try
		{
			ele.isDisplayed();
			flag = true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(flag)
			{
				System.out.println("Successfully found element at");
			}
			else
			{
				System.out.println("unable to locate element");
			}
		}
		return flag;
		
	}
	
	public static boolean isSelected(WebDriver Idriver, WebElement ele)
	{
		boolean flag = false;
		flag = findelement(Idriver, ele);
		if(flag)
		{
			flag =ele.isSelected();
			if(flag)
			{
			System.out.println("Element is selected");
			
			}
			else
			{
				System.out.println("Element is not selected");
			}
		}
		return flag;
	}
	
	public static boolean isEnabled(WebDriver Idriver, WebElement ele)
	{
		boolean flag = false;
		flag = findelement(Idriver, ele);
				if(flag)
				{
					flag  = ele.isEnabled();
					if(flag)
					{
						System.out.println("Element is enabled");
					}
					else
					{
						System.out.println("Element is not enabled");
					}
					
				}
		return flag;
	}
	
	public static boolean isDisplayed(WebDriver Idriver, WebElement ele)
	{
		boolean flag = false;
		flag = findelement(Idriver, ele);
				if(flag)
				{
					flag  = ele.isDisplayed();
					if(flag)
					{
						System.out.println("Element is displayed");
					}
					else
					{
						System.out.println("Element is not displayed");
					}
					
				}
		return flag;
	}
	
	public static boolean isCheckboxEnabled(WebDriver driver, WebElement checkbox)
	{
	    boolean flag = false;
	    flag = findelement(driver, checkbox);
	    if (flag) 
	    {
	        flag = checkbox.isEnabled();
	        if (flag) 
	        {
	            System.out.println("Checkbox is enabled");
	        } 
	        else 
	        {
	            System.out.println("Checkbox is not enabled");
	        }
	    }
	    return flag;
	}

	public static boolean type(WebElement ele, String text)
	{
		boolean flag = false;
		try
		{
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			flag = true;
			
		}
		catch(Exception e)
		{
			System.out.println("Location not found");
			flag  = false;
			
		
		}
		finally
		{
			if(flag)
			{
				System.out.println("Value entered");
			}
				else
				{
					System.out.println("Value not entered");
				}
			}
		
		return flag;
	}
	
	public static boolean implicitwait(WebDriver Idriver, int seconds)
	{
	try
	{
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return false;
		
	}
		
	}
	
	public static boolean pageloadtimeout(WebDriver Idriver, int seconds)
	{
	try
	{
	
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		return true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return false;
		
	}
		
	}
	
	public static boolean selectBysendkeys(WebElement ele, String value)
	{
		boolean flag = false;
		try
		{
			ele.sendKeys(value);
			flag = true;
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
			
		}
		finally
		{
			if(flag)
			{
				System.out.println("selected value from dropdown");
				
			}else
			{
				System.out.println("Value not selected from dropdown");
			}
		
		}
	}
		
		public static boolean selectByIndex(WebElement element, int index)
		{
			boolean flag = false;
			try
			{
				Select s = new Select(element);
				s.selectByIndex(index);
				flag = true;
				return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
				
			}
			finally
			{
				if(flag)
				{
					System.out.println("selected value from Index");
					
				}else
				{
					System.out.println("Value not selected from Index");
				}
			
			}
			
		}
		
		public static boolean selectByValue(WebElement element, String value)
		{
			boolean flag = false;
			try
			{
				Select s = new Select(element);
				s.selectByValue(value);
				flag = true;
				return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
				
			}
			finally
			{
				if(flag)
				{
					System.out.println("selected value using value");
					
				}else
				{
					System.out.println("Value not selected using value");
				}
			
			}
			
		}
		
		public static boolean selectByVisibletext(WebElement element, String text)
		{
			boolean flag = false;
			try
			{
				Select s = new Select(element);
				s.selectByVisibleText(text);
				flag = true;
				return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
				
			}
			finally
			{
				if(flag)
				{
					System.out.println("selected value using visibletext");
					
				}else
				{
					System.out.println("Value not selected using visibletext");
				}
			
			}
			
		}
	    
		public static boolean JSClick(WebDriver driver, WebElement ele)
		{
			boolean flag = false;
			try
			{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click;", ele);
			flag = true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
			finally
			{
				if(flag)
				{
					System.out.println("Click done using JS");
					
				}
				else if(!flag)
				{
					System.out.println("Click not done using JS");
				}
			}
			return flag;
			
			
		}
	
		
}
