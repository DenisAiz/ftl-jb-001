package com.company.L020;

import java.nio.charset.StandardCharsets;

public class TypeConversion {

    private static void runStringToByte(){
        Byte b1 = new Byte("10");
        System.out.println(b1);

        String str1 = "111";
        Byte b2 = Byte.valueOf(str1);
        System.out.println(b2);

        byte b = 0;
        String s = "100";
        b = Byte.parseByte(s);
        System.out.println(b);

        String str2 = "123123";
        byte[] b3 = str2.getBytes();
        System.out.println(b3);

        String str3 = new String(b3);
        System.out.println(str3);

    }

    private static void runStringToInt(){
        String str1 = "1234";
        Integer i1 = new Integer(str1);
        Integer i2 = Integer.valueOf(str1);
        int i3 = Integer.parseInt(str1);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }

    private static void runStringToDouble(){
        Double dl = new Double("23.123");
        Double dl1 = Double.valueOf("1.7e8");
        double dl2 = Double.parseDouble("5.8");

        System.out.println(dl);
        System.out.println(dl1);
        System.out.println(dl2);
    }

    private static void runStringToBoolean(){
        Boolean b1 = Boolean.valueOf("true");
        Boolean b2 = Boolean.valueOf("false");
        Boolean b3 = Boolean.valueOf("yes");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }

    public static void run(){
        runStringToByte();
        runStringToInt();
        runStringToDouble();
        runStringToBoolean();
    }
}
