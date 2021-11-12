import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTest03{

	public static WebDriver driver = null;
			
	public static void main(String[] args) throws InterruptedException
	{	
		long setLoadingDelay = 2000L;
		TimerTask task = new TimerTask(){
			public void run(){
				driver.findElement(By.id("title-wrapper")).click();
				
				String title = driver.getTitle();
				if(title.equalsIgnoreCase("Pink Floyd - Shine On You Crazy Diamond - YouTube")) {
					System.out.println("A melhor música do Pink Floyd");
				}
			}
		}
		
		Timer timer = new Timer();
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.youtube.com/");
		
		driver.findElement(By.name("search_query")).sendKeys("Pink Floyd - Shine On You Crazy Diamond");
		driver.findElement(By.id("search-icon-legacy")).click();
		
		driver.manage().window().maximize();
		
		timer.schedule(task, setLoadingDelay);
		driver.close()
		
	}
}