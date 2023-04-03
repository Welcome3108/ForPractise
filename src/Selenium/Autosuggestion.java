package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) {
		
			String Key="webdriver.chrome.driver";
			String Value="./chromedriver.exe";
			System.setProperty(Key, Value);
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			


	}

	}
