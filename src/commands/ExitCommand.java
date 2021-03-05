package commands;

public class ExitCommand extends AbstractCommand {

    public ExitCommand(String name, String description) {
        super("exit", "completes program, without no data saved to file");
    }

    @Override
    public void execute(String command) {

    }
}
