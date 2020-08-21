import java.util.Scanner;

public class Lab01_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=m; i++){
			sum += i;
		}
		
		System.out.println("sum="+sum);
	}

}
