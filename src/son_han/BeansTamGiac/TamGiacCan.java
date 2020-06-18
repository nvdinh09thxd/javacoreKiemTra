package son_han.BeansTamGiac;

import java.util.Scanner;

public class TamGiacCan {
	private int n;

	public TamGiacCan() {
		// TODO Auto-generated constructor stub
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public TamGiacCan(int n) {
		super();
		this.n = n;
	}

	public void veTamGiacCan() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap chieu cao n: ");
		boolean cont = false;
		do {
			try {
				n = Integer.parseInt(input.nextLine());
				if (n < 1) {
					throw new TamGiacCanException("Nhap n > 0!!!");
				}
			} catch (NumberFormatException e) {
				cont = true;
				System.out.println("Ban phai nhap so!!!");
			} catch (TamGiacCanException e) {
				cont = true;
				System.out.println(e.getMessage());
			}
		} while (cont);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
