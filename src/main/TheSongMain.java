package main;

import java.util.ArrayList;

import action.TheSongAction;
import bean.TheSong;

public class TheSongMain {

	public static void main(String[] args) {
		ArrayList<TheSong> list = new ArrayList<>();
		boolean check = true;
		do {
			int luachon = TheSongAction.menu();
			switch (luachon) {
			case 1:
				TheSongAction.input(list);
				break;
			case 2:
				TheSongAction.display(list);
				break;
			case 3:
				TheSongAction.timTheoId(list);
				break;
			case 4:
				TheSongAction.timTheoTen(list);
				break;
			case 5:
				System.out.println("Good bye!");
				check = false;
				break;
			}
		} while (check);

	}

}
