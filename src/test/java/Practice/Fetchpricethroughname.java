package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fetchpricethroughname {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
//		driver.get("https://ticker.finology.in/");
//		Thread.sleep(3000);
//		driver.manage().window().maximize();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("window.scrollBy(0,900)");
//		
//		List<WebElement> rows = driver.findElements(By.xpath("(//div[contains(@class,'table')])[2]//table//tbody/tr"));
//		System.out.println(rows.size());
//		for(int i=0; i<rows.size(); i++)
//		{
//			System.out.println("I value is "+i);
//		String text = rows.get(i).findElement(By.xpath("//td[1]/a")).getText();
//		System.out.println(text);
//		if (text.equals("PNB"))
//		{
//			System.out.println("Value is "+rows.get(i).findElement(By.xpath("//td[2]")).getText());
//			
//		}
//			
//			
//		}
		
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 List<WebElement>rowdata =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		 
		 rowdata.stream().forEach(e->System.out.println(driver.findElement(By.xpath("//td/a")).getText()));
		 
//		 for(int i=1;i<=rowdata.size();i++)
//		 {
//			// System.out.println(rowdata.get(i).findElement(By.xpath("(td)[1]/a")).getText());
//			// System.out.println(rowdata.get(i).findElement(By.xpath("(td)[3]")).getText());
//			 
//			String text2= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td/a")).getText();;
//			
//			if(text2.contains("Neuland Laborat"))
//			{
//				System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td[3]")).getText());;
//			}
//			 
//			 
//		 }
//		 
		 
		 //Anothermethod, traverse columnswithing asingle row
		 
//		 for(int i=0;i< rowdata.size();i++)
//		 {
//			 System.out.println("i value is "+i);
//			 System.out.println(rowdata.get(i).findElement(By.xpath("(//td)[1]/a")).getText());
//			 if(rowdata.get(i).findElement(By.xpath("//td/a")).getText() == "\r\n"
//				 		+ "					PI Industries\r\n"
//				 		+ "					")
//				 		
//			 {
//				 System.out.println("Match found");
//			 }
//			 
//			
//		 }
//		
		

	}

}
