package textbook.chapter6.example7;

public class DangerException extends Exception {
    final String message = "超重";

    public String warnMess() {
        return message;
    }
} 
