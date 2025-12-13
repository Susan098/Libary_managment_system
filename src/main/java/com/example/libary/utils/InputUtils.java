package com.example.libary.utils;

import java.util.Scanner;

public class InputUtils {
    public static final Scanner scanner = new Scanner(System.in);

    public static String readString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static int readInt(String message) {
        System.out.print(message);
        return Integer.parseInt(scanner.nextLine());
    }
}
