package ocpjp7.Chapter12_localization.Listing1215;
/*ocpjp7*/




import java.util.*;
import java.text.*;

// Use SimpleDateFormat for creating custom date and time formats as a "pattern string" 
class PatternStringExample {
    public static void main(String[] args) {
        String pattern = "dd-MM-yy-u"; /* d for day, M for month, y for year */
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
// the default Date constructor initializes to current date/time 
        System.out.println(formatter.format(new Date()));
    }
}
