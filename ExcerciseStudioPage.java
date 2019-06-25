package ExcercieseInterviewWW;



import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExcerciseStudioPage{
	
	WebDriver driver;
	
	@FindBy(xpath = ".//*[@id='ela-menu-visitor-desktop-supplementa_find-a-studio']")
	public static WebElement Mainpage_FindaStudio;
	
	@FindBy(xpath = ".//*[@id='meetingSearch']")
	public static WebElement FindaStudio_Zip;
	
	@FindBy(xpath = ".//*[@spice='SEARCH_BUTTON']")
	public static WebElement FindaStudio_Search;
	
	
	@FindBy(xpath = ".//*[@id='ml-1180510']/result-location/div/div[1]/a/location-address/div/div/div[1]/div[1]/span")
	public static WebElement FirstStudio;
	
	@FindBy(xpath = ".//*[@id='ml-1180510']/result-location/div/div[1]/a/location-address/div/div/div[1]/div[2]")
	public static WebElement FirstStudio_distance;
	
	@FindBy(xpath = ".//*[@class='location__name']/span")
	public static WebElement FirstStudioResult;
	
	
	 @FindBy(xpath = "//div[@class='schedule-detailed']/div[@class='schedule-detailed-day']/div[1]")
	  public static WebElement StudioSchedule;
	 
	 	
	 @FindBy(xpath = ".//div[text()='Sun']/following-sibling::div//div[@class='schedule-detailed-day-meetings-item-leader']")
		public static List<WebElement> ScheduleSun;
	 @FindBy(xpath = ".//div[text()='Mon']/following-sibling::div//div[@class='schedule-detailed-day-meetings-item-leader']")
		public static List<WebElement> ScheduleMon;
	 @FindBy(xpath = ".//div[text()='Tue']/following-sibling::div//div[@class='schedule-detailed-day-meetings-item-leader']")
		public static List<WebElement> ScheduleTue;
	 @FindBy(xpath = ".//div[text()='Wed']/following-sibling::div//div[@class='schedule-detailed-day-meetings-item-leader']")
		public static List<WebElement> ScheduleWed;
	 @FindBy(xpath = ".//div[text()='Thu']/following-sibling::div//div[@class='schedule-detailed-day-meetings-item-leader']")
		public static List<WebElement> ScheduleThu;
	 @FindBy(xpath = ".//div[text()='Fri']/following-sibling::div//div[@class='schedule-detailed-day-meetings-item-leader']")
		public static List<WebElement> ScheduleFri;
	 @FindBy(xpath = ".//div[text()='Sat']/following-sibling::div//div[@class='schedule-detailed-day-meetings-item-leader']")
		public static List<WebElement> ScheduleSat;
	
	
	
	public ExcerciseStudioPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public  void validateWeightWatchers() throws InterruptedException{
		
		
		if(ExcerciseStudioPage.Mainpage_FindaStudio.isDisplayed()){
			Mainpage_FindaStudio.click();
			System.out.println("The link 'Find a Studio' is clicked");
		}else{
			System.out.println("The link 'Find a Studio' is not available");
		}
		
		if (driver.getTitle().trim().equalsIgnoreCase("Find WW Studios & Meetings Near You | WW USA".trim())){
			System.out.println("The Title of the window matches and it is "+driver.getTitle());
		}else{
			System.out.println("The Title of the Window does not matches and it is "+driver.getTitle());
		}
		
		
		if(ExcerciseStudioPage.FindaStudio_Zip.isDisplayed()){
			ExcerciseStudioPage.FindaStudio_Zip.sendKeys("10011");
			ExcerciseStudioPage.FindaStudio_Search.click();
			System.out.println("Entered the Zip");
		}else{
			System.out.println("The location search not found");
		}
		
		String StudioName = ExcerciseStudioPage.FirstStudio.getText();
		String StudioDistance = ExcerciseStudioPage.FirstStudio_distance.getText();
		if(!StudioName.isEmpty()){			
			System.out.println("The first Studio name and its distance :"+StudioName +" and "+StudioDistance);
		}else{
			System.out.println("The Studio is unavailable");
		}
		
		ExcerciseStudioPage.FirstStudio.click();
		
		if(ExcerciseStudioPage.FirstStudioResult.getText().equalsIgnoreCase(StudioName)){
			System.out.println("The Search Result of Studio matched and it is "+ExcerciseStudioPage.FirstStudioResult.getText());
		}else{
			System.out.println("The Search Result of Studio NOT matched and it is "+ExcerciseStudioPage.FirstStudioResult.getText());
		}
		
		
		
		// Note:its very dynamic, it depends upon the day you execute, it will print its Timings.
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		
		switch (day) {
	    case Calendar.SUNDAY:
	    	System.out.println("Today is SUNDAY and the hours");
	    	List<WebElement> SunTimes= driver.findElements(By.xpath("//ul[starts-with(@class,'hours-list list-unstyled hours-list--count')]/li[1]//div[@class='hours-list-item-hours']/div"));
	    	for(int i=0;i<SunTimes.size();i++){
	    		System.out.println(SunTimes.get(i).getText());
	    	}
	        break;
	    case Calendar.MONDAY:
	    	System.out.println("Today is MONDAY and the hours");
	    	List<WebElement> MonTimes= driver.findElements(By.xpath("//ul[starts-with(@class,'hours-list list-unstyled hours-list--count')]/li[2]//div[@class='hours-list-item-hours']/div"));
	    	for(int i=0;i<MonTimes.size();i++){
	    		System.out.println(MonTimes.get(i).getText());
	    	}
	        break;
	    case Calendar.TUESDAY:
	    	System.out.println("Today is TUESDAY and the hours");
	    	List<WebElement> TueTimes= driver.findElements(By.xpath("//ul[starts-with(@class,'hours-list list-unstyled hours-list--count')]/li[3]//div[@class='hours-list-item-hours']/div"));
	    	for(int i=0;i<TueTimes.size();i++){
	    		System.out.println(TueTimes.get(i).getText());
	    	}
	        break;
	    case Calendar.WEDNESDAY:
	    	System.out.println("Today is WEDNESDAY and the hours");
	    	List<WebElement> WedTimes= driver.findElements(By.xpath("//ul[starts-with(@class,'hours-list list-unstyled hours-list--count')]/li[4]//div[@class='hours-list-item-hours']/div"));
	    	for(int i=0;i<WedTimes.size();i++){
	    		System.out.println(WedTimes.get(i).getText());
	    	}
	    	break;
	    case Calendar.THURSDAY:
	    	System.out.println("Today is THURSDAY and the hours");
	    	List<WebElement> ThurTimes= driver.findElements(By.xpath("//ul[starts-with(@class,'hours-list list-unstyled hours-list--count')]/li[5]//div[@class='hours-list-item-hours']/div"));
	    	for(int i=0;i<ThurTimes.size();i++){
	    		System.out.println(ThurTimes.get(i).getText());
	    	}
	    	break;
	    case Calendar.FRIDAY:
	    	System.out.println("Today is FRIDAY and the hours");
	    	List<WebElement> FriTimes= driver.findElements(By.xpath("//ul[starts-with(@class,'hours-list list-unstyled hours-list--count')]/li[6]//div[@class='hours-list-item-hours']/div"));
	    	for(int i=0;i<FriTimes.size();i++){
	    		System.out.println(FriTimes.get(i).getText());
	    	}
	    	break;
	    case Calendar.SATURDAY:
	    	System.out.println("Today is SATURDAY and the hours");
	    	List<WebElement> SatTimes= driver.findElements(By.xpath("//ul[starts-with(@class,'hours-list list-unstyled hours-list--count')]/li[7]//div[@class='hours-list-item-hours']/div"));
	    	for(int i=0;i<SatTimes.size();i++){
	    		System.out.println(SatTimes.get(i).getText());
	    	}
	    	break;
	}
		
	}
	
	
	
	

	
		
	
}
