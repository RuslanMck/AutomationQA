package registration;

import customExceptions.WrongLoginException;
import customExceptions.WrongPasswordException;


public class Validator {


    public static boolean validateLogin(String toValidate) throws WrongLoginException {

        boolean result = toValidate.matches("^[a-zA-Z0-9_]{6,20}$");

        if (!result) {
            throw new WrongLoginException("WrongLoginException");
        }

        return result;

    }

    public static boolean validatePassword(String password, String confirmation) throws WrongPasswordException {

        boolean result;

        if (!password.matches("^[a-zA-Z0-9_]{6,20}$")) {
            throw new WrongPasswordException("WrongPasswordException");
        }
        if (!password.equals(confirmation)) {
            throw new WrongPasswordException("WrongPasswordException");
        } else result = true;
        return result;
    }

}
