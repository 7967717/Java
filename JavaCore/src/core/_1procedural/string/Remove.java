package core._1procedural.string;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author romanr on 1/27/2017.
 */
public class Remove {
    public static void main(String[] args) {
//        String s1 = "/app:company_home/cm:Shared/cm:SalesOpps/cm:Plexcode/cm:test/cm:test0";
        String s1 = "/app:company_home/cm:Shared/cm:SalesOpps/cm:Plexcode";
//        String s1 = "/app:company_home/cm:Shared/cm:SalesOpps";
//        String s1 = "/app:company_home/app:Shared/cm:SalesOpps/cm:Plexcode/cm:test/cm:test0";
//        System.out.println(s.replaceAll("cm:", "").substring(s.lastIndexOf("SalesOpps/") + 4));
//        System.out.println(s1.replaceAll("cm:", "").substring(s1.lastIndexOf("SalesOpps/") + 4));

        s1 = s1.replaceAll("cm:", "");
        System.out.println(s1);
        s1 = s1.substring(s1.indexOf("SalesOpps"));
        System.out.println(s1);
//        System.out.println(s1.substring(s1.indexOf("/") + 1));



//        String s = "SalesOpps/Plexcode/test/test0";
//        System.out.println(s.substring(s.lastIndexOf("/") + 1));
//        System.out.println(s.substring(0, s.lastIndexOf("/")));
//        System.out.println(LocalDateTime.now());
    }
}
