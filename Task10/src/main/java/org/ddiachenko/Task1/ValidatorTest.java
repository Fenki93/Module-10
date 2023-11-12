package org.ddiachenko.Task1;

public class ValidatorTest {

    public static void main(String[] args){
        TelephoneNumberValidatorImpl tnf = new TelephoneNumberValidatorImpl();
        tnf.getValidaTelephoneNumbersFromFile("path to file");
    }
}
