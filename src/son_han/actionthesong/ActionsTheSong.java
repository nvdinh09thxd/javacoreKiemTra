package son_han.actionthesong;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import son_han.beansthesong.BeansTheSong;
import son_han.beansthesong.TheSongException;

public class ActionsTheSong {
	public ArrayList<BeansTheSong> inputData() {
		ArrayList<BeansTheSong> thesong = new ArrayList<BeansTheSong>();
		Scanner input = new Scanner(System.in);
		boolean cont = false;
		int n = 0;
		do {
			try {
				System.out.println("Moi ban nhap n: ");
				n = Integer.parseInt(input.nextLine());
				if (n < 1) {
					throw new TheSongException("Ban phai nhap n > 0 !!!");
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

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin phan tu thu " + (i + 1) + " : ");
			int id = 0;
			do {
				try {
					System.out.println("Id: ");
					id = Integer.parseInt(input.nextLine());
					if (id < 0) {
						throw new TheSongException("Ban phai nhap vao so > 0");
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
			System.out.println("Name: ");
			String name = input.nextLine();
			LocalDateTime date = LocalDateTime.now();
			System.out.println("Date create: " + date);
			int view = 0;
			do {
				try {
					System.out.println("View: ");
					view = Integer.parseInt(input.nextLine());
					if (view < 0) {
						throw new TheSongException("Ban phai nhap vao so > 0");
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
			BeansTheSong objthesong = new BeansTheSong(id, name, date, view);
			thesong.add(objthesong);
		}

		return thesong;
	}

	public void displayData(ArrayList<BeansTheSong> thesong) {
		System.out.println("Thong tin bai hat");
		for (BeansTheSong beansTheSong : thesong) {
			System.out.println(beansTheSong);
			System.out.println("-------------------");
		}
	}

	public void timId(ArrayList<BeansTheSong> thesong) {
		Scanner input = new Scanner(System.in);
		boolean cont = false;
		int inputId = 0;
		do {
			try {
				System.out.println("Nhap id can tim: ");
				inputId = Integer.parseInt(input.nextLine());
				if (inputId < 0) {
					throw new TheSongException("Ban phai nhap vao so > 0");
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
		for (BeansTheSong beansTheSong : thesong) {
			if (inputId == beansTheSong.getId()) {
				System.out.println(beansTheSong);
			}
		}
	}

	public void timName(ArrayList<BeansTheSong> thesong) {
		Scanner input = new Scanner(System.in);
		boolean cont = false;
		String inputName = " ";
		String name = " ";
		System.out.println("Nhap id can tim: ");
		inputName = input.nextLine();
		for (BeansTheSong beansTheSong : thesong) {
			name = beansTheSong.getName();
			if (inputName.equalsIgnoreCase(name)) {
				System.out.println(beansTheSong);
			}
		}
	}
}
