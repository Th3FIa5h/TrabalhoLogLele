import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
class LoggerFile implements Logger {
    private static final String FILE_NAME = "log.txt";


    public void log(Level level, String message) {
        String logMessage = LocalDateTime.now() + " " + level + ": " + message + "\n";
        try {
            Files.write(Paths.get(FILE_NAME), logMessage.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo");
            e.printStackTrace();
        }
    }
}