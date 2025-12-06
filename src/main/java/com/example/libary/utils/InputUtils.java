package com.example.libary.utils;

import java.util.Scanner;

public class InputUtils {
    private static Scanner sc = new Scanner(System.in);

    public static String getString(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static int getInt(String message) {
        System.out.print(message);
        return sc.nextInt();
    }
}
