package Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CarouselHandling {

	public static void main(String[] args) throws InterruptedException 
	
	{
		ArrayList<String> a1= new ArrayList<String>();
	WebDriver driver = WebDriverManager.chromedriver().create();
	
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	List<WebElement>firstset = driver.findElements(By.xpath("//div[contains(@class,'first-carousel')]//li"));
	
	for(int i=0;i<firstset.size()/2;i++)
	{
		String text =firstset.get(i).getText();
		System.out.println(text);
	}

	}

}
