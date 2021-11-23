package screenShotTaken1.screenShotTaken1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Citi {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.citi.com/");
		
		driver.findElement(By.id("navbankingmainAnchor1")).click();
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement	signIN=	driver.findElement(By.xpath("//a[@id='Small BusinesschildLink6']"));
		js.executeScript("arguments[0].click();", signIN);
		//driver.close();
	}

}
