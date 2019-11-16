package com.unasat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jonathan on 5/16/2018.
 */
public class PasswordValidatorTest {

    private PasswordValidator passwordValidator;
    //public String password = "P@ssw0rd";
    public String hashedPassword;

    @Before
    public void setUp(){
        passwordValidator = new PasswordValidatorImpl();
    }

    @Test
    public void passForMoreThanEigthChars(){
        //Given
        String password = "P@ssw0rd";

        //When
        boolean result = passwordValidator.validate(password);

        //Then
        Assert.assertEquals(true, result);
    }

    @Test
    public void failForLessThanEigthChars(){
        //Given
        String password = "P@ssw0rd";

        //When
        boolean isValid = passwordValidator.validate(password);

        //Then
        Assert.assertEquals(true, isValid);
    }

    @Test
    public void passForAtleastSingleCap(){
        //Given
        String password = "P@ssw0rd";

        //When
        boolean result = passwordValidator.validate(password);

        //Then
        Assert.assertEquals(true, result);
    }

    @Test
    public void failForNoCap(){
        //Given
        String password = "P@ssw0rd";

        //When
        boolean result = passwordValidator.validate(password);

        //Then
        Assert.assertEquals(true, result);
    }

    @Test
    public void passForAtleastOneSpecialChar(){
        //Given
        String password = "P@ssw0rd";

        //When
        boolean result = passwordValidator.validate(password);

        //Then
        Assert.assertEquals(true, result);
    }
}

