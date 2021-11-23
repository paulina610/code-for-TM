package screenShotTaken1.screenShotTaken1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://www.scotiabank.com/ca/en/personal.html";
		driver.navigate().to(url);
		WebElement mortage=driver.findElement(By.xpath("//*[@id='nav-item-4']"));

		Actions ac=new Actions(driver);
		ac.moveToElement(mortage).perform();
		driver.findElement(By.xpath("//div[@id='dd4']/ul/li[2]/ul/li[1]/a/span")).click();// mortgage  ehome

		//driver.findElement(By.xpath("//*[@id=\"get-started\"]")).click();// get started in ehome page

		WebElement signIn1= driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div[5]/div/p/a"));
		signIn1.click();
		//		ac.dragAndDropBy(signIn1,100,100);
		String currentHandle= driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		for(String actual: handles) {
			if(!actual.equalsIgnoreCase(currentHandle)) {
				//Switch to the opened tab
				driver.switchTo().window(actual);
				//		driver.manage().window().setSize(new Dimension(1024, 768));
				//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				//		driver.switchTo().window( tabs.get(1));


				WebElement  signIn= driver.findElement(By.xpath("//*[@name='usernameInput']"));
				signIn.sendKeys("paulina");// passing username
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@name='password']")).sendKeys("1254893");// giving password
				driver.findElement(By.xpath("//span[@class='ButtonCore__block']")).click();//clicking signin
				Thread.sleep(2000);


				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try {
					FileUtils.copyFile(src, new File("C://Users//jeeva//Desktop//ScreenShots//pic1.png"));
				}catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
		Thread.sleep(100);
		driver.quit();	


	}

}
