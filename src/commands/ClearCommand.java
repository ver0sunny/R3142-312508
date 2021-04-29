package commands;

import managers.CollectionManager;
import managers.ConsoleManager;

public class ClearCommand extends AbstractCommand {

    private CollectionManager collectionManager;

    public ClearCommand(CollectionManager collectionManager) {
        super("clear", "empties collection");
        this.collectionManager = collectionManager;
    }

    @Override
    public boolean execute(String args) {
        collectionManager.clearCollection();
        ConsoleManager.printerror("Collection cleared!");
        return true;
    }
}
