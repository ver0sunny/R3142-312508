package commands;

import collectionInfo.FormOfEducation;
import collectionInfo.Semester;
import collectionInfo.StudyGroup;
import exceptions.WrongScriptInputException;
import managers.*;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Supplier;

public class AddCommand extends AbstractCommand implements Command{
    FileManager fileManager = new FileManager(System.getProperty("fileName"));
    Scanner sc = new Scanner(System.in);
    private CollectionManager collectionManager = new CollectionManager(fileManager);
    private InputAndVerifier inputAndVerifier = new InputAndVerifier(sc);

    public AddCommand() {
        super("add {element}", "addition of a new element to the collection");
    }

    @Override
    public boolean execute() throws WrongScriptInputException {
            StudyGroup studGr = new StudyGroup(null,null,LocalDateTime.now(),null,null,0,0,null,null);
            studGr.setId(collectionManager.generateId());
            studGr.setName(inputAndVerifier.askName());
            System.out.println("me here");
            studGr.setGroupAdmin(inputAndVerifier.askAdminInfo());
            studGr.setCoordinates(inputAndVerifier.askCoordinates());
            studGr.setStudentsCount(inputAndVerifier.askStudentsCount());
            studGr.setShouldBeExpelled(inputAndVerifier.askShouldBeExpelled());
            studGr.setFormOfEducation(inputAndVerifier.askFormOfEducation());
            studGr.setSemester(inputAndVerifier.askSemester());
            collectionManager.addToCollection(studGr);

//            collectionManager.addToCollection(new StudyGroup(
//                    collectionManager.generateId(),
//                    inputAndVerifier.askName(),
//                    LocalDateTime.now(),
//                    inputAndVerifier.askAdminInfo(),
//                    inputAndVerifier.askCoordinates(),
//                    inputAndVerifier.askStudentsCount(),
//                    inputAndVerifier.askShouldBeExpelled(),
//                    inputAndVerifier.askFormOfEducation(),
//                    inputAndVerifier.askSemester() ) );

            ConsoleManager.print("Study Group added successfully");
            return true;

//        }catch (WrongScriptInputException e ) {
//            ConsoleManager.printerror("something went wrong");
//        }
//        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AddCommand that = (AddCommand) o;
        return fileManager.equals(that.fileManager) &&
                sc.equals(that.sc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fileManager, sc);
    }
}
