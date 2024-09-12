package telran.datesort.model;
public class SortByDates {
    public static String format(String date) {
        if (date.contains("-")) {
           
            String[] parts = date.split("-");
            return parts[2] + parts[1] + parts[0];
        } else if (date.contains("/")) {
            
            String[] parts = date.split("/");
            return parts[2] + parts[1] + parts[0]; 
        }
        return date; 
    }
}
