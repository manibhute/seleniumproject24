package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class frameswitch {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		
	
	System.setProperty("webdriver.chrome.driver","C:/mydriver/chromedriver.exe");
		driver =new ChromeDriver();

		driver.get("http://www.FreeCRM.com/");

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("LOG IN")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.name("Email")).sendKeys("mani.bhute@gmail.com");

/*
		WebElement loginbutton1=driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]"));
		loginbutton1.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("Ename")).sendKeys("mani.bhute@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("password")).sendKeys("1234swami");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement loginbutton =driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("argument[0].click()",loginbutton);
		loginbutton.click();






*/
}
}