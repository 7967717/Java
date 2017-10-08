package ocpjp7.Chapter09_NIO2.Listing912;
/*ocpjp7*/


import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) {
        System.out.println("file name:" + path.getFileName());
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes fileAttributes) {
        System.out.println("----------Directory name:" + path + "----------");
        //rename dir
//        String name = path.toString();
//        String newName = name.replaceAll("-", "");
//        path.toFile().renameTo(new File(newName));
        return FileVisitResult.CONTINUE;
    }
}
