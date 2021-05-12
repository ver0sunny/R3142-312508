package commands;

import collectionInfo.FormOfEducation;
import collectionInfo.StudyGroup;
import exceptions.CollectionIsEmptyException;
import exceptions.NoArgumentProvidedException;
import exceptions.WrongScriptInputException;
import managers.CollectionManager;
import managers.ConsoleManager;

import java.util.LinkedList;

public class FilterByFormOfEducationCommand extends AbstractCommand {

    private CollectionManager collectionManager;

    public FilterByFormOfEducationCommand(CollectionManager collectionManager) {
        super("filter_greater_than_form_of_education <formOfEducation>", "displays elements with a greater value of the formOfEducation field than the one provided");
        this.collectionManager = collectionManager;
    }

    @Override
    public boolean execute(String arg) {
        try {
            if (arg == "") throw new IllegalArgumentException();
            FormOfEducation formOfEducation = FormOfEducation.valueOf(arg.toUpperCase());
            LinkedList<StudyGroup> list = collectionManager.greaterThanByFormOfEducation(formOfEducation);
            ConsoleManager.println(list.toString());
            return true;
        }catch (CollectionIsEmptyException e) {
            ConsoleManager.printerror("Collection is empty T-T");
        }catch (IllegalArgumentException e) {
            ConsoleManager.printerror("No filtering parameter provided or no such form of education exists, enter correct form of education");
        }
        return false;
    }
}
