package core._1procedural.string;

/**
 * Created by RomanR on 07-Jul-14.
 */
public class SplitString {
    public static void main(String[] args) {
        String s = "jdbc/pool/CM,jdbc/pool/CRMDB,jdbc/pool/DMDB,jdbc/pool/EXADATA,jdbc/pool/EXADATA_ONLINE";
        String[] sa = s.split(",");
        for (String ss : sa){
            System.out.println(ss);
        }
    }
}
