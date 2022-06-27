package alertinselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.redbus.in/");
		/*driver.findElement(By.id("promtButton")).click();
		Alert a=driver.switchTo().alert();
		a.sendKeys("mahesh");
		Thread.sleep(5000);
		System.out.println(a.getText());
		a.accept();*/
		driver.findElement(By.id("timerAlertButton")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(10000);
		a.accept();
		
	}

}
