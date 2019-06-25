package ExcercieseInterviewWW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//Launch Chrome Browser(chromedriver.exe should be under 'drivers' folder) and validate Title of Window
public class ExcerciseLaunchBrowser {
	
	static WebDriver driver;
	
	public static  WebDriver launchWW(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"/"+"drivers"+"\\"+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.weightwatchers.com/us/");
		if (driver.getTitle().trim().equalsIgnoreCase("WW (Weight Watchers): Weight Loss & Wellness Help".trim())){
			System.out.println("The Title of the window matches and it is "+driver.getTitle());
		}else{
			System.out.println("The Title of the Window does not matches and it is "+driver.getTitle());
		}
		
		return driver;
	}
	

}
