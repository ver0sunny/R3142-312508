import collectionInfo.*;
import managers.CollectionManager;
import managers.FileManager;
import sun.awt.image.ImageWatched;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner userScanner = new Scanner(System.in);
//        final String fileName = System.getenv("fileName");
        System.setProperty("fileName","groupsCollection.json");
        System.out.println(System.getProperty("fileName"));


//        System.out.println(Semester.listAll());
//        String fileName = "groupsCollection.json";
        FileManager fm = new FileManager(System.getProperty("fileName"));
        LinkedList<StudyGroup> col = fm.readFile();
        System.out.println(col);
//        Coordinates coordinates = new Coordinates(5,77);
//        Person person = new Person("Veronica",175,59,"434939348934");
//        LinkedList<StudyGroup> linkedStudyGr = new LinkedList<>();
//        StudyGroup studyGroup = new StudyGroup(3,"R7337",LocalDateTime.now(),person,coordinates,56,4, FormOfEducation.FULL_TIME_EDUCATION,Semester.SECOND);
//        linkedStudyGr.add(studyGroup);
//        StudyGroup studyGroup1 = new StudyGroup(5,"P3423",LocalDateTime.now(),person,coordinates,44,5,FormOfEducation.DISTANCE_EDUCATION,Semester.EIGHTH);
//        linkedStudyGr.add(studyGroup1);
//        StudyGroup studyGroup2 = new StudyGroup(7,"A34423",LocalDateTime.now(),person,coordinates,44,5,FormOfEducation.DISTANCE_EDUCATION,Semester.FOURTH);
//        linkedStudyGr.add(studyGroup2);
//        fm.writeToFile(linkedStudyGr);
//        System.out.println(linkedStudyGr.toString());
//        CollectionManager cm = new CollectionManager(fm);
//        System.out.println(cm.getById(7));
//        System.out.println(cm.decendBySemester(linkedStudyGr));


    }

}
