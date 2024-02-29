package Pagetest;

import javax.naming.directory.SearchResult;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.Addtocart;
import Pageobjects.Index;
import Pageobjects.base;
import Pageobjects.searchResult;

public class Logintest extends base
{
	Index index;
	searchResult search;
	Addtocart add;
	
	@BeforeTest
	public void setup()
	{
		launchApp();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void logintest()
	{
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		index = new Index();
		index.validateTitle();
		index.searchproduct("carrot");
		search = new searchResult();
		search.isproductavailable();
		search.addtocart();
		add = new Addtocart();
		add.proceedclick();
		add.placeorder();
		add.selectcountry();
		add.selectcbox();
		add.last();
		
		
		
		
		
	
		
	}

}
