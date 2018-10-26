import java.util.ArrayList;
public class SchedulingAlgorithmTester {
	public static void main(String[] args) {
		
		
		
		
		ArrayList<ArrayList<String>> availability = new ArrayList<ArrayList<String>>();
		ArrayList<String> employeeName=new ArrayList<String>();
		ArrayList<String> fullTimePartTime=new ArrayList<String>();
		ArrayList<String> timesAvailable=new ArrayList<String>();
		ArrayList<String> daysUnavailable=new ArrayList<String>();
		ArrayList<String> datesUnavailable=new ArrayList<String>();
		ArrayList<ArrayList<String>> calender= new ArrayList<ArrayList<String>>();
		ArrayList<String> dates=new ArrayList<String>();
		ArrayList<String> daysOfWeek=new ArrayList<String>();
		
		timesAvailable.add("1-9, Mondays");
		timesAvailable.add("All Day, Rest of Week");
		
		daysUnavailable.add("Thursday");
		daysUnavailable.add("Saturday");
		
		datesUnavailable.add("11/14/18");
		
		dates.add("11/04/18");
		dates.add("11/05/18");
		dates.add("11/06/18");
		dates.add("11/07/18");
		dates.add("11/08/18");
		dates.add("11/09/18");
		dates.add("11/10/18");
		dates.add("11/11/18");
		dates.add("11/12/18");
		dates.add("11/13/18");
		dates.add("11/14/18");
		dates.add("11/15/18");
		dates.add("11/16/18");
		dates.add("11/17/18");
		
		daysOfWeek.add("Sunday");
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		daysOfWeek.add("Sunday");
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		
		employeeName.add("Matt Davino");
		fullTimePartTime.add("Full Time");
	
		availability.add(employeeName);
		availability.add(fullTimePartTime);
		availability.add(timesAvailable);
		availability.add(daysUnavailable);
		availability.add(datesUnavailable);
		
		
		
		calender.add(dates);
		calender.add(daysOfWeek);
		
		SchedulingAlgorithm test=new SchedulingAlgorithm();
		
		System.out.print(test.createSchedule(availability, calender));
		
		
	}
}
