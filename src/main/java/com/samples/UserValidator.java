package com.samples;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String NAME_PATTEREN = "^[A-Z]{1}[a-zA-Z]{2,}$";
    private static final String EMAIL_ADDRESS = "^[a-zA-Z0-9]+(.[a-zA-Z0-9]+)*@[a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,2})?$";
    private static final String POSTEL_CODE = "^[1-9]{1}[0-9]{2}[ ]?[0-9]{3}$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(NAME_PATTEREN);
        return pattern.matcher(fname).matches();
    }

    public boolean validateEmailAddress(String email) {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS);
        return pattern.matcher(email).matches();
    }

    public boolean validatePotelCode(String pincode) {
        Pattern pattern = Pattern.compile(POSTEL_CODE);
        return pattern.matcher(pincode).matches();
    }

    public boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(NAME_PATTEREN);
        return pattern.matcher(lname).matches();
    }
}
