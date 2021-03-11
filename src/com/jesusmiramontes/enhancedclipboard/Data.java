package com.jesusmiramontes.enhancedclipboard;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Data {
    static Map<String, String> map = new TreeMap<>();

    public static Map<String, String> getMap() {
        return map;
    }

    public static void setMap(Map<String, String> map) {
        Data.map = map;
    }

    public void printMapKeys(){
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key);
        }
    }

    public String getValueByKey(String k){
        String output = map.get(k);
        Clipboard.setValue(output);
        return output;
    }

    public void readFile() throws FileNotFoundException {
        File file = new File("test.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            splitLine(sc.nextLine());
    }

    private void splitLine(String line){
        String[] splitted = line.split(";");
        map.put(splitted[0],splitted[1]);
    }
}

