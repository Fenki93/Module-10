package org.ddiachenko.Task1;

import java.io.File;

public interface TelephoneNumberValidator {

    String PHONE_FORMAT = "\\(\\d{3}\\) \\d{3}-\\d{4}";
    String PHONE_FORMAT_BRACKETS = "\\d{3}-\\d{3}-\\d{4}";
    String FILE_PATH = "J:/GoIT/Task10/src/main/java/org/ddiachenko/Task1/file.txt";

    void validate(String telephoneNumber);

}
