package org.ddiachenko.Task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonGenerator {
    List<User> userList = new ArrayList<>();

    private void createUsersFromFile(String inputFilePath) {

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            int lineCounter = 0;
            while ((line = br.readLine()) != null) {
                if (lineCounter > 0) {
                    String[] userDetails = line.split(" ");
                    if (userDetails.length == 2) {
                        String name = userDetails[0];
                        int age = Integer.parseInt(userDetails[1]);
                        User user = new User(name, age);
                        userList.add(user);
                    }
                }
                lineCounter++;
            }
        } catch (IOException e) {
            System.out.println("NO FILE !!!");
        }
    }

    public void generateJsonWithUsers(String inputFilePath, String outputFilePath) {
        createUsersFromFile(inputFilePath);
        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter fileWriter = new FileWriter(outputFilePath)) {
            fileWriter.write(gson1.toJson(userList));
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
