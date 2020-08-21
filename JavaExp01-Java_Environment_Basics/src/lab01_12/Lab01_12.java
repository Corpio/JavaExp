package lab01_12;

import java.util.Scanner;

public class Lab01_12 {

    public static void main(String[] args) {
//        char surname = '王', givenName = '刚';
//        System.out.println(surname+"的unicode是："+(int)(surname));
//        System.out.println(givenName+"的unicode是："+(int)(givenName));
//        Scanner scan = new Scanner(System.in);
//        System.out.print("请输入一个整数：");
//        int num = scan.nextInt();
//        scan.close();
//        surname = (char) (surname + num);
//        givenName = (char) (givenName + num);
//        System.out.println("新的字符是：" + surname + givenName);
    	
    	Scanner sc = new Scanner(System.in);
    	String name = sc.next();
    	for(int i=0; i<name.length(); i++){
    		System.out.println("the unicode value of "+name.charAt(i)+" is "+(int)(name.charAt(i)));
    	}
    	
    	int increment= sc.nextInt();
    	for(int i=0; i<name.length(); i++){
    		System.out.println("the new character is "+(char)(name.charAt(i)+increment)+" = "+(name.charAt(i)+increment));
    	}
    	
    	
    }

}
