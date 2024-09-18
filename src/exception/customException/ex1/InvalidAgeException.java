package exception.customException.ex1;

// class representing custom exception
public class InvalidAgeException extends Exception {

    public InvalidAgeException(String str) {
        // calling the constructor fo parent Exception
        super(str);
    }
}
