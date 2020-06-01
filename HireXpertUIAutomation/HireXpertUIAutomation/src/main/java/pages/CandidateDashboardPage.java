package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;
import utilPackage.utilclass;

public class CandidateDashboardPage extends baseclass {
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div/div/table")
	public WebElement skillsTable;
	
	@FindBy(xpath = "/html/body/app-root/div/div/div/app-candidate-dashboard/div/div[3]/div/div[1]/div/div[1]/h5")
	public WebElement Skills;
	
	@FindBy(xpath = "/html/body/app-root/div/div/div/app-candidate-dashboard/div/div[3]/div/div[1]/div/div[1]/button")
	public WebElement skillsRefreshButton;
	
	@FindBy(xpath = "//button[@title='Questionnaire']")
	public WebElement QuestionnarieTab;
	
	
	public CandidateDashboardPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void verifyTableHeading() {
		
		String heading = Skills.getText();
		System.out.println("\nTable heading on Dashboard page: " + heading);
	}

	public void findSkillAndCertificate() throws InterruptedException {
		
		Thread.sleep(2000);
		String s2 = candidateupdateprofilepage.skill2.getAttribute("value");
		System.out.println("\nEntered skill: " + s2);

		Thread.sleep(1000);
		String c2 = candidateupdateprofilepage.certificate2.getAttribute("value");
		System.out.println("Entered certificate: " +c2);
		common.closebtn.click();
		Thread.sleep(3000);
		
		verifyTableHeading();
		
		//Set implicit wait to 0
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		String xpath_start_skill = "//*[@id=\"style-5\"]/div/div/div/table/tbody/tr[";
		String xpath_end_skill = "]/td[1]/p";
		
		String xpath_start_certificate = "//*[@id=\"style-5\"]/div/div/div/table/tbody/tr[";
		String xpath_end_certificate = "]/td[3]/p";
		
		int i = 1;
		
		while(isElementPresent(xpath_start_skill+i+xpath_end_skill)) {
			
			String s02 = driver.findElement(By.xpath(xpath_start_skill+i+xpath_end_skill)).getText();
			
			if(s02.equalsIgnoreCase(s2)) {
				System.out.println("\nSkill found: " + s02);
			
				String c02 = driver.findElement(By.xpath(xpath_start_certificate+i+xpath_end_certificate)).getText();
					
				if(c02.equalsIgnoreCase(c2)) {
					System.out.println("Certificate added for skill found: " + c02);
				}
			}
			
			i++;
		}
		
		//Revert back to default value of implicit wait
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	
	public boolean isElementPresent(String elementXpath) {
		
		int count = driver.findElements(By.xpath(elementXpath)).size();
		
		if(count==0)
			return false;
		else
			return true;
	}
	
	public void verifyQuestionaryicononcandidatedashboard () {
		
		List<WebElement> Jobs = driver.findElements(By.xpath("//div[text()='Job-1 Test Engineer']"));
		List<WebElement> Questionnarietab = driver.findElements(By.xpath("//button[@title='Questionnaire']"));
		if(Jobs.size() != 0 && Questionnarietab.size() != 0 ){
			
			System.out.println("Job-1 Test Engineer, job is present on candidate dashboard and Questionnaire tab is present for that job.");

		}
		
		
		else {
			
			System.out.println("Questionnaire tab is not present for that job");
	
		}
}

   public void ClickonQuestionnairetab() {
	   
	   QuestionnarieTab.click();
   }
}

