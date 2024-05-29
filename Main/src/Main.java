
public class Main {
    public static void main(String[] args) {
        LoggerFactory factory = new LoggerFactory();

        Logger consoleLogger = factory.onConsole();
        consoleLogger.log(Level.DEBUG, "este é um debug message.");
        consoleLogger.log(Level.WARNING, "este é um warning message.");
        consoleLogger.log(Level.ERROR, "este é um error message.");

        Logger fileLogger = factory.onFile();
        fileLogger.log(Level.DEBUG, "este é um  debug message.");
        fileLogger.log(Level.WARNING, "Este é um warning message.");
        fileLogger.log(Level.ERROR, "este é um error message.");
    }
}