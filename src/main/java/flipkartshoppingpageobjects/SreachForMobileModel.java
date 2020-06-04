package flipkartshoppingpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SreachForMobileModel {
	
	WebDriver ldriver;
	
	public SreachForMobileModel(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
			
	}
	
	@FindBy(xpath = "//input[@name='q' and  @type = 'text']")
	WebElement Serachbar;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement SearchIcon;
	
	@FindBy(xpath = "//a[@class='_31qSD5']")
	WebElement pageonemobilelist;
	
	public void Serachbar(String input)
	{
		Serachbar.sendKeys(input);
		
	}
	
	public void Serachbaricon()
	{
		SearchIcon.click();
		
	}
	
	
	
	
	

}
