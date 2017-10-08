package ocpjp7.Chapter12_localization.Listing1205;
/*ocpjp7*/




import java.util.*;

// Italian version
public class ResBundle_it_IT extends ListResourceBundle {
    public Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents = {
            {"MovieName", "Che Bella Giornata"},
            {"GrossRevenue", (Long) 43000000L}, // in euros
            {"Year", (Integer) 2011}
    };
}
