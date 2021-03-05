package commands;

import java.util.Objects;

public abstract class AbstractCommand implements Command {
    private String name;
    private String description;

    public AbstractCommand(String name, String description) {
        this.description = description;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name + "(" + description + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractCommand that = (AbstractCommand) o;
        return name.equals(that.name) && description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + description.hashCode();
    }
}
