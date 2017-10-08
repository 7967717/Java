package ocpjp7.Chapter09_NIO2.Listing904;
/*ocpjp7*/



import java.io.IOException;
import java.nio.file.*;

// illustrates how to use File class to compare two paths 
class PathCompare2 {
	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("Test");
		Path path2 = Paths.get("D:\\OCPJP7\\programs\\NIO2\\Test");

		System.out.println("Files.isSameFile(path1, path2) is: " 
				+ Files.isSameFile(path1, path2));
	}
}