package task10;

public class no1 {
	
	private String name;
	private int age;
	
	public no1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
no1 n = new no1("pavithra", 25);
System.out.println("Name is "+n.getName());
System.out.println("Age is "+n.getAge());
	}

}
