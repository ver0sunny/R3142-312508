package commands;

import managers.ConsoleManager;

public class HelpCommand extends AbstractCommand {

    public HelpCommand() {
        super("help", "info on available commands");
    }

    @Override
    public boolean execute(String arg) {
        ConsoleManager.println(AddCommand.toString());
        return true;

    }
}
