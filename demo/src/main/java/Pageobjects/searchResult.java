package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Action;

public class searchResult extends base
{
	@FindBy(xpath = "//img[@alt = 'Carrot - 1 Kg']")
	WebElement productresult;
	
	@FindBy(xpath = "//div[@class='product-action']//button[text()='ADD TO CART']")
	WebElement add;
	
	@FindBy(xpath = "//img[@alt = 'Cart']")
	WebElement shop;
	
	public searchResult()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean isproductavailable()
	{
		return Action.isDisplayed(driver, productresult);
		
	}
	
	public Addtocart addtocart()
	{
		Action.click(driver, add);
		Action.click(driver, shop);
		return new Addtocart();
	}

}
