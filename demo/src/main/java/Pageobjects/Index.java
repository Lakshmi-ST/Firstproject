/**
 * 
 */
package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Action;

public class Index extends base
{
	
	@FindBy(xpath = "//div[contains(text(),'GREEN')]")
	WebElement logoname;
	
	@FindBy(xpath = "//input[@type = 'search']")
	WebElement searchbox;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	WebElement searchicon;
	
	public Index()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateTitle()
	{
		String expected = logoname.getText();
		System.out.println(expected);
	}
	
	public searchResult searchproduct(String prname)
	{
		Action.type(searchbox, prname);
		Action.click(driver, searchicon);
		return new searchResult();
	}
	
	
	
	
	
	
}
