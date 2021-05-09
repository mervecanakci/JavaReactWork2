package JavaReactWork2;
public class AllCourse {

	private String name;
	private int id;
	private String detail;
	private String teacher;
	private String price;
	
	public AllCourse() {
		
	}
	public AllCourse(String name, int id, String detail, String teacher, String price) {
		super();
		this.name = name;
		this.id = id;
		this.detail = detail;
		this.teacher = teacher;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	

	
}


