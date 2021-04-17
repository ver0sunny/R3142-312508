import collectionInfo.Coordinates;
import collectionInfo.Person;
import collectionInfo.Semester;
import collectionInfo.StudyGroup;
import managers.FileManager;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(Semester.listAll());
        FileManager fileManager = new FileManager();
        LinkedList<StudyGroup> col = fileManager.readFile();
        System.out.println(col.toString());


    }

}
