package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово, чтобы проверить является ли оно палиндромом: ");
        String s = scanner.nextLine();

        if(s.equalsIgnoreCase((new StringBuilder(s)).reverse().toString()))
            System.out.print("Да");
        else
            System.out.print("Нет");
    }
}
