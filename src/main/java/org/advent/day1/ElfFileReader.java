package org.advent.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ElfFileReader {

    public static void main(String[] args) {
        System.out.println("hello");

        try (BufferedReader br = new BufferedReader(new FileReader(ClassLoader.getSystemResource("day1-elf-calories.txt").getPath()))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
