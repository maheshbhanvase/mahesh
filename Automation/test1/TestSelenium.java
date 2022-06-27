package test1;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.canva.com");
		
		
		List<WebElement> tabs = driver.findElements(By.xpath("//button[@role='tab']"));
		WebElement q;
		for(int i=0;i<tabs.size();i++) {
			
			q= tabs.get(i);
			if(i==5)
			System.out.println(i+":"+q.getText());
		}
	}

}
