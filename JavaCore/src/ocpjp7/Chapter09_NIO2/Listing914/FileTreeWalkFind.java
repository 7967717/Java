package ocpjp7.Chapter09_NIO2.Listing914;
/*ocpjp7*/


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTreeWalkFind {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("usage: FileTreeWalkFind <start-path> <pattern to search>");
            System.exit(-1);
        }
        Path startPath = Paths.get(args[0]);
        String pattern = args[1];
        try {
            Files.walkFileTree(startPath, new MyFileFindVisitor(pattern));
            System.out.println("File search completed!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
