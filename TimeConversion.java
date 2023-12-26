import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    public static String convertToMilitaryTime(String time12Hour) {
        try {
            // Parse input time
            SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
            Date date = inputFormat.parse(time12Hour);

            // Format output time in military format
            SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return "Invalid input";
        }
    }

    public static void main(String[] args) {
        // Example usage
        String time12Hour = "03:30:00PM";
        String militaryTime = convertToMilitaryTime(time12Hour);
        System.out.println("Original Time: " + time12Hour);
        System.out.println("Military Time: " + militaryTime);
    }
}