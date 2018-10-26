import java.util.ArrayList;
public class SchedulingAlgorithm {

	private int name=0;//Where name is stored in availability arraylist
	private int ftpt=1;//Where whether or not they are full time or part time is stored in availability arraylist
	private int timesAva=2;//Where what times they're available is stored in an arraylist
	private int dowUAva=3;//Where what days of the week they are unavailable is stored in an arraylist
	private int dua=4;//Where specific dates they are unavailable are stored in an arraylist

	ArrayList<ArrayList<String>> schedule = new ArrayList<ArrayList<String>>();
	
	public SchedulingAlgorithm() {
		
	}
	
	public boolean isFullTime(ArrayList<ArrayList<String>> availability) {
		if(availability.get(ftpt).equals("Full Time")) {
			return true;
		}
		return false;
	}

	public boolean isAvailable(ArrayList<ArrayList<String>> availability, String dayOfWeek, String date) {
		
		for(int i=0; i<(availability.get(dowUAva)).size(); i++) {
			if( availability.get(dowUAva).get(i).equals(dayOfWeek)) {
				return false;
			}
		}
		
		for(int i=0; i< availability.get(dua).size(); i++) {
			if(availability.get(dua).get(i).equals(date)) {
				return false;
			}
		}


		return true;
	}
	
	public int hoursScheduled(ArrayList<ArrayList<String>> schedule, String name) {
		int hours=0;
		for(int i=0; i<schedule.size(); i++) {
			//if(schedule.get(i))
		}
		return hours;
		
	}
	
	public ArrayList createSchedule(ArrayList<ArrayList<String>> availability, ArrayList<ArrayList<String>> calender) {
		ArrayList<String> day=new ArrayList<String>();
		//System.out.println(calender.get(0).size());
		for(int i=0; i<calender.get(0).size(); i++) {
			if(isAvailable(availability, calender.get(1).get(i), calender.get(0).get(i))) {
				day.add(calender.get(0).get(i));
				day.add(calender.get(1).get(i));
				day.add( availability.get(name).get(0));
			}
			
		}
		
		schedule.add(day);
		return schedule;
	}
	
}
