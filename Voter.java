package polling;
class Voter  {
	private int voterid;
	 private String name;
	 private String sex;
	 private int age;
	 private String area;



	 public int getVoterId() {
		return voterid;
	}
	public void setVoterId(int id) {
		this.voterid =voterid;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age=age;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public void run() {
}


	public static void main(String arg[]) {
		
}}
