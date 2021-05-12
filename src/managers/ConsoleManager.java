package managers;

import commands.Command;
import exceptions.NoArgumentProvidedException;
import exceptions.NoSuchCommandException;
import sun.security.krb5.SCDynamicStoreConfig;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConsoleManager {

    private Scanner userInput;
    private CommandManager commandManager;

    public ConsoleManager(Scanner userInput, CommandManager commandManager) {
        this.userInput = userInput;
        this.commandManager = commandManager;
    }

    public void normalMode() {
        String[] command;
        try {
            do {
                command = (userInput.nextLine().trim() + " ").split(" ", 2);
                command[1] = command[1].trim();
//        commandManager.addToHistory();
                commandManager.execute(command[0], command[1]);

            } while (true);
        } catch (NoSuchElementException exception) {
            ConsoleManager.printerror("No user input detected");
        } catch (IllegalStateException exception) {
            ConsoleManager.printerror("Something unexpected went wrong");
        } catch (NoSuchCommandException e) {
            ConsoleManager.printerror("No such command exist, check the list of available commands by calling 'help' command");
        }
    }

    public void scriptMode() {
        String[] command = {"", ""};
    }

    public static void print(Object someThing) {
        System.out.print(someThing);
    }

    public static void println(Object someThing) {
        System.out.println(someThing);
    }

    public static void printerror(Object someThing) {
        System.out.println("ERROR~ERROR ~ " + someThing);
    }

    @Override
    public String toString() {
        return "Console - works with output and input";
    }

}
