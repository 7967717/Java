package ocpjp7.Chapter06_GenericsAndCollections.Listing605;


/*ocpjp7*/



class BoxPrinterTest4 {
	public static void main(String []args) {
		BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(new Integer(10)); 
		System.out.println(value1);
		Integer intValue1 = value1.getValue(); 
 
		BoxPrinter<String> value2 = new BoxPrinter<String>("Hello world"); 
		System.out.println(value2);
		// OOPs! by mistake, we did put String in an Integer 
//		Integer intValue2 = value2.getValue();
	}
}