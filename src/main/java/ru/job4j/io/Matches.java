package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        int count = 11;
        boolean isFirst = true;
        String playerNumber = "1";
        Scanner input = new Scanner(System.in);
        while (count > 0) {
            playerNumber = isFirst ? "1" : "2";
            System.out.println("Игрок № " + playerNumber + " делает ход:");
            int select = Integer.valueOf(input.nextLine());
            count = count - select;
            System.out.println("На столе осталось " + count + " спичек");
            isFirst = !isFirst;
        }
        System.out.println("Победил игрок №" + playerNumber);
    }
}
