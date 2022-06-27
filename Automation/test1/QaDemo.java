package test1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/books");
		WebElement disc=driver.findElement(By.xpath("//a[normalize-space()='Git Pocket Guide']"));
		disc.click();
		List<WebElement> colm = driver.findElements(By.xpath("//div[@class='profile-wrapper']//div[@class='col-md-9 col-sm-12']"));
	    List<WebElement>row=driver.findElements(By.xpath("//div[@class='col-md-3 col-sm-12']"));
	    WebElement m;
	    WebElement q;
	    
		String key="";
		String value="";
		HashMap<Object,Object> hm=new HashMap<Object,Object>();
		
        for(int i=0;i<colm.size();i++) 
        	for(int j=i;j<row.size();j++) {
     		   m=row.get(j);
     		  key=m.getText();
     		   q= colm.get(i);
     		   value=q.getText();
        	hm.put(key,value);
  	
        }
        Set<Entry<Object,Object>>entry=hm.entrySet();
        for(Map.Entry e:entry) {
        	if(e.getKey().equals("Description :")) {
        		System.out.println(e);
        	}
        	
        }}
       
    	   
       
       

	}


