package pagesK;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AddCandidatePage;
import pages.AddJobPage;
import pages.AddQuestionaryPage;
import pages.AgenciesPage;
import pages.CandidateCardSectionPage;
import pages.CandidateDashboardPage;
import pages.CandidateUpdateProfilePage;
import pages.ChangePasswordPage;
import pages.Commonfunction;
import pages.DashboardPage;
import pages.EditCandidatePage;
import pages.EditJobPage;
import pages.EmployersPage;
import pages.ForgetPasswordPage;
import pages.HomePage;
import pages.InterviewsPage;
import pages.JobApplicationsPage;
import pages.JobBoardPage;
import pages.JobReviewPage;
import pages.LoginPage;
import pages.MarketPlacePage;
import pages.RegisterPage;
import pages.ScreeningPage;
import pages.ShareWithAgencyPage;
import pages.ShareWithTeamPage;
import pages.TaskPage;
import pages.TeamPage;
import pages.UpdateProfilePopupPage;
import pages.WorkbenchPage;
import pages.scheduleInterview;

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
	public static scheduleInterview scheduleinterviewpage;
	public static InterviewsPage interviewspage;
	public static CandidateUpdateProfilePage candidateupdateprofilepage;
	public static CandidateDashboardPage candidatedashboardpage;
	public static RegisterPage registerpage;
	public static EditCandidatePage editcandidatepage;
	public static AddQuestionaryPage addquestionarypage;
	public static ChangePasswordPage changepasswordpage; 
	public static UpdateProfilePopupPage updateprofilepopuppage;
	public static WebDriverWait wait;
	public static ArrayList<String> ar= new ArrayList<String>();
	public static int size;
	public static ArrayList<String> ar1= new ArrayList<String>();
	public JavascriptExecutor executor=(JavascriptExecutor)driver;
	public static Select select;
	public static TaskPage taskpage;
	public static MarketPlacePage marketplacepage;
	public static Commonfunction common;
	public static CandidateCardSectionPage candidatecardsectionpage;
	public static ScreeningPage screeningpage;
	public static HomePage homepage;
	public static JobBoardPage jobboardpage;
	public static JobApplicationsPage jobapplicationspage;
	public static JobReviewPage jobreviewpage;
	public static Actions Action;
	public static ForgetPasswordPage forgetpasswordpage;
	

	
	public baseclass() { 
		
		try 
		{ 
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\TLP33\\Documents\\GitHub\\HireUIAutomation\\HireXpertUIAutomation\\HireXpertUIAutomation\\src\\main\\java\\configurations\\config.properties");
			prop.load(fis);	
		}
		catch(IOException e) {
			e.getMessage();	
		}
	}
	
	public static void initialization() throws IOException {
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(utilclass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
		driver.get(prop.getProperty("url"));
//		driver.get("https://hiretest.txsas.com/#/home");
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
		scheduleinterviewpage = new scheduleInterview();
		interviewspage = new InterviewsPage();
		candidateupdateprofilepage = new CandidateUpdateProfilePage();
		candidatedashboardpage = new CandidateDashboardPage();
		registerpage = new RegisterPage();
		editcandidatepage = new EditCandidatePage();
		addquestionarypage = new AddQuestionaryPage();
		changepasswordpage = new ChangePasswordPage();
		updateprofilepopuppage = new UpdateProfilePopupPage();
		taskpage = new TaskPage();
		marketplacepage = new MarketPlacePage();
		common = new Commonfunction();
		candidatecardsectionpage = new CandidateCardSectionPage();
		screeningpage = new ScreeningPage();
		homepage = new HomePage();
		jobboardpage = new JobBoardPage();
		jobapplicationspage = new JobApplicationsPage();
		jobreviewpage=new JobReviewPage();
		Action = new Actions(driver);
		forgetpasswordpage=new ForgetPasswordPage();

	}
	

}
