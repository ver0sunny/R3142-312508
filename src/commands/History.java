package commands;

import exceptions.HistoryIsEmptyException;
import managers.ConsoleManager;
import managers.HistoryManager;

import java.util.ArrayDeque;
import java.util.Queue;

public class History extends AbstractCommand {

    private HistoryManager historyManager;

    public History(HistoryManager historyManager) {
        super("history", "displays 12 previous commands with no argument(s)");
        this.historyManager = historyManager;
    }

    @Override
    public boolean execute(String arg) {
        ConsoleManager.println(historyManager.history());
        return true;
    }
}
