package core._3NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author romanr on 1/12/2017.
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        Path path0 = Paths.get("C:\\tmp\\activiti-app0.properties");
        Path path1 = Paths.get("C:\\tmp\\new\\");

        Files.copy(path0, path1);
    }
}
