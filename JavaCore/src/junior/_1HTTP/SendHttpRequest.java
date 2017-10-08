package junior._1HTTP;

import java.io.*;
import java.net.*;

/**
 * Created by RomanR on 05-Sep-14.
 */
public class SendHttpRequest {

        public String getHTML(String urlToRead) {
            URL url;
            HttpURLConnection conn;
            BufferedReader rd;
            String line;
            String result = "";
            try {
                url = new URL(urlToRead);
                conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                while ((line = rd.readLine()) != null) {
                    result += line;
                }
                rd.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return result;
        }

        public static void main(String args[])
        {
            SendHttpRequest c = new SendHttpRequest();
            System.out.println(c.getHTML("http://10.16.3.185:2291/GET_SUBS_INFO?CHANNEL=WWW&INFO=8&SUBS=380962300000&LOGIN=TEST_USER1&PASSWORD=1111"));
        }
    }
