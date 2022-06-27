package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement x=driver.findElement(By.name("country"));
		Select sel=new Select(x);
		
		Thread.sleep(3000);
		sel.selectByIndex(1);
		
		Thread.sleep(3000);
		sel.selectByValue("INDIA");
		
		Thread.sleep(3000);
		sel.selectByVisibleText("ISRAEL");

	}

}
