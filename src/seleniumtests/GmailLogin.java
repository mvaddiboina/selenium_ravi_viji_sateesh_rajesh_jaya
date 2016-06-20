package seleniumtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer_Win32_2.53.12\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(); //opens firefox instance
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();//maximises the browser
		driver.findElement(By.id("Email")).sendKeys("msr.trainings54@gmail.com");
		driver.findElement(By.id("next")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Passwd")));
		Thread.sleep(10000);
		driver.findElement(By.id("Passwd")).sendKeys("india$$1234");
		driver.findElement(By.id("signIn")).click();
		driver.close();
		//driver.quit();

	}

}
