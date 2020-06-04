package com.flipkartshopping.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import flipkartshoppingpageobjects.Login;
import flipkartshoppingpageobjects.SreachForMobileModel;

public class TC_LoginMethod extends Baseclass{
		
	@Test(priority = 1)
	public void login() throws IOException, InterruptedException
	{
		Login loginpage = new Login(driver);
		
		loginpage.setusername(username);
		logger.info("Entering the username");
		loginpage.setpassword(password);
		logger.info("Entering the password");
		loginpage.submitbutton();
			
		
		if(driver.getTitle().equals("flipkart.com"))
		{
			Assert.assertTrue(true);
			logger.info("Login to application successfull");
			
		}
		else
		{
			capturescreen(driver, "login");
			Assert.assertTrue(false);
			logger.info("Login to application not successfull");
		}	
		
		
	
	}

	@Test(priority = 2,invocationCount = 10)
	public void electronics() throws InterruptedException
	{
		
		SreachForMobileModel mobilelist = new SreachForMobileModel(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Anil']")));
			
		
				mobilelist.Serachbar("Mobile");
				
				logger.info("Enter Mobile text in serach input");
				
				mobilelist.Serachbaricon();
				
				logger.info("Click on serach Icon");
				
				Thread.sleep(9000);
				
				//List<WebElement> list = driver.findElements(By.xpath("//a[@class='_31qSD5']"));
				
				List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'_3wU53n')]"));
					
				Iterator<WebElement> li =  list.iterator();
				
				while(li.hasNext())
				{
					WebElement listvalue = li.next();
					
					logger.info(listvalue.getText());
					
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
	

