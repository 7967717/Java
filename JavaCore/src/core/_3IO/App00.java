package core._3IO;

import java.io.*;
import java.net.URL;
//import sun.net.www.protocol.http.HttpURLConnection

/**
 * Created by RomanR on 5/26/14.
 */
public class App00 {
    public static void main(String[] args) throws IOException {
        InputStream src = new URL("http://google.com").openStream();
        System.out.println(src.getClass());
//        OutputStream dst = new FileOutputStream("/tmp/google.txt");
//        dst = new BufferedOutputStream(dst);
        copy(src, System.out);
    }

    public static void copy(InputStream src, OutputStream dst) throws IOException {
        while (true) {
            int data = src.read();
            if (data != -1) {
                dst.write(data);
            } else {
                return;
            }
        }

    }
}
