import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTest02 {

	public static WebDriver driver = null;
			
	public static void main(String[] args) throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.google.com.br/");
		
		driver.findElement(By.name("q")).sendKeys("UniBH");
		driver.findElement(By.name("btnK")).click();
		
		driver.manage().window().maximize();
		driver.close()		
	}
}
