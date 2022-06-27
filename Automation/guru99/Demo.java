package guru99;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.guru99.com/V1/html/addcustomerpage.php");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Mahesh Bhanvase");
		 
	
		WebElement str= driver.findElement(By.xpath("//input[@name='rad1'][2]"));
		str.click();
		System.out.println(str.isSelected());
		System.out.println(str.isDisplayed());
		System.out.println(str.isEnabled());
		
		WebElement address=driver.findElement(By.xpath("//textarea[@name='addr']"));
		address.sendKeys("At-Wangi no-2,Dist-Solapur");
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Solapur");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharastra");
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("ehyjude");
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("9689299891");
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Mahesh@123");
		
		driver.findElement(By.xpath("//input[@name='sub']")).click();
		Alert al=driver.switchTo().alert();
		al.accept();
		
		
	}


}
