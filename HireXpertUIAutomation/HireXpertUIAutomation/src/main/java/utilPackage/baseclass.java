package utilPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AddCandidatePage;
import pages.AddJobPage;
import pages.AddQuestionaryPage;
import pages.CandidateCardSectionPage;
import pages.CandidateDashboardPage;
import pages.CandidateUpdateProfilePage;
import pages.ChangePasswordPage;
import pages.Commonfunction;
import pages.CvStorePage;
import pages.DashboardPage;
import pages.EditCandidatePage;
import pages.EditJobPage;
import pages.ForgetPasswordPage;
import pages.HireExpressPage;
import pages.HomePage;
import pages.InterviewsPage;
import pages.InvoicePage;
import pages.JobApplicationsPage;
import pages.JobBoardPage;
import pages.JobReviewPage;
import pages.LoginPage;
import pages.ManageEmployee;
import pages.ManageEmployer;
import pages.ManageRecruitmentAgencies;
import pages.ManageVendor;
import pages.MarketPlacePage;
import pages.RegisterPage;
import pages.ScreeningPage;
import pages.ShareWithAgencyPage;
import pages.ShareWithTeamPage;
import pages.ShareWithVendorPage;
import pages.TaskManagementPage;
import pages.TaskPage;
import pages.UpdateProfilePopupPage;
import pages.WorkbenchPage;
import pages.scheduleInterview;

public class baseclass extends SuperBase{
	
	public static WebDriver driver;
	public static Properties prop;
	public static LoginPage loginpage;
	public static DashboardPage dashboardpage;
	public static WorkbenchPage workbenchpage;
	public static AddJobPage addjobpage;
	public static ShareWithAgencyPage sharewithagencypage;
	public static AddCandidatePage addcandidatepage;
	public static ShareWithTeamPage sharewithteampage;
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
	public static ArrayList<String> ar= new ArrayList<String>();
	public static int size;
	public static ArrayList<String> ar1= new ArrayList<String>();
	public static JavascriptExecutor executor;
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
	public static WebDriverWait explicitwait;
	public static CvStorePage cvstorepage;
	public static Robot rb;
	public static TaskManagementPage taskmanagementpage;
	public static InvoicePage invoicepage;
	public static DateTimeFormatter dtFormate;  
	public static LocalDateTime currentTime; 
	public static DesiredCapabilities caps;
	public static HireExpressPage hirexpresspage;
	public static ManageEmployee manageemployee;
	public static ManageRecruitmentAgencies managerecruitmentagencies;
	public static ManageEmployer manageemployer;
	public static ManageVendor managevendor;
	public static ShareWithVendorPage sharewithvendorpage;


	public baseclass() { 
		
		try 
		{ 
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\admin\\AppData\\Local\\Jenkins.jenkins\\workspace\\UI Automation\\HireXpertUIAutomation\\HireXpertUIAutomation\\src\\main\\java\\configurations\\config.properties");
			prop.load(fis);	
		}
		catch(IOException e) {
			e.getMessage();	
		}
	}
	
	public static void initialization() throws IOException, AWTException, InterruptedException {
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}			
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(utilclass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().window().setSize(new Dimension(1366,768));
		driver.navigate().refresh();	
//		driver.get("https://hiretest.txsas.com/#/home");
		
		loginpage = new LoginPage();
		dashboardpage = new DashboardPage();
		workbenchpage = new WorkbenchPage();
		addjobpage = new AddJobPage();
		sharewithagencypage = new ShareWithAgencyPage();
		addcandidatepage = new AddCandidatePage();
		sharewithteampage = new ShareWithTeamPage();
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
		explicitwait = new WebDriverWait(driver,80);
		executor=(JavascriptExecutor)driver;
		cvstorepage= new CvStorePage();
		rb =new Robot();
		taskmanagementpage= new TaskManagementPage();
		invoicepage= new InvoicePage();
		dtFormate = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		currentTime = LocalDateTime.now();
		hirexpresspage=new HireExpressPage();
		manageemployee=new ManageEmployee();
		managerecruitmentagencies=new ManageRecruitmentAgencies();
		manageemployer=new ManageEmployer();
		managevendor= new ManageVendor();
		sharewithvendorpage=new ShareWithVendorPage();
	}
}
