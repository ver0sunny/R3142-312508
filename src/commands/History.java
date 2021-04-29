package commands;

public class History extends AbstractCommand {

    public History() {
        super("history", "displays 12 previous commands with no argument(s)");
    }

    @Override
    public boolean execute(String arg) {
        return true;

    }

}
