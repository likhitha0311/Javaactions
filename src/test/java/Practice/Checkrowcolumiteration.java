package Practice;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkrowcolumiteration {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().create();
		
//		ChromeOptions opt=new ChromeOptions();
//		
//		opt.addArguments("--disable-notifications");
//		
//		WebDriver driver = new ChromeDriver(opt);
//		
//		driver.get("https://test-designer-b.specson.studio/");
//		
//		driver.findElement(By.id("mat-input-0")).sendKeys("likhitha@28lightbulbs.com");
//		driver.findElement(By.id("mat-input-1")).sendKeys("wvGB37KSbDP8h4YD");
//		driver.findElement(By.xpath("//button[.='Sign In']")).click();
//		
//		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("headNavProjects")))).click();
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("black-overlay"))));
//		
//		
//		List<WebElement> text =driver.findElements(By.xpath("//tbody/tr//td//b"));
//		
//		text.stream().forEach(e->
//		
//				{
//					if(e.getText() == "Type3_Scenario_1")
//					{
//						System.out.println(driver.findElement(By.xpath("//tbody/tr//td[8]/h6")));;
//					}
//				});
//		
//		
		ArrayList<Integer> ar=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		ar.stream().filter(e-> e% 2 == 0).collect(Collectors.toList());
//		for(WebElement e: text)
//		{
//			if (e.getText() == "Type3_Scenario_1")
//			{
//				System.out.println(driver.findElement(By.xpath("//tbody/tr//td[8]/h6")));;
//			}
//					
//					
//		}
		
		
		

	}

}
