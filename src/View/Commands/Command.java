package View.Commands;

public abstract class Command {
    private String key, description;

    public Command(String k, String desc) {
        key = k;
        description = desc;
    }
    public abstract void execute();
    public String getKey(){
        return key;
    }

    public String getDescription() {
        return description;
    }
}
