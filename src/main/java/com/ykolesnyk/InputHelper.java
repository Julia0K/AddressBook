package com.ykolesnyk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String textInput(String message) throws IOException {

        System.out.println(message);
        String text = reader.readLine();
        System.out.println("You entered " + text);

        return text;
    }
}
