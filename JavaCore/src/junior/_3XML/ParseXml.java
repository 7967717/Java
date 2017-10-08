package junior._3XML;

import junior._1HTTP.SendHttpRequest;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Created by RomanR on 08-Sep-14.
 */
public class ParseXml {

    public static void main(String[] args) {

//        String url = "http://10.16.3.185:2291/GET_SUBS_INFO?CHANNEL=WWW&INFO=8&SUBS=380962300000&LOGIN=TEST_USER1&PASSWORD=1111";
//        String url = "C:\\Users\\romanr\\Documents\\WorkProjectsNew\\ChargeChecker\\test.xml";



        try {

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {

                boolean bName = false;

                public void startElement(String uri, String localName, String qName,
                                         Attributes attributes) throws SAXException {

//                    System.out.println("Start Element :" + qName);

                    if (qName.equalsIgnoreCase("BILLING_TYPE")) {
                        bName = true;
                    }
                }

//                public void endElement(String uri, String localName,
//                                       String qName) throws SAXException {
//
////                    System.out.println("End Element :" + qName);
//
//                }

                public void characters(char ch[], int start, int length) throws SAXException {

                    if (bName) {
                        System.out.println("Billing type : " + new String(ch, start, length));
                        bName = false;
                    }
                }

            };

            SendHttpRequest request = new SendHttpRequest();
            String url = "http://10.16.3.185:2291/GET_SUBS_INFO?CHANNEL=WWW&INFO=8&SUBS=380962300000&LOGIN=TEST_USER1&PASSWORD=1111";
            InputStream inputStream = new ByteArrayInputStream(request.getHTML(url).getBytes(StandardCharsets.UTF_8));

            saxParser.parse(inputStream, handler);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
