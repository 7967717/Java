package ocpjp7.Chapter06_GenericsAndCollections.Listing602;
/*ocpjp7*/


class BoxPrinterTest1 {
    public static void main(String[] args) {
        BoxPrinter value1 = new BoxPrinter(new Integer(10));
        System.out.println(value1);
        BoxPrinter value2 = new BoxPrinter("Hello world");
        System.out.println(value2);
    }
} 
