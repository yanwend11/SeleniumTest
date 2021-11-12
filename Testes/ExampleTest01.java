//Abrindo o Firefox
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ExampleTest01{
	public static void main(String[] args) {
		abrirFirefox();
	}

	private static void abrirFirefox() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://diariodoaluno.com");
		String i = driver.getCurrentUrl();
		System.out.println(i);
		driver.close();
	}

}
