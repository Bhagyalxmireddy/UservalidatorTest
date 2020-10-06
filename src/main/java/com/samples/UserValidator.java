package com.samples;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String FIRST_NAME_PATTEREN = "^[A-Z]{1}[a-zA-Z]{2,}$";



    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTEREN);
        return pattern.matcher(fname).matches();
    }
}
