package com.company.L002;

public class POJO {
    public static void run(){
        int i = 0;
        long q = 100l, j = 100l, x = 100l;
        byte z = 0x06;
        short z1 = 017;

        System.out.println(i);
        System.out.println(q);
        System.out.println(j);
        System.out.println(x);
        System.out.println(z);
        System.out.println(z1);

        j = q + x;
        System.out.println(j);

        char symbol = 'f';
        System.out.println(symbol);

        symbol = '\u0052';
        System.out.println(symbol);

        float f1 = 0.25f, f2 = 4.52E6f, f3 = 2.7E-3f;
        double d = 5.0;

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(d);

        boolean b = 6 < 8;
        boolean b1 = 5 > 10;

        System.out.println(b);
        System.out.println(b1);

        String hello = "Hello";

        System.out.println(hello);

        Integer iVar = 1;
        Long iLong = 1l;
        Double iDouble = 0.1;
        Boolean iBool = true;
    }
}
