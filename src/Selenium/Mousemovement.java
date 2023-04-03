package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']"))).build().perform();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("register_Layer")).click();
		
		//driver.findElement(By.xpath("//a[@title='Resume maker for freshers']")).click();
		
		
	}

}
