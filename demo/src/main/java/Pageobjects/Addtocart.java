package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Action;

public class Addtocart extends base
{
	
		@FindBy(xpath = "//button[text() ='PROCEED TO CHECKOUT']")
		WebElement proceed;
		
		@FindBy(xpath = "//button[text() ='Place Order']")
		WebElement placeorder;
		
		@FindBy(xpath = "//select[@style='width: 200px;']")
		WebElement dropdown;
		
		@FindBy(xpath = "//input[@type = 'checkbox']")
		WebElement cbox;
		
		@FindBy(xpath = "//button[text()= 'Proceed']")
		WebElement proceedfinal;
		
		public Addtocart()
		{
			PageFactory.initElements(driver, this);
			
		}
		
		public void proceedclick()
		{
			Action.click(driver, proceed);
		}
		
		public void placeorder()
		{
			Action.click(driver, placeorder);
		}
		
		
		public void selectcountry()
		{
			Action.selectByVisibletext(dropdown, "India");
			
		}
		
		public void selectcbox()
		{
			Action.isCheckboxEnabled(driver, cbox);
			
		}
		
		public void last()
		{
			Action.click(driver, proceedfinal);
		}
		
		
		
		
		

}
