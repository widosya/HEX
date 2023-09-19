package com.test.hex.data;

import java.io.*;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InputManager {

    public ArrayList<ArrayList<Byte>> data;
    public void init() {
        data = new ArrayList<>();
        try {
            File file = new File("E:\\projects\\HEX\\src\\com\\test\\hex\\data\\text.txt");
            InputStream input = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            this.data = reader
                    .lines()
                    .map(stringToBytes)
                    .collect(Collectors.toCollection(ArrayList::new));
            System.out.println("e");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    private Function<String, ArrayList<Byte>> stringToBytes = (line) -> {
        ArrayList<Byte> byteArrayList = new ArrayList<>();
        char[] charsArray = line.toCharArray();
        for (char c : charsArray){
            byteArrayList.add(Byte.valueOf((byte) c));
        }
        byteArrayList.add(Byte.valueOf("10"));
        return byteArrayList;
    };

}
