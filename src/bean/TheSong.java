package bean;

public class TheSong {
	int id;
	String name;
	String date_create;
	int view;

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

	public String getDate_create() {
		return date_create;
	}

	public void setDate_create(String date_create) {
		this.date_create = date_create;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public TheSong(int id, String name, String date_create, int view) {
		super();
		this.id = id;
		this.name = name;
		this.date_create = date_create;
		this.view = view;
	}

	public TheSong() {
		super();
	}

	@Override
	public String toString() {
		return "id = " + id + "\nname = " + name + "\ndate_create = " + date_create + "\nview = " + view;
	}

}
