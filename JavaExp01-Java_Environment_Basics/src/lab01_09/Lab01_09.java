package lab01_09;

import java.util.Scanner;

public class Lab01_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入两个浮点数，以空格分隔：");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        scan.close();
        System.out.println("交换前：" + a + "\t" + b);
        double temp = a;
        a = b;
        b = temp;
        System.out.println("交换后：" + a + "\t" + b);
        double max = a > b ? a : b;
        double min = a < b ? a : b;
        System.out.println("最大值：" + max + "\t最小值" + min);
    }

}
