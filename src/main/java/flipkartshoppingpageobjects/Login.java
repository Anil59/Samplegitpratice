package flipkartshoppingpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver ldriver;
	
	public Login(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	
	@FindBy(xpath = "//span[text()='Enter Email/Mobile number']//ancestor::form//input[1]")
	WebElement UserName;

	@FindBy(xpath ="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']/span[text()='Login']")
	WebElement submitbutton;
	
	public void setusername(String username)
	{
		UserName.sendKeys(username);
		
	}
	
	public void setpassword(String Password)
	{
		password.sendKeys(Password);
		
	}
	 public void submitbutton()
	 {
		 submitbutton.click();
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
