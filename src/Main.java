import commands.AddCommand;
import exceptions.WrongScriptInputException;
import managers.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws WrongScriptInputException {
        System.setProperty("fileName", "groupsCollection.json");

        Scanner userInput = new Scanner(System.in);
        InputAndVerifier inputAndVerifier = new InputAndVerifier(userInput);


        FileManager fileManager = new FileManager(System.getProperty("fileName"));
        CollectionManager collectionManager = new CollectionManager(fileManager);
        ConsoleManager consoleManager = new ConsoleManager();
        CommandFactory commandFactory = new CommandFactory(collectionManager,inputAndVerifier, new AddCommand(collectionManager,inputAndVerifier));
        CommandManager commandManager = new CommandManager(collectionManager,commandFactory,inputAndVerifier);

        commandManager.execute("ADD");
        System.out.println(collectionManager.toString());



    }

}
