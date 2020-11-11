package yearanddate;
import java.util.Scanner;


public class mintoyearanddate {
	double minutetodays=0.00;
	double minutetoyears=0.00;
	int remaniningminute = 0;
	int year = 0;
	int day =0;

	
	public double mintodays(double minute) {
	return minutetodays=minute/1440;
	}
	
	public double mintoyear(double minute) {	
	return minutetoyears=minute/525600;
	}
	
	public int minutoyear(int minute) {
		return year = minute/525600;
		
		}
	
	public int remaniningmintoday(int minute) {
		
		 int yr = minute/525600;
		day = minute/1440;
		return remaniningminute = day % 365;
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter minutes :");
		int minute =input.nextInt();
		
		mintoyearanddate mtod = new mintoyearanddate();
		double convertionofmintoday = mtod.mintodays(minute);
		System.out.println("minutes in total number of days "+convertionofmintoday);
		
		mintoyearanddate mtoy = new mintoyearanddate();
		double convertionofmintoyear = mtoy.mintoyear(minute);
		System.out.println("minutes in total number of days "+convertionofmintoyear);
		
		mintoyearanddate mintoyr = new mintoyearanddate();
		int covrtmintoyr = mintoyr.minutoyear(minute);
		
		mintoyearanddate remmintoday = new mintoyearanddate();
		int covrtmintoday = remmintoday.remaniningmintoday(minute);
		System.out.println(minute +" minutes is equal to "+covrtmintoyr+ " year and "+covrtmintoday +" days");

	}
}
