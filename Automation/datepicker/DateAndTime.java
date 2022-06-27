package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateAndTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		
		Select s=new Select(year);
		Thread.sleep(3000);
		s.selectByValue("2020");
		
		WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		
		Select ms=new Select(month);
		
		ms.selectByIndex(5);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--023']")).click();
		
	}

}
