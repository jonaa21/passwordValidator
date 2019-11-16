package com.unasat;

import org.mindrot.jbcrypt.BCrypt;

/**
 * Created by Jonathan on 5/16/2018.
 */
public class PasswordValidatorImpl implements PasswordValidator {

    public boolean validate(String clearTextPassword) {
        return hasMoreThanEigthChars(clearTextPassword)
                && hasMax128Chars(clearTextPassword)
                && hasSingleCapLetter(clearTextPassword)
                && hasSingleSpecialChar(clearTextPassword);
                //&& minimalSingleNumber(clearTextPassword)
                //&& noSpaceAtBeginning(clearTextPassword)
                //&& noSpaceAtEnd(clearTextPassword);
    }

    private boolean hasMoreThanEigthChars(String clearTextPassword) {
        return clearTextPassword.length() >= 8;
    }

    private boolean hasMax128Chars(String clearTextPassword) {
        return clearTextPassword.length() <= 128;
    }

    private boolean hasSingleCapLetter(String clearTextPassword) {
        char[] chars = clearTextPassword.toCharArray();
        for(Character character : chars) {
            if (Character.isUpperCase(character)) {
                return character > 1;
            }
        }
        return clearTextPassword.toUpperCase().length() > 1;
    }

    private boolean hasSingleSpecialChar(String clearTextPassword) {
        char[] specialChars = clearTextPassword.toCharArray();
        for (Character character: specialChars) {
            if (!Character.isLetter(character) && !Character.isDigit(character)){
                return true;
            }
        }
        return false;
    }
}
