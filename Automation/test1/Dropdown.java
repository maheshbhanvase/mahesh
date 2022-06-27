package test1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		
		
				driver.get("https://demo.guru99.com/test/newtours/register.php");
				
		       WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		      
		      String m= country.getText();
		      System.out.println( country.getAttribute(m));
		      Select act=new Select(country);
		      act.selectByVisibleText("INDIA");
		      Thread.sleep(2000);
		      
		      act.selectByIndex(2);
		      Thread.sleep(2000);
		      
		      act.selectByValue("ANGUILLA");
		      Thread.sleep(2000);
		      driver.close();
		      
		     List<WebElement> asd = act.getOptions();
		     System.out.println(asd.size());
		     ArrayList<String >Text=new ArrayList<String>();
		     ArrayList<String >Atri=new ArrayList<String>();
		     
		     
		     for(WebElement ele:asd) {
		    	 String a=ele.getText();
		    	 Text.add(a);
		    	 
		    	 String b = ele.getAttribute("value");
		    	 Atri.add(b);
		    	
		     }
		     System.out.println(Text);
		     System.out.println(Atri);
		     
		     if(Text.equals(Atri))
		     {
		    	 System.out.println("ok");
		     }
		     else
		    	 System.out.println("not ok");
			}

	}


