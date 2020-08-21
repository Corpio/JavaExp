package lab01_07;

import java.util.Scanner;

public class Lab01_07 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //System.out.print("Please enter a year:");
        int year = reader.nextInt();
        reader.close();
        System.out.print(year);
        System.out.print((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0) ? " is " : " is not ");
        System.out.println("leap year!");
    }

}
