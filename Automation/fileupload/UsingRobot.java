package fileupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		//driver.findElement(By.xpath("//input[@id='uploadfile_0']")).sendKeys("C:\\Users\\mahes\\OneDrive\\Desktop\\AUTOMATION NOTES\\javasyllabus.pdf");
		StringSelection strselect=new StringSelection("C:\\Users\\mahes\\OneDrive\\Desktop\\AUTOMATION NOTES\\javasyllabus.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselect, null);
		Thread.sleep(3000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		
		
		
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='terms']")).click();
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='submitbutton']")).click();

	}

}
