package GenericPackage;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int tofetchRandomNumber(int value1) {
		Random r=new Random();
		int value = r.nextInt(1000);
		return value;
	}
	public String toFetchDateAndTime() {
		Date d=new Date();
		String date[]=d.toString().split(" ");
		String day = date[0];
		String month = date[1];
		String date1 = date[2];
		String time = date[3].replace(":", "-");
		String year = date[5];
		String finalDate=day+" "+month+" "+date1+" "+time+" "+year;
		return finalDate;
	}

}
