import collectionInfo.*;
import commands.AddCommand;
import commands.Command;
import exceptions.WrongScriptInputException;
import managers.*;
import sun.awt.image.ImageWatched;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) throws WrongScriptInputException {
//        Scanner userScanner = new Scanner(System.in);
//        final String fileName = System.getenv("fileName");
        System.setProperty("fileName", "groupsCollection.json");
//        System.out.println(System.getProperty("fileName"));


//        System.out.println(Semester.listAll());
//        String fileName = "groupsCollection.json";
        FileManager fm = new FileManager(System.getProperty("fileName"));
//        LinkedList<StudyGroup> col = fm.readFile();
//        System.out.println(col);
//        Supplier<CommandFactory> cf = CommandFactory::new;
//        cf.get().getCommand("add").execute();
//        CommandManager cm  = new CommandManager();
//        cm.execute("ADD");


        CollectionManager cm = new CollectionManager(fm);
        Scanner sc = new Scanner(System.in);
        InputAndVerifier iav = new InputAndVerifier(sc);
//            iav.askAdminInfo();

        ConsoleManager consoleManager = new ConsoleManager();
        CommandManager commandManager = new CommandManager();
//        commandManager.execute("ADD");

        StudyGroup studGr = new StudyGroup(null,null,LocalDateTime.now(),null,null,0,0,null,null);
        studGr.setId(cm.generateId());
        studGr.setName(iav.askName());
        System.out.println("me here");
        studGr.setGroupAdmin(iav.askAdminInfo());
        studGr.setCoordinates(iav.askCoordinates());
        studGr.setStudentsCount(iav.askStudentsCount());
        studGr.setShouldBeExpelled(iav.askShouldBeExpelled());
        studGr.setFormOfEducation(iav.askFormOfEducation());
        studGr.setSemester(iav.askSemester());
        cm.addToCollection(studGr);

        System.out.println(cm.toString());

//        LinkedList<StudyGroup> col = cm.getCollection();
//        cm.saveCollection(col);
//        System.out.println(col);

//
//        Coordinates coordinates = new Coordinates(5,77);
///        Person person = new Person("Veronica",175,59,"434939348934");
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
