package utilPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AddCandidatePage;
import pages.AddJobPage;
import pages.AgenciesPage;
import pages.DashboardPage;
import pages.EditJobPage;
import pages.EmployersPage;
import pages.LoginPage;
import pages.ShareWithAgencyPage;
import pages.ShareWithTeamPage;
import pages.TeamPage;
import pages.WorkbenchPage;



public class baseclass {
	
	public static WebDriver driver;
	public static Properties prop;
	public static LoginPage loginpage;
	public static DashboardPage dashboardpage;
	public static WorkbenchPage workbenchpage;
	public static AddJobPage addjobpage;
	public static EmployersPage employerspage;
	public static AgenciesPage agenciespage;
	public static ShareWithAgencyPage sharewithagencypage;
	public static AddCandidatePage addcandidatepage;
	public static ShareWithTeamPage sharewithteampage;
	public static TeamPage teampage;
	public static EditJobPage editjobpage;
	
	
	public baseclass() {
		
		try 
		{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\HireXpert\\HireXpert\\src\\main\\java\\configurations\\config.properties");
			prop.load(fis);	
		}
		catch(IOException e) {
			e.getMessage();	
		}
	}
	
	public static void initialization() {
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(utilclass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
		driver.get(prop.getProperty("url"));
		
		loginpage = new LoginPage();
		dashboardpage = new DashboardPage();
		workbenchpage = new WorkbenchPage();
		addjobpage = new AddJobPage();
		employerspage = new EmployersPage();
		agenciespage = new AgenciesPage();
		sharewithagencypage = new ShareWithAgencyPage();
		addcandidatepage = new AddCandidatePage();
		sharewithteampage = new ShareWithTeamPage();
		teampage = new TeamPage();
		editjobpage = new EditJobPage();
	}
	

}
