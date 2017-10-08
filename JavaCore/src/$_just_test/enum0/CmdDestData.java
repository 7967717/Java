package $_just_test.enum0;

import java.util.HashSet;

import static $_just_test.enum0.CmdDestData.CmdDest.LFACS;
import static $_just_test.enum0.CmdDestData.CmdDest.PPLAT;
import static $_just_test.enum0.CmdDestData.CmdDest.SOAC;


/**
 * @author roman.rudenko on 26-Jul-16.
 */
public class CmdDestData {
    private static final String SOAC_DEST = "SOAC";
    private static final String LFACS_DEST = "LFACS";
    private static final String PPLAT_DEST = "PPLAT";

    public static String getCommandSystem(String command) {
        String dest = null;
        if (SOAC.contains(command)) {
            dest = SOAC_DEST;
        } else if (LFACS.contains(command)){
            dest = LFACS_DEST;
        } else if (PPLAT.contains(command)){
            dest = PPLAT_DEST;
        }
        return dest;
    }

    enum CmdDest {
        SOAC(new String[]{"ACK GI", "ASG-SEC", "ASSIST SO"}),
        LFACS(new String[]{"ADD ATRAN", "ADD BTERM", "ADD CA"}),
        PPLAT(new String[]{"ADM REF", "ADM SCHED", "ADM WS"});

        CmdDest(String[] values) {
            this.commands = values;
        }

        private String[] commands;

        boolean contains(String value) {
            for (String command : commands) {
                if (command.equals(value)) {
                    return true;
                }
            }
            return false;
        }

    }

}


