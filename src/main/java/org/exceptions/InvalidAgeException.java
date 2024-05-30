package org.exceptions;

public class InvalidAgeException extends Exception{
    public InvalidAgeException() {
        super("Invalid age provided");
    }

    // Constructor que acepta un mensaje personalizado
    public InvalidAgeException(String message) {
        super(message);
    }

    // Constructor que acepta un mensaje personalizado y una causa
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public static void ageC(int age) throws InvalidAgeException{
        if (age < 18)
            throw new InvalidAgeException();
        else {
            System.out.println("welcome to vote");
        }
    }
    public static void main(String[] args) {
        try {
            ageC(17);
        }catch (InvalidAgeException e){
            System.out.println(e);
        }
    }
}
