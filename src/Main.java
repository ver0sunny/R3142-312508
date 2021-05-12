import commands.*;
import exceptions.WrongScriptInputException;
import managers.*;

import java.io.File;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws WrongScriptInputException {

        System.setProperty("fileName", "groupsCollection.json");

        System.setProperty("scriptName", "commandScript.txt");

        Scanner userInput = new Scanner(System.in);
        InputAndVerifier inputAndVerifier = new InputAndVerifier(userInput);
        FileManager fileManager = new FileManager(System.getProperty("fileName"));
        CollectionManager collectionManager = new CollectionManager(fileManager);
        HistoryManager historyManager = new HistoryManager();
        CommandFactory commandFactory = new CommandFactory(collectionManager,inputAndVerifier, new AddCommand(collectionManager,inputAndVerifier),
                                                            new AddIfMinCommand(collectionManager,inputAndVerifier), new ClearCommand(collectionManager),
                                                            new ExecuteScript(), new ExitCommand(), new FilterByFormOfEducationCommand(collectionManager),
                                                            new HelpCommand(), new History(historyManager), new InfoCommand(collectionManager),
                                                            new InsertAtCommand(collectionManager, inputAndVerifier), new PrintDecendingBySemester(collectionManager),
                                                            new RemoveByIdCommand(collectionManager), new RemoveByStudentCount(collectionManager),
                                                            new SaveCommand(collectionManager), new ShowCommand(collectionManager), new UpdateCommand(collectionManager,inputAndVerifier) );
        CommandManager commandManager = new CommandManager(historyManager,collectionManager,commandFactory,inputAndVerifier);
        ConsoleManager consoleManager = new ConsoleManager(userInput,commandManager);
        consoleManager.normalMode();

    }

}
