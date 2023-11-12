package org.ddiachenko.Task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonGeneratorTest {

    public static void main(String[] args) {
        new JsonGenerator().generateJsonWithUsers("path to iput file",
                "path to output file");
    }
}
