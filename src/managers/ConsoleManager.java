package managers;

public class ConsoleManager {

    public static void print(Object someThing) {
        System.out.print(someThing);
    }

    public static void println(Object someThing) {
        System.out.println(someThing);
    }

    public static void printerror(Object someThing) {
        System.out.println("ERROR~ERROR ~ " + someThing);
    }

    @Override
    public String toString() {
        return "Console - works with output";
    }

}
