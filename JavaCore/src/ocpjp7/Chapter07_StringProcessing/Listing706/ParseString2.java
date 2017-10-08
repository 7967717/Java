package ocpjp7.Chapter07_StringProcessing.Listing706;


/*ocpjp7*/



public class ParseString2 {
	public static void main(String[] args) {
		String str = "c:\\work\\programs\\parser";
		String [] dirList = str.split("\\\\");
		for (int i=0; i<dirList.length; i++) {
			System.out.println(dirList[i]);
		}
	}
}
