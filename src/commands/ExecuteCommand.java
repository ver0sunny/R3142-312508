package commands;

public class ExecuteCommand extends AbstractCommand {


    public ExecuteCommand(String name, String description) {
        super("execute_script <file_name>", "compiles script from the provided file");
    }

    @Override
    public void execute(String command) {

    }
}
