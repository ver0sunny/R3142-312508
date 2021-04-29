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

public class AddCommand extends AbstractCommand implements Command {
    private CollectionManager collectionManager;
    private InputAndVerifier inputAndVerifier;

    public AddCommand(CollectionManager collectionManager, InputAndVerifier inputAndVerifier) {
        super("add {element}", "addition of a new element to the collection");
        this.collectionManager = collectionManager;
        this.inputAndVerifier = inputAndVerifier;
    }

    @Override
    public boolean execute(String args) {
//        try {
            collectionManager.addToCollection(new StudyGroup(
                    collectionManager.generateId(),
                    inputAndVerifier.askName(),
                    LocalDateTime.now(),
                    inputAndVerifier.askAdminInfo(),
                    inputAndVerifier.askCoordinates(),
                    inputAndVerifier.askStudentsCount(),
                    inputAndVerifier.askShouldBeExpelled(),
                    inputAndVerifier.askFormOfEducation(),
                    inputAndVerifier.askSemester()));
            ConsoleManager.print("Study Group added successfully");
            return true;
//        }catch (WrongScriptInputException e) {
//            ConsoleManager.printerror("Something went wrong...");
//        }
//        return false;
    }
    @Override
    public String toString() {
        return new StringBuilder().append(this.getName()).append(this.getDescription()).toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AddCommand that = (AddCommand) o;
        return Objects.equals(collectionManager, that.collectionManager) &&
                Objects.equals(inputAndVerifier, that.inputAndVerifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), collectionManager, inputAndVerifier);
    }


}
