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
        if (collectionManager.getCollectionSize() == 0) {
            ConsoleManager.println("This collection is already empty! Nothing to clear out");
            return false;
        }
        collectionManager.clearCollection();
        ConsoleManager.println("Collection cleared! Now it's so empty... ( •́ ‸ • ̀)");
        return true;
    }
}
