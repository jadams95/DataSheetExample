package example;

public class ExcelException extends RuntimeException {
    ExcelException(String message){
        super(message);
    }
    ExcelException(String message, Throwable cause){
        super(message, cause);
    }
}
