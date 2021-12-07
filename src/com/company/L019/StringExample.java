package com.company.L019;

import java.util.Locale;
import java.util.stream.Stream;

public class StringExample {

    private static void runContentEquals(){

        System.out.println("runContentEquals");
        String str1 = "Добро пожаловать на FoodTech School";
        String str2 = "Сайт для изучения Java";

        StringBuffer str3 = new StringBuffer("Добро пожаловать на FoodTech School");
        StringBuffer str4 = new StringBuffer("Добро пожаловать");

        boolean result = str1.contentEquals(str3);
        System.out.println("str1 == str3: " + result);

        result = str2.contentEquals(str3);
        System.out.println("str2 == str3: " + result);

        result = str1.contentEquals(str4);
        System.out.println("str1 == str4: " + result);
    }

    private static void runEqualsIgnoreCase(){
        System.out.println("");
        System.out.println("runEqualsIgnoreCase");

        String str1 = "Добро пожаловать на FoodTech School";
        String str2 = str1;
        String str3 = "Добро пожаловать";
        String str4 = "ДОБРО пожаловать на FOODTECH School";

        boolean result = str1.equalsIgnoreCase(str2);
        System.out.println("str1 == str2: " + result);

        result = str2.equalsIgnoreCase(str3);
        System.out.println("str2 == str3: " + result);

        result = str3.equalsIgnoreCase(str4);
        System.out.println("str3 == str4: " + result);

        result = str1.equalsIgnoreCase(str4);
        System.out.println("str1 == str4: " + result);
    }

    public static void runCompareTo(){
        System.out.println("");
        System.out.println("runCompareTo");

        String str1 = "Я вызываю метод!";
        String str2 = "Я вызываю метод!";
        String str3 = "Я вызываю класс!";

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str1));
    }

    public static void runCompareToIgnoreCase(){
        System.out.println("");
        System.out.println("runCompareToIgnoreCase");

        String str1 = "Я вызываю метод!";
        String str2 = "Я Вызываю Метод!";
        String str3 = "Я вызываю класс!";

        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str2.compareToIgnoreCase(str3));
        System.out.println(str3.compareToIgnoreCase(str1));
    }

    private static void runToLowerCase(){
        System.out.println("");
        System.out.println("runToLowerCase");

        String str1 ="Я вызываю метод!";

        System.out.println(str1.toLowerCase());
    }

    private static void runToUpperCase(){
        System.out.println("");
        System.out.println("runToUpperCase");

        String str1 ="Я вызываю метод!";

        System.out.println(str1.toUpperCase());
    }

    private static void runConcat(){
        System.out.println("");
        System.out.println("runConcat");

        String str1 = "Я вызываю метод ";
        str1 = str1.concat("и класс");

        System.out.println(str1);
    }

    private static void runMatches(){
        System.out.println("");
        System.out.println("runMatches");

        String str1 = "Добро пожаловать на FoodTech School";

        System.out.println(str1.matches("(.*)FoodTech(.*)"));
        System.out.println(str1.matches("FoodTech"));
        System.out.println(str1.matches("Добро(.*)"));
    }

    private static void runContains(){
        System.out.println("");
        System.out.println("runContains");

        String str1 = "last in first out";

        System.out.println(str1.contains("last"));
        System.out.println(str1.contains("qwe"));
    }

    private static void runRegionMatches(){
        System.out.println("");
        System.out.println("runRegionMatches");

        String str1 = "Добро пожаловать на FoodTech School",
                str2 = "FoodTech School",
                str3 = "Java",
                str4 = "FOODTECH SCHOOL";

        System.out.println(str1.regionMatches(20, str2, 0, 8));
        System.out.println(str1.regionMatches(20, str3, 0, 8));
        System.out.println(str1.regionMatches(true,20, str4, 0, 8));
    }

    private static void runStartWith(){
        System.out.println("");
        System.out.println("runStartWith");

        String str1 = "Добро пожаловать на FoodTech School",
                str2 = "Добро",
                str3 = "Java",
                str4 = "FOODTECH SCHOOL";

        System.out.println(str1.startsWith(str2));
        System.out.println(str1.startsWith(str3));
        System.out.println(str1.startsWith(str4));
    }

    private static void runEndWith(){
        System.out.println("");
        System.out.println("runEndWith");

        String str1 = "Добро пожаловать на FoodTech School",
                str2 = "School",
                str3 = "Java",
                str4 = "FOODTECH SCHOOL";

        System.out.println(str1.endsWith(str2));
        System.out.println(str1.endsWith(str3));
        System.out.println(str1.endsWith(str4));
    }

    private static void runLines(){
        String str1 = "sfsdfsd\n" +
                "sfsdfsd\n" +
                "sfsdfsd\n" +
                "sfsdfsd\n" +
                "ssssaaaaa\n";

        System.out.println(str1);

        Stream<String> lines = str1.lines();
        lines.forEach(System.out::println);

        System.out.println(lines);
    }

    public static void run(){
        runContentEquals();
        runEqualsIgnoreCase();
        runCompareTo();
        runCompareToIgnoreCase();
        runToLowerCase();
        runToUpperCase();
        runConcat();
        runMatches();
        runContains();
        runRegionMatches();
        runStartWith();
        runEndWith();
        runLines();
    }
}
