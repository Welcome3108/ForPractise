package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uploadfile {

	private static final Thread Thread = null;

	public static void main(String[] args) throws InterruptedException, AWTException {
    ChromeDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']"))).build().perform();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("register_Layer")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='What is your name?']")).sendKeys("Sufiyan Attar",Keys.TAB,"sufiyanattar3108@gmail.com",Keys.TAB,"Sufiyan3108@",Keys.TAB,"7350749314");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h2[@class='main-3']")).click();
		
		Robot  r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		
	
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(4000);
		
		WebElement upload = driver.findElement(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']"));
		upload.click();
		upload.sendKeys("Resume.pdf");

	

	
	}

}
