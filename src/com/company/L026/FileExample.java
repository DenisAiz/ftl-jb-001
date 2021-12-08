package com.company.L026;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class FileExample {

    public static String readUrl(String urlString) throws IOException {
        URL url = new URL(urlString);
        URLConnection urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(urlConnection.getInputStream())
        );

        StringBuilder stringBuilder = new StringBuilder();
        String inputLine;

        while ((inputLine = bufferedReader.readLine()) != null){
            stringBuilder.append(inputLine);
        }
        bufferedReader.close();
        return stringBuilder.toString();
    }

    public static void writeFile(String path, String content) throws IOException {
        File file = new File(path);
        FileWriter writer = new FileWriter(file);
        writer.write(content);
        writer.close();
        System.out.println(file.getAbsolutePath());
    }

    public static String readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
        String response = "";

        while (scanner.hasNextLine()){
            response += scanner.nextLine();
        }

        fileReader.close();
        return response;
    }

    public static void run() throws IOException {
        String url = "Https://ya.ru";
        String content = readUrl(url);
        System.out.println(content);

        writeFile("ya.txt", content);
        System.out.println(readFile("ya.txt"));
    }
}
