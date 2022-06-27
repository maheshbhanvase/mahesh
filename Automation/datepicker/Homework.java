package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		driver.findElement(By.id("dateAndTimePickerInput")).click();
		
		driver.findElement(By.xpath("//span[@class='react-datepicker__year-read-view--down-arrow']")).click();
		
		driver.findElement(By.xpath("//div[text()='2020']")).click();
		
		driver.findElement(By.xpath("//div[@class='react-datepicker__month-read-view']")).click();
		
		driver.findElement(By.xpath("//div[text()='June']")).click();
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--019']")).click();
	}

}
