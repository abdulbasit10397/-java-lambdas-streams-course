package section8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileHandlingUsingFP {
    public static void main (String[] args) throws IOException {
        System.out.println("*********** Reading File *************");
        readFile();
        System.out.println("\n");

        System.out.println("*********** Reading Distinct Words From File *************");
        readDistinctWordsFromFile();
        System.out.println("\n");

        System.out.println("*********** Print Files Located at Project Root *************");
        listRootLevelFiles();
        System.out.println("\n");

        System.out.println("*********** Filter Only Directories From Files Located at Project Root *************");
        filterDirsFromRootFiles();
        System.out.println("\n");
    }

    private static void filterDirsFromRootFiles() throws IOException {
        Files.list(Paths.get("."))
                .filter(Files::isDirectory)
                .forEach(System.out::println);
    }

    private static void listRootLevelFiles() throws IOException {
        Files.list(Paths.get(".")).forEach(System.out::println);
    }

    public static void readFile () throws IOException {
        Files.lines(Paths.get("file.txt")).forEach(System.out::println);
    }

    public static void readDistinctWordsFromFile () throws IOException {
        Files.lines(Paths.get("file.txt"))
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);
    }
}
