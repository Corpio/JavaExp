package lab01_11;

import java.util.Scanner;

public class Lab01_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入三个数，以空格分隔：");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        boolean isIncreasing = b > a && c > b;
        boolean isDecreasing = b < a && c < b;
        System.out.print(a+" "+b+" "+c);
        System.out.print(isIncreasing || isDecreasing ? "是" : "不是");
        System.out.println("单调序列");
    }

}
