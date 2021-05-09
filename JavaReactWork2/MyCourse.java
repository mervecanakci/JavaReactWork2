package JavaReactWork2;
public class MyCourse {

	private String name;
	private String teacher;
	private double percentageOfCompletion;
	
	public MyCourse() {
		
	}
	
	public MyCourse(String name, String teacher, double percentageOfCompletion) {
		super();
		this.name = name;
		this.teacher = teacher;
		this.percentageOfCompletion = percentageOfCompletion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public double getPercentageOfCompletion() {
		return percentageOfCompletion;
	}

	public void setPercentageOfCompletion(double percentageOfCompletion) {
		this.percentageOfCompletion = percentageOfCompletion;
	}
	
	
	
	
	
	
	
	
	
}
