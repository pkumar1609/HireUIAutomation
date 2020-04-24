package com.Hirexpert.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Hirexpert.pages.AgencyPage;
import com.Hirexpert.pages.EmployerPage;
import com.Hirexpert.pages.LoginPage;
import com.Hirexpert.pages.TaskPage;
import com.Hirexpert.pages.TeamPage;
import com.Hirexpert.pages.WorkbenchPage;

import cucumber.api.DataTable;

public class TestBase {
		public static Properties prop;
		public static WebDriver driver;
		public static LoginPage loginpage;
		public static TeamPage teampage;
		public static AgencyPage Agencypage;
		public static WebDriverWait wait;
		public static EmployerPage employerpage;
		public static TaskPage taskpage;
		public static ArrayList<String> ar= new ArrayList<String>();
		public static int size;
		public static Actions Action;
		public static WorkbenchPage workbenchpage;
		
		
			
			public  TestBase() throws IOException
			{

				try {
				prop= new Properties();
				FileInputStream ip = new  FileInputStream("C:\\Users\\TLP33\\eclipse-workspace\\HireXpert\\HireXpert\\src\\main\\java\\com\\hire\\qa\\config\\config.properties");
				prop.load(ip);
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}
				catch(IOException e)
				{
					e.printStackTrace();  
				}
				
			
			}
			public static void initizer()
			{
				String browser =prop.getProperty("browser");
				if(browser.equals("Chrome"))
				{ 
					System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
					driver= new ChromeDriver();
				}
				driver.get(prop.getProperty("url"));
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Testutils.implicitly_wait, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(Testutils.page_load_Timeout, TimeUnit.SECONDS);
				

			}
			
			
		}
		

			
			
		




