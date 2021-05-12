package commands;

import managers.ConsoleManager;

public class ExitCommand extends AbstractCommand {

    public ExitCommand() {
        super("exit", "completes program, without saving data to the file");
    }

    @Override
    public boolean execute(String arg) {
        ConsoleManager.println("^0^ work done ^3^");
        System.exit(0);
        return true;
    }
}
