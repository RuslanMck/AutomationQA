package registration;

import customExceptions.WrongLoginException;
import customExceptions.WrongPasswordException;


public class Registration {


    public static boolean registerUser(String login, String password, String confirmPassword) {

        boolean result = true;

        try {
            Validator.validateLogin(login);
            Validator.validatePassword(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            result = false;
        }
        if (result) System.out.println("User " + login + " is registered.");
        return result;
    }
}
