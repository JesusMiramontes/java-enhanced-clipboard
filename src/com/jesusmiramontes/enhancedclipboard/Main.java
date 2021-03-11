package com.jesusmiramontes.enhancedclipboard;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    static Data d = new Data();
    static String old_clipboard;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try{
            d.readFile();
        } catch (Exception e ){

        }
        System.out.println("---\n");
        d.printMapKeys();

        printValue(in.nextLine());
    }

    private static String getValueFromMap(String k){
        old_clipboard = Clipboard.getValue();
        return d.getValueByKey(k);
    }

    public static void printValue(String k){
        System.out.println("Your old clipboard: " + old_clipboard);
        System.out.println(getValueFromMap(k));
    }

}
