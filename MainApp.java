package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập cảnh a");
		int a = sc.nextInt();
		System.out.println("Nhập cảnh b");
		int b = sc.nextInt();
		System.out.println("Nhập cảnh c");
		int c = sc.nextInt();
		if(a + b > c && a + c > b && b + c > a) {
			System.out.println("Đây là tam giác");
		}else {
			System.out.println("Đây không phải là tam giác");
		}
		
		

	}

}
