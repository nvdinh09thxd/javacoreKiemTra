package bean;

public class TheSong {
	int id;
	String name;
	String dateCreate;
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

	public String getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(String dateCreate) {
		this.dateCreate = dateCreate;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public TheSong(int id, String name, String dateCreate, int view) {
		super();
		this.id = id;
		this.name = name;
		this.dateCreate = dateCreate;
		this.view = view;
	}

	public TheSong() {
		super();
	}

	@Override
	public String toString() {
		return "id = " + id + "\nname = " + name + "\ndateCreate = " + dateCreate + "\nview = " + view;
	}

}
