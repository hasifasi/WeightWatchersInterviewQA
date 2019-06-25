package ExcercieseInterviewWW;

import java.util.ArrayList;
import java.util.HashMap;


public class ExcerciseMeetings {


	public void printMeetings(String day) {
		ArrayList<String> C = new ArrayList<String>();
		switch (day) {
		case "SUN":
			for (int i = 0; i < ExcerciseStudioPage.ScheduleSun.size(); i++) {
				C.add(ExcerciseStudioPage.ScheduleSun.get(i).getText());
			}
			scheduleCounts(C,"SUN");
			break;

		case "MON":
			for (int i = 0; i < ExcerciseStudioPage.ScheduleMon.size(); i++) {
				C.add(ExcerciseStudioPage.ScheduleMon.get(i).getText());
			}
			scheduleCounts(C,"MON");
			break;

		case "TUE":
			for (int i = 0; i < ExcerciseStudioPage.ScheduleTue.size(); i++) {
				C.add(ExcerciseStudioPage.ScheduleTue.get(i).getText());
			}
			scheduleCounts(C,"TUE");
			break;

		case "WED":
			for (int i = 0; i < ExcerciseStudioPage.ScheduleWed.size(); i++) {
				C.add(ExcerciseStudioPage.ScheduleWed.get(i).getText());
			}
			scheduleCounts(C,"WED");
			break;

		case "THU":
			for (int i = 0; i < ExcerciseStudioPage.ScheduleThu.size(); i++) {
				C.add(ExcerciseStudioPage.ScheduleThu.get(i).getText());
			}
			scheduleCounts(C,"THU");
			break;

		case "FRI":
			for (int i = 0; i < ExcerciseStudioPage.ScheduleFri.size(); i++) {
				C.add(ExcerciseStudioPage.ScheduleFri.get(i).getText());
			}
			scheduleCounts(C,"FRI");
			break;

		case "SAT":
			for (int i = 0; i < ExcerciseStudioPage.ScheduleSat.size(); i++) {
				C.add(ExcerciseStudioPage.ScheduleSat.get(i).getText());
			}
			scheduleCounts(C,"SAT");
			break;

		}

	}

	public static void scheduleCounts(ArrayList<String> C,String Day) {
		HashMap<String, Integer> elementCountMap = new HashMap<String, Integer>();

		for (String j : C) {
			if (elementCountMap.containsKey(j)) {
				elementCountMap.put(j, elementCountMap.get(j) + 1);
			} else {
				elementCountMap.put(j, 1);
			}
		}
		System.out.println("The Studio Schedule on "+Day +":" + elementCountMap);
	}

}
