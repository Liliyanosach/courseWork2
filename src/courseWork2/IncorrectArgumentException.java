package courseWork2;

public class IncorrectArgumentException extends RuntimeException{

    private final String argument;

    public IncorrectArgumentException(String message, String argument) {
        super(message);
        this.argument = argument;
    }

    public String getArgument() {
        return argument;
    }

    @Override
    public String toString() {
        return "Ввод данных некорректен!\n";
    }
}
