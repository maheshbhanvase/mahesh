package webtables;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelniumTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//1) How Many rows in tables
		driver.get("https://demoqa.com/webtables");
		int a =driver.findElements(By.xpath("//div[@class='rt-tr-group']")).size();
	      System.out.println("total no of rows in a table : "+a);
	      
	      //2)total column in table
	     int b= driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']")).size();
	      
	     System.out.println("total no of colm in a table : "+b);
	     // Retrive data from specific row and column
	     
	    String data= driver.findElement(By.xpath("//div[@class='rt-tbody']")).getText();
	    System.out.print("data: "+data);

	}

}
