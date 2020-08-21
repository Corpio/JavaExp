package lab01_08;
import java.util.Scanner;
public class Lab01_08 {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     // System.out.print("请输入圆锥的半径和高，以空格分隔：");
     double r=scan.nextDouble();
     double h=scan.nextDouble();
     scan.close();
     double s=Math.PI*r*r;
     double v=1.0/3*s*h;
     System.out.printf("basearea=%.6f,volume=%.6f",s,v);
    }
    
}
