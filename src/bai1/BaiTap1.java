package bai1;

import java.util.Scanner;

public class BaiTap1 {

	public static void veTamGiac(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n = ");
		int n = Integer.parseInt(sc.nextLine());
		sc.close();
		veTamGiac(n);
	}
}
