package myTakescrenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myscreenshotexecution {
	
public static WebDriver driver;
@BeforeTest
public static void Launch()
{
System.setProperty("webdriver.chrome.driver","C:/mydriver/chromedriver.exe");
driver =new ChromeDriver();
driver.get("http://google.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/inpu")).sendKeys("India");
}

@AfterMethod
public static void myscreenshot_onfailure(ITestResult Result) throws IOException
{
	if(ITestResult.FAILURE==Result.getStatus()){
		try{
			// To create reference of TakesScreenshot
			TakesScreenshot screenshot=(TakesScreenshot)driver;
			// Call method to capture screenshot
			File src=screenshot.getScreenshotAs(OutputType.FILE);
			File Target=new File("C://screnshot/screnshotfailure.png");
			// Copy files to specific location 
			// result.getName() will return name of test case so that screenshot name will be same as test case name
			FileUtils.copyFile(src, Target);
			System.out.println("Successfully captured a screenshot");
		}catch (Exception e){
			System.out.println("Exception while taking screenshot "+e.getMessage());
		} 
}
driver.quit();
}

 
 
}
/*
@AfterTest
public static void failurescreenshot(ITestResult Result) throws IOException
{ 
	if(ITestResult.SUCCESS==Result.getStatus())
	{
TakesScreenshot ts=(TakesScreenshot) driver;
File target=new File("C://screenshot/screenshot5.png");
File src=ts.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(src, target);

String Testname =Result.getName();

	System.out.println("the drag and drop have Happened:Test case:"+Testname);

}}*/






