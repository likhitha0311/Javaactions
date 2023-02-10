package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllthevaluesofadynamicwebtable {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();

WebDriver driver =new ChromeDriver();

driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
driver.manage().window().maximize();
Thread.sleep(3000);
List<WebElement>rowdata =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));


for(int i=1;i<=rowdata.size();i++)
{
	List<WebElement>columndata =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td"));
	
	for(int j=1;j<=columndata.size();j++)
	{
		System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText());;
	}
}

<<<<<<< HEAD
		System.out.println("This is a test");
=======
List<Integer> list = new ArrayList<>();

list.add(12);
		list.add(122);
		list.add(121);list.add(1233);

		for(int i:list)
		{
			System.out.println(list);
		}

		System.out.println("Commit-1");
		System.out.println("Commit-2");
		System.out.println("Commit-6");
		System.out.println("Commit-7");
		System.out.println("Commit-8");
		System.out.println("Commit-92");
>>>>>>> Likhitha-Thirdfeaturebranch
	}

}
