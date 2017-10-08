package junior._3XML;

import junior._1HTTP.SendHttpRequest;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Created by roman on 03-Dec-14.
 */
public class ParseSOAPmessage {

    static String operation;
    static String qNameStart = "dlwmin:";
    static String qNameEnd = "Response";


    public static void main(String[] args) {

        String string = "<soapenv:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\"\n" +
                "                  xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "<env:Header/>\n" +
                "<soapenv:Body>\n" +
                "    <dlwmin:getAccountsListResponse xmlns:dlwmin=\"http://b2/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "        <return xsi:type=\"accountsParams\">\n" +
                "            <accountNo>26206002149593</accountNo>\n" +
                "            <currencyId>980</currencyId>\n" +
                "            <summaNow>0</summaNow>\n" +
                "        </return>\n" +
                "        <return xsi:type=\"accountsParams\">\n" +
                "            <accountNo>26208000149593</accountNo>\n" +
                "            <currencyId>980</currencyId>\n" +
                "            <summaNow>147</summaNow>\n" +
                "        </return>\n" +
                "        <return xsi:type=\"accountsParams\">\n" +
                "            <accountNo>26259015149593</accountNo>\n" +
                "            <currencyId>980</currencyId>\n" +
                "            <summaNow>69496</summaNow>\n" +
                "        </return>\n" +
                "        <return xsi:type=\"accountsParams\">\n" +
                "            <accountNo>26252001149593</accountNo>\n" +
                "            <currencyId>980</currencyId>\n" +
                "            <summaNow>0</summaNow>\n" +
                "        </return>\n" +
                "        <return xsi:type=\"accountsParams\">\n" +
                "            <accountNo>26253000149593</accountNo>\n" +
                "            <currencyId>980</currencyId>\n" +
                "            <summaNow>0</summaNow>\n" +
                "        </return>\n" +
                "    </dlwmin:getAccountsListResponse>\n" +
                "</soapenv:Body>\n" +
                "</soapenv:Envelope>";





        try {

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {

                boolean bName = false;

                public void startElement(String uri, String localName, String qName,
                                         Attributes attributes) throws SAXException {

//                    System.out.println("Start Element :" + qName);

                    if (qName.startsWith(qNameStart)) {
                        operation = qName.replace(qNameStart, "").replace(qNameEnd, "");
                        System.out.println(operation);
                        bName = true;
                    }
                }

//                public void endElement(String uri, String localName,
//                                       String qName) throws SAXException {
//
//                    System.out.println("End Element :" + qName);
//
//                }

//                public void characters(char ch[], int start, int length) throws SAXException {
//
//                    if (bName) {
//                        System.out.println("!!!!!! getAccountsList : " + new String(ch, start, length));
//                        bName = false;
//                    }
//                }

            };

            InputStream inputStream = new ByteArrayInputStream(string.getBytes(StandardCharsets.UTF_8));

            saxParser.parse(inputStream, handler);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
