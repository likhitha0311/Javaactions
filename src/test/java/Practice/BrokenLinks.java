package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks 

{
public static void main (String[] args) throws MalformedURLException, IOException, InterruptedException, AWTException 
{
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver =new ChromeDriver();
	
//	driver.get("https://www.thebetterindia.com/301407/blue-flag-beaches-in-india-cleanest-beaches-eco-tourism-sustainability-vacation-plan/?utm_source=pocket-newtab-intl-en");
//	
//	String myurl= "https://www.baeldung.com/";
//	
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	Thread.sleep(2000);
////	js.executeScript("window.scrollBy(0,800)");
////	js.executeScript("window.scrollBy(0,-800)");
//	
//	Point p = driver.findElement(By.xpath("//h2[.='1. Shivrajpur beach, Gujarat']")).getLocation();
//	
//	File screenshot = driver.findElement(By.xpath("//h2[.='1. Shivrajpur beach, Gujarat']")).getScreenshotAs(OutputType.FILE);
//	
//	FileUtils.copyFile(screenshot, new File("./image.png"));
//	
//	int x= p.getX();
//	int y= p.getY();
//	
//	js.executeScript("window.scrollBy("+x+","+y+")");
	
	
//	driver.navigate().to("https://www.flipkart.com/");
//	
//	WebDriverWait wait = new 	WebDriverWait(driver,Duration.ofSeconds(10));
//	
//	
//	
//	WebElement e = driver.findElement(By.xpath("//div[@class='xtXmba' and  contains(text(),'Fashion')]"));
//	Actions act=new Actions(driver);
//	
//	act.moveToElement(e).perform();
//	
//	WebElement e1 = driver.
//	findElement(By.xpath("//a[@href='https://www.flipkart.com/clothing-and-accessories/topwear/pr?sid=clo,ash&amp;p[]=facets.ideal_for%255B%255D%3DMen&amp;p[]=facets.ideal_for%255B%255D%3Dmen&amp;otracker=categorytree&amp;fm=neo%2Fmerchandising&amp;iid=M_63799617-a2ad-4711-ab59-118363fc7f0f_1_372UD5BXDFYS_MC.6XNZG1FYFBZT&amp;otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear_6XNZG1FYFBZT&amp;otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L1_view-all&amp;cid=6XNZG1FYFBZT')"));
//	
	Actions act=new Actions(driver);
	
//driver.get("https://www.selenium.dev/downloads/");
////	
////WebElement f= driver.findElement(By.xpath("(//a[.='documentation'])[1]"));
//	
//	driver.findElement(By.xpath("(//a[.='documentation'])[1]")).sendKeys(Keys.chord(Keys.CONTROL,"t"));
////	act.contextClick(f).perform();
////	Robot r=new Robot();
////	r.keyPress(KeyEvent.VK_T);
////	r.keyRelease(KeyEvent.VK_T);
//	
	
	
	
	//WebElement e= driver.findElement(By.xpath("//a[.='4.6.0']"));
	driver.get("https://test-designer-b.specson.studio/");
//	
WebElement f= driver.findElement(By.id("mat-input-0"));
f.sendKeys("likhitha");

String value= driver.findElement(By.id("mat-input-0")).getCssValue("font-weight");
System.out.println(value);

  driver.findElement(By.id("mat-input-0")).getTagName();

   Thread.sleep(2000);

JavascriptExecutor js = (JavascriptExecutor) driver;

js.executeScript("document.getElementById(\"mat-input-0\").value='';");
//	
//	//driver.findElement(By.id("mat-input-0")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
//	
//	
//
//	act.moveToElement(f).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE)).perform();
//	
	
	
	
	
	
	
//	int  brokenlink= 0;
//	int  validlink=0;
//	
//	HttpURLConnection ap = null;
//	int respCode;
//	
//	List<WebElement>links = driver.findElements(By.tagName("a"));
//	
//	for (WebElement e :links)
//	{
//		String url = e.getAttribute("href");
//		
//		if (url == null)
//		{
//			System.out.println("Empty url");
//		}
//		
//		else if(url.startsWith(myurl))
//		{
//			System.out.println("Internal links");
//		}
//		
//		else
//		{
//			ap=(HttpURLConnection)(new URL(url).openConnection());
//    		ap.setRequestMethod("HEAD");
//    		ap.connect();
//    		respCode=ap.getResponseCode();
//    		 if(respCode >= 400)
//    		 {
//                    System.out.println(url+" is a broken link");
//                    brokenlink++;
//                }
//                else
//                {
//                    System.out.println(url+" is a valid link");
//                    validlink++;
//                }
//    	}
//		}
//	
//	
//	}
//	
}

}


