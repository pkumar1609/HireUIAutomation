package com.hirexpert.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hirexpert.qa.pages.HomePage;
import com.hirexpert.qa.pages.WorkbenchPage;
import com.hirexpert.qa.util.Testutil;
import com.sun.org.apache.xpath.internal.operations.String;

public class Testbase {
	
	public static WebDriver driver ; 
	public static Properties prop ;
	public static HomePage hp ;
	public static WorkbenchPage wp ;
	
	
	
	public Testbase () {  //Constructor
		
		//Read the properties file
		
		try {
			
			prop = new Properties ();
			FileInputStream ip = new FileInputStream ("C:\\Users\\TLP32\\eclipse-workspace\\AutomationHirexpert\\src\\main\\java\\com\\hirexpert\\qa\\"
					+ "configuration\\config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization () {
	java.lang.String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\TLP32\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			driver = new ChromeDriver();
			
		}if(browsername.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\TLP32\\GeckoDriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		    driver = new FirefoxDriver();
	}
	
        driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies(); 
		
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS); 
		
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS); 
		
		driver.get(prop.getProperty("url"));
		
		 hp = new HomePage();
		 
		 wp = new WorkbenchPage();
	}
}

