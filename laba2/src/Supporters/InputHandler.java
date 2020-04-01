package Supporters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputHandler {

    public String inputWithMessage(String message) {
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public int inputIntWithMessage(String message) {
        try {
            System.out.println(message);
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            return in.read();
        } catch (IOException e) {
            System.out.println("Something is wrong with input");
            e.printStackTrace();
        }
        return -1;
    }
}
