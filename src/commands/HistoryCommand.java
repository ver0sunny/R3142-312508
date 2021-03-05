package commands;

public class HistoryCommand extends AbstractCommand {

    public HistoryCommand(String name, String description) {
        super("history", "displays 12 previous commands with no argument(s)");
    }

    @Override
    public void execute(String command) {

    }
}
