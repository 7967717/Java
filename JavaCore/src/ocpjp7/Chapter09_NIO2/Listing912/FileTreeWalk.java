package ocpjp7.Chapter09_NIO2.Listing912;
/*ocpjp7*/


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTreeWalk {
    private static String dir = "/Users/roman/IdeaProjects/JavaCoreNew/src/main/java/io/rr/javapuzzlers";

    public static void main(String[] args) {
//		if(args.length != 1) {
//			System.out.println("usage: FileWalkTree <source-path>");
//			System.exit(-1);
//		}
//		Path pathSource = Paths.get(args[0]);

        Path pathSource = Paths.get(dir);
        try {
            Files.walkFileTree(pathSource, new MyFileVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
