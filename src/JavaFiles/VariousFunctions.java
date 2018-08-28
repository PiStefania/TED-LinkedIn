package JavaFiles;

import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class VariousFunctions {
	
	public static boolean isValidEmailAddress(String email) {
        return email.matches("[a-zA-Z0-9\\.]+@[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9]+");
	}

	public boolean isBlank(String str) {
		
		System.out.println("in isBlank");
		
	    if (str == null || str.equals("")) {
	    	System.out.println("first if");
	    	
	        return true;
	    }
	    for (int i = 0; i < str.length(); i++) {
	        if ((Character.isWhitespace(str.charAt(i)) == false)) {
	        	
	        	System.out.println("false");
	            return false;
	        }
	    }
	    
	    System.out.println("end true");
	    return true;
	}
	
	public static String getDateInterval(Date initDate) {
		Date d2 = new Date();

		String finalDate = null;
		try {
			//in milliseconds
			long diff = d2.getTime() - initDate.getTime();
			
			long minutes = TimeUnit.MINUTES.convert(diff, TimeUnit.MILLISECONDS);
			if(minutes >= 60) {
				long hours = TimeUnit.HOURS.convert(diff, TimeUnit.MILLISECONDS);
				if(hours >= 24) {
					long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
					if(days >= 7) {
						long weeks = days / 7;
						if(weeks >= 4) {
							YearMonth m1 = YearMonth.from(initDate.toInstant());
						    YearMonth m2 = YearMonth.from(initDate.toInstant());
						    long months = m1.until(m2, ChronoUnit.MONTHS) + 1;
						    finalDate = String.valueOf(months) + "mo";
						}else {
							finalDate = String.valueOf(weeks) + "w";
						}
					}else {
						finalDate = String.valueOf(days) + "d";
					}
				}else {
					finalDate = String.valueOf(hours) + "h";
				}
			}else {
				finalDate = String.valueOf(minutes) + "m";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return finalDate;
	}

}