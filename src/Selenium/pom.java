package Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class pom {

	
		
		ChromeDriver driver=new ChromeDriver();
		
		@FindBy(id="username")
		private WebElement usertextfield;
		
		@FindBy(name="pwd")
		private WebElement passwordtextfield;
		
		@FindBy(id="loginbutton")
        private WebElement loginButton;
		

       //getters methods
		
		public WebElement getUsertextfield() {
			return usertextfield;
		}

		public WebElement getPasswordtextfeild() {
			return passwordtextfield;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}
		
		//Business Logic
		
		public void logintoApp(String username,String passsword)
		{
			usertextfield.sendKeys(username);
			passwordtextfield.sendKeys(passsword);
			loginButton.click();
			
		}
		
		
		
		
	}





