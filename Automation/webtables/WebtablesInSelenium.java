package webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtablesInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

		//finding coloumn no
		int colm_no = driver.findElements(By.xpath("//tr [@style='box-sizing: inherit;']/th")).size();
		System.out.println("column size: "+colm_no);
		//finding row size
		int row_no=driver.findElements(By.xpath("//tr[@style='box-sizing: inherit;'][1]/following-sibling::tr")).size();
		System.out.println("row size:"+row_no);

		//finding specific element
		String text=driver.findElement(By.xpath("//tbody[@style='box-sizing: inherit;']/tr[4]/td[2]")).getText();
        System.out.println("text:"+text);
        //fetch whole table data
        for(int r=2;r<=row_no;r++)//
        {
        	for(int c=1;c<=colm_no;c++)
        	{
        		String data=driver.findElement(By.xpath("//tbody[@style='box-sizing: inherit;']/tr["+r+"]/td["+c+"]")).getText();
        		System.out.print(data+"  ");
        		
        	}
        	System.out.println();
        }
	}

}
