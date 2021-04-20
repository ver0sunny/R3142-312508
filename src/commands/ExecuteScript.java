package commands;

public class ExecuteScript extends AbstractCommand {


    public ExecuteScript(String name, String description) {
        super("execute_script <file_name>", "compiles script from the provided file");
    }

    @Override
    public boolean execute() {
        return true;

    }
}
