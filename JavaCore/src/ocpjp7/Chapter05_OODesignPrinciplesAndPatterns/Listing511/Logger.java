package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing511;


/*ocpjp7*/



public class Logger {
	private Logger() {
		// private constructor
	}
	private static Logger myInstance;
	private static class LoggerHolder {
		private static Logger logger = new Logger();
	}
	public static Logger getInstance() {
		return LoggerHolder.logger;
	}
	public void log(String s) {
		// log implementation
		System.err.println(s);
	}
}