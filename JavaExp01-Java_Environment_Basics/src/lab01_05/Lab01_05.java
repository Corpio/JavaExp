package lab01_05;

public class Lab01_05 {

    public static void main(String[] args) {
        double x = 4;
        double y = (1 - Math.pow(x, 3)) / (-1 - Math.pow(x, 3)) / (-x * x + Math.sqrt(x) + 10) * 2 * x * x;
        System.out.println("x=" + x + ",y=" + y);
    }
}
