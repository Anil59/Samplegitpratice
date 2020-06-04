package com.flipkartshopping.testcases;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.utils.FileUtil;
import com.flipkartshopping.utlities.Readconfig;
import com.gargoylesoftware.htmlunit.WebConsole.Logger;

public class Baseclass {
	
	Readconfig readconfig = new Readconfig();
			
	public String url =  readconfig.getApplicationURL();
	public String username = readconfig.getapplicationusername();
	public String password = readconfig.getapplicationpassword();
	public static WebDriver driver;
	public static org.apache.log4j.Logger logger;
	
	@Parameters("broswer")
	@BeforeClass
	public void setup(String broswer)
	{
		logger = org.apache.log4j.Logger.getLogger("Parabank");
		PropertyConfigurator.configure("log4j.properties");
		
		if(broswer.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.Chromepath());
			driver=new ChromeDriver();
		}
		else if(broswer.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.Firefoxpath());
			driver=new ChromeDriver();
		}
		
		driver.get(url);	
		
	}
	
	/**
	 * @param driver
	 * @param tname
	 * @throws IOException 
	 */
	@AfterClass
	public void capturescreen(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source,target);
		logger.info("Screenshot added suucessfully");
				
		
	}
	public void teardown()
	{
		
		driver.quit();
	}
	
	

}
