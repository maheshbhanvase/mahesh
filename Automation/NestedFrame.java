import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		
	
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		WebElement child = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
	System.out.println(child.getText());
	driver.switchTo().parentFrame();
	String parent = driver.findElement(By.xpath("//body")).getText();
		System.out.println(parent);
	}

}
