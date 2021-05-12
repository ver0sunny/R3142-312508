package commands;

import managers.CollectionManager;

public class ExecuteScript extends AbstractCommand {


    public ExecuteScript() {
        super("execute_script <file_name>", "compiles script from the provided <file>");
    }

    @Override
    public boolean execute(String arg) {


        return true;

    }
}
