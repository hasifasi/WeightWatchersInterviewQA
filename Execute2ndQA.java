package ExcercieseInterviewWW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;




public class Execute2ndQA {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =ExcerciseLaunchBrowser.launchWW();
		
		ExcerciseStudioPage validateWW =PageFactory.initElements(driver, ExcerciseStudioPage.class);
		ExcerciseMeetings printMeetings = PageFactory.initElements(driver, ExcerciseMeetings.class);
		
		
		validateWW.validateWeightWatchers();
		
		
		printMeetings.printMeetings("SUN");
		printMeetings.printMeetings("MON");
		printMeetings.printMeetings("TUE");
		printMeetings.printMeetings("WED");
		printMeetings.printMeetings("THU");
		printMeetings.printMeetings("FRI");
		printMeetings.printMeetings("SAT");
}
	
}

