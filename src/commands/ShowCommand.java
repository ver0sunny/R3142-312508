package commands;

import managers.CollectionManager;
import managers.ConsoleManager;

public class ShowCommand extends AbstractCommand {

    private CollectionManager collectionManager;

    public ShowCommand(CollectionManager collectionManager) {
        super("show","displays all collection elements");
        this.collectionManager = collectionManager;
    }

    @Override
    public boolean execute(String arg) {
        ConsoleManager.println(collectionManager);
        return true;

    }
}
