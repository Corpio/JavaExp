package lab01_10;

import java.util.Scanner;

public class Lab01_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入三个整数，以空格分隔：");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        double ave = (a + b + c) / 3.0;
        double var = ((a - ave) * (a - ave) + (b - ave) * (b - ave) + (c - ave) * (c - ave)) / 3.0;
        System.out.println("均值为" + ave + "，方差为" + var);
    }

}
