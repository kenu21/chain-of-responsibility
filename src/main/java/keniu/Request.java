package keniu;

public class Request {
    private final Type type;
    private final Level level;
    private final String description;

    public Request(Type type, Level level, String description) {
        this.type = type;
        this.level = level;
        this.description = description;
    }

    public enum Type {
        HARDWARE, SOFTWARE, NETWORK
    }

    public enum Level {
        LOW, MEDIUM, HIGH
    }

    public Level getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Request{" +
                "type=" + type +
                ", level=" + level +
                ", description='" + description + '\'' +
                '}';
    }
}
