package commands;

public interface Command {
    void execute(String command);
    String getName();
    String getDescription();
}
