package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing509;


/*ocpjp7*/


public class Logger {
    private Logger() {
        // private constructor
    }

    private static Logger myInstance;

    public static Logger getInstance() {
        if (myInstance == null) {
            synchronized (Logger.class) {
                myInstance = new Logger();
            }
        }
        return myInstance;
    }

    public void log(String s) {
        // log implementation
        System.err.println(s);
    }
}
