package mypackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class index {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用方法: java mypackage.index <入力ファイル> <出力ファイル>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String reversedLine = reverseString(line);
                writer.write(reversedLine);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String reverseString(String str) {
        StringBuilder reverse = new StringBuilder(str);
        return reverse.reverse().toString();
    }
}
