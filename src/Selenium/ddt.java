package Selenium;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ddt {

    	public static void main(String[] args) throws Throwable  {
    		
    	WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Step 1:Connect a java with data file.
		FileInputStream fis=new FileInputStream("OnlineData.xlxs.xlsx");
		
		//Step 2:Load the Data file to Java System.
		Properties pro=new Properties();
		pro.load(fis);
		
		//Step 3:Fetch the data fron he Data file.
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASS = pro.getProperty("password");
		
				
		//driver.get("https://demo.actitime.com/login.do");
		
		driver.get(URL);
		
	     
		
		
	    driver.findElement(By.id("username")).sendKeys(USERNAME);
    	driver .findElement(By.name("pwd")).sendKeys(PASS);
    	driver .findElement(By.id("loginButton")).click();

    	
    	Thread.sleep(4000);
    	 
    	driver.findElement(By.cssSelector("div.popup_menu_button_settings")).click();
    	driver.findElement(By.linkText("Types of Work")).click();
    	driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
    	
    	//Connect from Java to Excel Sheet.
    	FileInputStream efis=new FileInputStream("./OnlineData.xlxs.xlsx");
    	
    	//Load the Excel File in Java.
    	Workbook book=WorkbookFactory.create(efis);
    	
    	//Fetch the Required sheet
        Sheet sh=book.getSheet("Info");
        
        //Fetch the Required row.
        Row row=sh.getRow(0);
        
        //Fetch the Required the cell.
        Cell cell=row.getCell(0);
        
        //Fetch the excel Data
        String ExcelData = cell.getStringCellValue();
        
        driver.findElement(By.name("name")).sendKeys(ExcelData);
        
        
    	
    	
    	
    	
    	
	}

}
