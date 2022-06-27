package test1;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
       driver.get("https://www.ironspider.ca/forms/checkradio.htm");
       List<WebElement>m=driver.findElements(By.xpath("//input[@type='checkbox']"));
       
		System.out.println(m.size());
		/*for(int i=0;i<m.size()-4;i++) {
			
		
		m.get(i).click();
		
		}*/
		for(WebElement e:m) {
			
			String k=e.getAttribute("value");
		if(k.equals("red")||(k.equals("orange")||(k.equals("purple"))))
			e.click();
			
			
		}
			
		}
		
	}

	


