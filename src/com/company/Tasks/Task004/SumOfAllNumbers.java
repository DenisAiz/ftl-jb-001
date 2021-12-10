package com.company.Tasks.Task004;

import java.util.Scanner;

public class SumOfAllNumbers {

    public static void run(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");

        int number = scanner.nextInt();
        int result = 0;

        for (int i = 0; i <= number; i++){
            result = result + i;
        }
        System.out.println(result + " - Сумма чисел");
    }
}
