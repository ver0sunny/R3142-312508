package commands;

public class HelpCommand extends AbstractCommand {

    public HelpCommand(String name, String description) {
        super("help", "info on available commands");
    }

    @Override
    public void execute(String comamand) {

    }
}
