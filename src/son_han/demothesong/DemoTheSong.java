package son_han.demothesong;

import java.util.ArrayList;
import java.util.Scanner;

import son_han.actionthesong.ActionsTheSong;
import son_han.beansthesong.BeansTheSong;
import son_han.beansthesong.TheSongException;

public class DemoTheSong {

	public static void main(String[] args) {
		ActionsTheSong thesongdemo = new ActionsTheSong();
		ArrayList<BeansTheSong> thesong = new ArrayList<BeansTheSong>();
		Scanner input = new Scanner(System.in);
		boolean cont = false;

		do {
			// boolean cont = false;
			int m = 0;
			System.out.println("MENU" + "\n1. Nhap du lieu" + "\n2. Xuat du lieu" + "\n3. Tim theo id"
					+ "\n4. Tim theo name" + "\n5. Thoat");
			do {
				try {
					System.out.println("Moi chon chuong trinh : ");
					m = Integer.parseInt(input.nextLine());
					if (m > 5 || m < 1) {
						throw new TheSongException("Ban phai nhap trong khoang 1 den 5 !!!");
					}
					cont = false;
				} catch (NumberFormatException e) {
					cont = true;
					System.out.println("Ban phai nhap so !!!");
				} catch (TheSongException e) {
					cont = true;
					System.out.println(e.getMessage());
				}
			} while (cont);
			switch (m) {
			case 1:
				thesongdemo.inputData();
				cont = true;
				break;
			case 2:
				thesongdemo.displayData(thesong);
				cont = true;
				break;
			case 3:
				thesongdemo.timId(thesong);
				cont = true;
				break;
			case 4:
				thesongdemo.timName(thesong);
				cont = true;
				break;
			case 5:
				break;
			}
		} while (cont);

	}

}
