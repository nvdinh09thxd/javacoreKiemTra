package son_han.beansthesong;

import java.time.LocalDateTime;

public class BeansTheSong {
	private int id;
	private String name;
	private LocalDateTime date;
	private int view;

	public BeansTheSong() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public BeansTheSong(int id, String name, LocalDateTime date, int view) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.view = view;
	}

	@Override
	public String toString() {
		return "Id: " + this.id + "\nName: " + this.name + "\nDate=" + this.date + "\nView=" + this.view;
	}

}
