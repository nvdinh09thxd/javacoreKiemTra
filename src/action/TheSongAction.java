package action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import bean.TheSong;
import exception.NumberException;

public class TheSongAction {
	static Scanner sc = new Scanner(System.in);
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

	public static String nhapChuoi(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}

	public static int nhapSoDuong(String msg, String err) {
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print(msg);
				n = Integer.parseInt(sc.nextLine());
				if (n <= 0)
					throw new NumberException(err);
				check = false;
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Vui long nhap dung dinh dang so!");
			}
		} while (check);
		return n;
	}
	
	public static int nhapSoKhongAm(String msg, String err) {
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print(msg);
				n = Integer.parseInt(sc.nextLine());
				if (n < 0)
					throw new NumberException(err);
				check = false;
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Vui long nhap dung dinh dang so!");
			}
		} while (check);
		return n;
	}

	public static boolean isId(ArrayList<TheSong> list, int id) {
		for (TheSong bh : list) {
			if (id == bh.getId())
				return true;
		}
		return false;
	}

	public static String ngayHienTai() {
		String date = sdf.format(new Date());
		return date;
	}

	public static void input(ArrayList<TheSong> list) {
		int n = nhapSoKhongAm("Nhap so luong bai hat: ", "Vui long nhap so luong bai hat lon hon hoac bang 0!");
		for (int i = 0; i < n; i++) {
			int maBH = 0;
			System.out.println("Nhap thong tin cho bai hat thu " + (i + 1) + ": ");
			boolean check = true;
			do {
				try {
					maBH = nhapSoDuong("Nhap ma bai hat: ", "Vui long nhap ma bai hat la so duong!");
					if (isId(list, maBH))
						throw new NumberException("Ma bai hat nay da ton tai!");
					check = false;
				} catch (NumberException e) {
					System.out.println(e.getMessage());
				}
			} while (check);
			String tenBH = nhapChuoi("Nhap ten bai hat: ");
			String date = ngayHienTai();
			int view = nhapSoKhongAm("Nhap luot xem: ", "Vui long nhap luot xem lon hon hoac bang 0!");
			TheSong bh = new TheSong(maBH, tenBH, date, view);
			list.add(bh);
		}
	}

	public static void display(ArrayList<TheSong> list) {
		if (list.size() > 0) {
			for (TheSong bh : list) {
				System.out.println(bh);
				System.out.println("========================");
			}
		} else
			System.out.println("Khong co bai hat nao!");
	}

	public static void timTheoId(ArrayList<TheSong> list) {
		int id = nhapSoDuong("Nhap ma bai hat muon tim kiem: ", "Vui long nhap ma bai hat la so duong!");
		TheSong bh = searchById(list, id);
		if (bh != null) {
			System.out.println("Ket qua tim kiem:");
			System.out.println(bh);
		} else
			System.out.println("Khong tim thay");
	}

	public static void timTheoTen(ArrayList<TheSong> list) {
		String name = nhapChuoi("Nhap ten bai hat muon tim kiem: ");
		TheSong bh = searchByName(list, name);
		if (bh != null) {
			System.out.println("Ket qua tim kiem:");
			System.out.println(bh);
		} else
			System.out.println("Khong tim thay");
	}

	public static TheSong searchById(ArrayList<TheSong> list, int id) {
		for (TheSong bh : list) {
			if (id == bh.getId())
				return bh;
		}
		return null;
	}

	public static TheSong searchByName(ArrayList<TheSong> list, String name) {
		for (TheSong bh : list) {
			if (name.equalsIgnoreCase(bh.getName()))
				return bh;
		}
		return null;
	}

	public static int menu() {
		System.out.println("----------------------------");
		System.out.println("--1. Nhap du lieu");
		System.out.println("--2. Xuat du lieu");
		System.out.println("--3. Tim theo id");
		System.out.println("--4. Tim theo name");
		System.out.println("--5. Thoat");
		System.out.println("----------------------------");
		boolean check = true;
		int luachon = 0;
		do {
			try {
				System.out.print("Nhap thao tac lua chon: ");
				luachon = Integer.parseInt(sc.nextLine());
				if (luachon < 1 || luachon > 5)
					throw new NumberException("Vui long nhap lua chon tu 1 den 5!");
				check = false;
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Vui long nhap dung dinh dang so!");
			}
		} while (check);
		return luachon;
	}
}
