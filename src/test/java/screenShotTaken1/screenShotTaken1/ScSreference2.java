package screenShotTaken1.screenShotTaken1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScSreference2 {
	
	

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
			driver.findElement(By.xpath("//div[@id='dd4']/ul/li[2]/ul/li[1]/a/span")).click();
			
			//driver.findElement(By.xpath("//*[@id=\"get-started\"]")).click();
			
			WebElement signIn1= driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/div/div[5]/div/p/a"));
			signIn1.click();
//			ac.dragAndDropBy(signIn1,100,100);
//			String currentHandle= driver.getWindowHandle();
//			Set<String> handles=driver.getWindowHandles();
//			for(String actual: handles) {
//			if(!actual.equalsIgnoreCase(currentHandle)) {
//			//Switch to the opened tab
//			driver.switchTo().window(actual);
			//driver.manage().window().setSize(new Dimension(1024, 768));
			//opening the URL saved.
			//ac.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
			
			//driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=1O3Ya0rgvkg&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiMU8zWWEwcmd2a2ciLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL2Vob21lLnNjb3RpYWJhbmsuY29tXC9hdXRoIiwic3RhdGUiOiI4dmdBVE4iLCJleHAiOjE2Mzc0NDM1NjMsImlhdCI6MTYzNzQ0MjM2MywianRpIjoiZDM3YjE5YzQtZGI3YS00Nzc0LWFkODMtOWIxMGEyOThlZDIyIiwiY2xpZW50X2lkIjoiYTkxZjkyOTMtNDZkYy00MTRkLTllZGYtMzM2OWI1ODIzYmQzIiwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.hLoqmC87ONRZkakuXV_Dfc17-81W49jLjn9tst9gVAG9gOLMkZjvfpMdt2awV3qXtQKr6086A9JA4Ol6lQJGFoy1PCTrGkd_H_q4J7cIBMubkkIVyJIv-Oa5WfdrIn4nNlxdy5L4KP_R-fzLhYBtviEvVItxlcek_HvPXudrTKTxn6_eZQWub_KmvWqk-aWD4YvLLn2TezxPMFBMFK13nmHSTYwFMHOSqqUrGW2bE7pcwBH2AeRMWXP9cXEGwJPDA6yNWsAiqTtqCNpgowCrd0Foh3atHPXn0YJUuXgaDg4WiGcnsoRyOJq2gcAjV_CqUO993GN0_pZCHkdUDytqEw");//opening the URL saved. 
		
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window( tabs.get(1));
			
			
			WebElement  signIn= driver.findElement(By.xpath("//*[@name='usernameInput']"));
			signIn.sendKeys("paulina");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("1254893");
			driver.findElement(By.xpath("//span[@class='ButtonCore__block']")).click();
			Thread.sleep(2000);
		
			//}
			//}
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(src, new File("C://Users//jeeva//Desktop//ScreenShots//pic.png"));
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		
			Thread.sleep(100);
			driver.quit();	
			

		}

	}


