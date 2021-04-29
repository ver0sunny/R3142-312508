import commands.*;
import exceptions.WrongScriptInputException;
import managers.*;

import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws WrongScriptInputException {

        System.setProperty("fileName", "groupsCollection.json");

        Scanner userInput = new Scanner(System.in);
        InputAndVerifier inputAndVerifier = new InputAndVerifier(userInput);


        FileManager fileManager = new FileManager(System.getProperty("fileName"));
        CollectionManager collectionManager = new CollectionManager(fileManager);
        ConsoleManager consoleManager = new ConsoleManager();
        CommandFactory commandFactory = new CommandFactory(collectionManager,inputAndVerifier, new AddCommand(collectionManager,inputAndVerifier),
                                                            new AddIfMinCommand(collectionManager,inputAndVerifier), new ClearCommand(collectionManager),
                                                            new ExecuteScript(), new Exit(), new FilterByFormOfEducationCommand(collectionManager),
                                                            new HelpCommand(), new History(), new InfoCommand(collectionManager),
                                                            new InsertAtCommand(collectionManager), new PrintDecendingBySemester(collectionManager),
                                                            new RemoveByIdCommand(collectionManager), new RemoveByStudentCount(collectionManager),
                                                            new SaveCommand(collectionManager), new ShowCommand(collectionManager), new UpdateCommand(collectionManager,inputAndVerifier) );
        CommandManager commandManager = new CommandManager(collectionManager,commandFactory,inputAndVerifier);

        commandManager.execute("add_if_min");
//        collectionManager.saveCollection();
//        System.out.println(collectionManager.toString());
//        collectionManager.sortCollection();
//        System.out.println(collectionManager.toString());



    }

}
