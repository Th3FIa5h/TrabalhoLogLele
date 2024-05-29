interface Logger {
    void log(Level level, String message);
}
enum Level {
    WARNING,
    DEBUG,
    ERROR
}