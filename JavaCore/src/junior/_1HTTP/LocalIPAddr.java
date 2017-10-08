package junior._1HTTP;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by RomanR on 01-Oct-14.
 */
public class LocalIPAddr {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress IP = InetAddress.getLocalHost();
        System.out.println("IP of my system is := "+IP.getHostAddress());
    }
}
