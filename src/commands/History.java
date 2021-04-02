package commands;

public class History extends AbstractCommand {

    public History(String name, String description) {
        super("history", "displays 12 previous commands with no argument(s)");
    }

    @Override
    public void execute(String command) {

    }
}
