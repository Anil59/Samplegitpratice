package com.flipkartshopping.testcases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import flipkartshoppingpageobjects.SreachForMobileModel;

public class TC_SreachForMoble extends Baseclass {
	
	@Test
	public void electronics() throws InterruptedException
	{
		
		SreachForMobileModel mobilelist = new SreachForMobileModel(driver);
		
		Thread.sleep(9000);		
		
		mobilelist.Serachbar("Mobile");
		
		mobilelist.Serachbaricon();
		
		List<WebElement> list = driver.findElements(By.xpath("//a[@class='_31qSD5']"));
		
		Iterator<WebElement> li =  list.iterator();
		
		while(li.hasNext())
		{
			WebElement listvalue = li.next();
			
			listvalue.click();
			
			//System.out.println("Model Name ---------->"+driver.findElement(By.xpath("//span[@class='_35KyD6']")).getText());
			
			//System.out.println("Model Price---------->"+driver.findElement(By.xpath("//div[@class='_1vC4OE _3qQ9m1']")).getText());
			
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			
			driver.switchTo().window(tabs.get(1));
			
			driver.close();
			
			driver.switchTo().window(tabs.get(0));

			
		}	
		
	}

}
