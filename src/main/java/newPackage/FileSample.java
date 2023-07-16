package newPackage;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class FileSample {
    public  static  void main(String[] args) throws IOException{
//        how to create a file

//        Path path = Path.of("src","main","java","newPackage","second-file.txt");
//
//        Files.createFile(path);


//        how to create directory
//        Path path = Path.of("directory");
//        Files.createDirectories(path);

//
//        Path path = Path.of("src\\dir\\dir2");
//        Files.createDirectories(path);

        Path path = Paths.get("C:\\Users\\Favour Nwadike\\IdeaProjects\\file");
       DirectoryStream<Path> contents = Files.newDirectoryStream(path);
//        for (Path content:contents) {
//            System.out.println(content.getFileName());
//
//        }
        Iterator<Path> iterator = contents.iterator();
        while (iterator.hasNext()){
            Path  content = iterator.next();
            System.out.println(content.getFileName());
        }
    }
}
