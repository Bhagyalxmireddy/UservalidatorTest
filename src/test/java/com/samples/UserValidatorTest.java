package com.samples;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue()
    {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Bhagya");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenWithSplChar_ShouldReturnFalse()
    {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("bh@gya");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFisrtName_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("bhagya@123");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailAddress_WhenProper_ShouldReturnTure() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("abc@gamil.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPostelCode_WhenProper_ShouldReturnTure() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePotelCode("509 215");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPostelCode_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePotelCode("a45213");
        Assert.assertFalse(result);
    }
}
