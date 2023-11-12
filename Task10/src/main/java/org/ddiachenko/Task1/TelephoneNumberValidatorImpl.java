package org.ddiachenko.Task1;

import java.io.*;

public class TelephoneNumberValidatorImpl implements TelephoneNumberValidator {

    @Override
    public void validate(String telephoneNumber) {
        if (telephoneNumber.matches(TelephoneNumberValidator.PHONE_FORMAT_BRACKETS) ||
                telephoneNumber.matches(TelephoneNumberValidator.PHONE_FORMAT)) {
            System.out.println(telephoneNumber);
        }
    }

    public void getValidaTelephoneNumbersFromFile(String filePth) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePth))) {
            String line;
            while ((line = br.readLine()) != null) {
                validate(line);
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
