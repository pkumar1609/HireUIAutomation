package utilPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ActionExtension extends baseclass{

	final static int RetryCount=13;
	
	public static void SafeClick(WebElement webElement) 
    {
        try
        {
            try
            {
                TryByClicking(webElement);
            }
            catch (ElementClickInterceptedException elementClickInterceptedException)
            {
                try
                {
                    TryByHittingEnterKey(webElement);
                }
                catch (ElementClickInterceptedException elClickInterceptedException)
                {
                    TryByMovingTop(webElement);
                }
            }
            catch (NoSuchElementException noSuchElementException)
            {
            	wait(3);
        }
       }
        catch(WebDriverException webDriverException)
        {
            // Known issue
            // Page request timeout : Page is not loaded after clicking on element
        }
            
 
   }
	
	private static void TryByMovingTop(WebElement webElement)
    {
        try
        {
            MoveToElement(webElement);
            webElement.click();
        }
        catch(Exception ex)
        {
            MoveToElement(webElement);
            webElement.click();
        }
    }
	
	private static void TryByHittingEnterKey(WebElement webElement)
    {
        try
        {
            webElement.sendKeys(Keys.ENTER);
        }
        catch (ElementClickInterceptedException elementClickInterceptedException)
        {
           MoveToElement(webElement);
            webElement.sendKeys(Keys.ENTER);
        }
    }
	
	private static void TryByClicking(WebElement webElement)
    {
        try
        {
            webElement.click();
        }
        catch (Exception ex)
        {
            try
            {
               MoveToElement(webElement);
                webElement.click();
            }
            catch (Exception ex1)
            {
                ScrollToElement(webElement);
                webElement.click();
            }
        }

    }
	
	public static void MoveToElement(WebElement iWebElement)
    {
		Point classname = iWebElement.getLocation();
        int  xElem = classname.getX();
        int  yElem = classname.getY();
        String moveToJs = "javascript:window.scrollTo(" + xElem + "," + yElem + ")";   
        JavascriptExecutor js = (JavascriptExecutor) driver;  
        js.executeScript(moveToJs);
    }
    public static void ScrollToElement(WebElement iWebElement)
    {

    	JavascriptExecutor js = (JavascriptExecutor) driver;  
        js.executeScript("arguments[0].scrollIntoView(false);");
    }
    
    public static WebElement SafeFindElement(WebDriver webDriver, By elementLocator) 
    {
       
        for (int i = 1; i <= RetryCount; i++)
        {
            try
            {
                return webDriver.findElement(elementLocator);
            }
            catch (NoSuchElementException noException)
            {
            	wait(i);
				
            }
        }

        return webDriver.findElement(elementLocator);
    }
    
    public static void SafeEnterText(WebElement webElement, String text)
    {
        try
        {
            webElement.clear();
            webElement.sendKeys(text);
        }
        catch (ElementClickInterceptedException elException)
        {
            MoveToElement(webElement);
            webElement.clear();
            webElement.sendKeys(text);
        }
    }
    
    public static void wait(int i) 
    {
    	int sleepTime = 1000 * i;
        try {
			Thread.sleep(sleepTime);
		} 
        catch (InterruptedException e) {
			
			e.printStackTrace();
		}
    	
    	
    }
    
    public static void  HoverElement(WebElement webElement)
    {
        Actions action = new Actions(driver);
        action.moveToElement(webElement).perform();
    }
    
    private static void TryByHover(WebElement webElement)
    {
        try
        {
        	HoverElement(webElement);
        }
        catch (Exception exception)
        {
            wait(1);
            HoverElement(webElement);
        }
    }
    
    public static void SafeHoverElement(WebElement webElement)
    {
        try
        {
            TryByHover(webElement);
        }
        catch (Exception exception)
        {
            TryByMovingToElement(webElement);
        }           
    }
    public static void MoveToPageCenter(WebElement webElement)
    {
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                                                    + "var elementTop = arguments[0].getBoundingClientRect().top;"
                                                    + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        JavascriptExecutor js = (JavascriptExecutor) driver;  

        js.executeScript(scrollElementIntoMiddle, webElement);
    }
    private static void TryByMovingToElement(WebElement webElement)
    {
        try
        {
        	MoveToElement(webElement);
        	HoverElement(webElement);
        }
        catch (Exception exception)
        {
            try
            {
            	ScrollToElement(webElement);
            	HoverElement(webElement);
            }
            catch (Exception ex)
            {
            	MoveToPageCenter(webElement);
            	HoverElement(webElement);
            }
        }
    }
}
    

